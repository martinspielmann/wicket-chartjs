/*******************************************************************************
 * Copyright 2016 Martin Spielmann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.core.panel;

import java.util.Objects;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.config.GlobalConfigs;
import com.pingunaut.wicket.chartjs.core.LabelledData;
import com.pingunaut.wicket.chartjs.core.Options;
import com.pingunaut.wicket.chartjs.core.js.ChartType;

public abstract class ChartPanel extends Panel {

	private static final long serialVersionUID = 1L;

	private final WebMarkupContainer canvas = new WebMarkupContainer("canvas");
	private final IModel<? extends LabelledData<?>> data;
	private final IModel<Options> options;
	private final ChartType type;
	private static ObjectMapper mapper = GlobalConfigs.getMapper();

	public ChartPanel(String id, ChartType type, IModel<? extends LabelledData<?>> model, IModel<Options> options) {
		super(id, model);
		canvas.setOutputMarkupId(true);
		add(canvas);

		Objects.requireNonNull(type);
		Objects.requireNonNull(model);
		Objects.requireNonNull(options);

		this.data = model;
		this.options = options;
		this.type = type;
	}

	public ChartPanel(String id, ChartType type, IModel<? extends LabelledData<?>> model) {
		this(id, type, model, new Model<Options>(new Options()));
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(JavaScriptHeaderItem.forReference(JQueryResourceReference.get()));
		response.render(
				JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(ChartType.class, "Chart.js")));

		String dataString = null;
		String optionString = null;
		try {
			dataString = getMapper().writeValueAsString(data.getObject());
			optionString = getMapper().writeValueAsString(options.getObject());
			if(null==optionString){
				optionString="";
			}else{
				optionString = String.format(", options : %s", optionString);
			}
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		String js = String.format("var %s = new Chart($('#%s'), {type : '%s', data : %s%s});",
				getCanvas().getMarkupId(), getCanvas().getMarkupId(), type.getJsTypeName(), dataString, optionString);

		response.render(OnDomReadyHeaderItem.forScript(js));

	}

	public WebMarkupContainer getCanvas() {
		return canvas;
	}

	protected static ObjectMapper getMapper() {
		return mapper;
	}

	public IModel<? extends LabelledData<?>> getData() {
		return data;
	}

	public IModel<Options> getOptions() {
		return options;
	}

}
