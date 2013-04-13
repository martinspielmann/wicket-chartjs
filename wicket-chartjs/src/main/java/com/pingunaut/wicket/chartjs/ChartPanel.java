package com.pingunaut.wicket.chartjs;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public abstract class ChartPanel<D extends AbstractChartData, O extends AbstractChartOptions> extends Panel {

	private static final long serialVersionUID = -5882448897795445250L;
	private final WebMarkupContainer wmc;

	private D data;
	private O options;
	private final ObjectMapper mapper = new ObjectMapper();

	public ChartPanel(String id) {
		super(id);
		wmc = new WebMarkupContainer("chart");
	}

	public ChartPanel(String id, IModel<?> model) {
		super(id, model);
		wmc = new WebMarkupContainer("chart", model);
	}

	public ChartPanel(String id, IModel<?> model, final int width, final int height) {
		super(id, model);
		wmc = new WebMarkupContainer("chart") {
			private static final long serialVersionUID = 3385419188467369696L;

			@Override
			protected void onComponentTag(ComponentTag tag) {
				super.onComponentTag(tag);
				tag.append("width", String.valueOf(width), " ");
				tag.append("height", String.valueOf(height), " ");
			}
		};
	}

	public ChartPanel(String id, final int width, final int height) {
		super(id);
		wmc = new WebMarkupContainer("chart") {
			private static final long serialVersionUID = 3385419188467369696L;

			@Override
			protected void onComponentTag(ComponentTag tag) {
				super.onComponentTag(tag);
				tag.append("width", String.valueOf(width), " ");
				tag.append("height", String.valueOf(height), " ");
			}
		};
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(JavaScriptHeaderItem.forReference(JQueryResourceReference.get()));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(ChartPanel.class, "Chart.min.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(ChartPanel.class, "excanvas.compiled.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(ChartPanel.class, "bridge.js")));
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(wmc);
		wmc.setOutputMarkupId(true);
		wmc.add(new BuildChartBehavior());
	}

	public ObjectMapper getMapper() {
		return mapper;
	}

	public WebMarkupContainer getChartCanvas() {
		return wmc;
	}

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

	public O getOptions() {
		return options;
	}

	public void setOptions(O options) {
		this.options = options;
	}
}
