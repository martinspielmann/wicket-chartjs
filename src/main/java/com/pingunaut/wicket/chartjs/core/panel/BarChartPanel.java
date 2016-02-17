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

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.core.js.ChartType;
import com.pingunaut.wicket.chartjs.data.BarData;

/**
 * The Class BarChartPanel provides a simple implementation of chart.js bar
 * chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#barChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class BarChartPanel extends ChartPanel {

	private static final long serialVersionUID = -7460695892808795726L;


	/**
	 * Instantiates a new bar chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param model
	 *            the IModel of a {@link BarData}
	 */
	public BarChartPanel(String id, IModel<BarData> model) {

		super(id, ChartType.BAR, model);
	}

}
