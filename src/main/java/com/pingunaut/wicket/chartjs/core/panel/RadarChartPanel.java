/*******************************************************************************
 * Copyright 2013 Martin Spielmann
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

import com.pingunaut.wicket.chartjs.chart.impl.Radar;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;
import com.pingunaut.wicket.chartjs.data.RadarChartData;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataSet;
import com.pingunaut.wicket.chartjs.options.RadarChartOptions;

/**
 * The Class RadarChartPanel provides a simple implementation of chart.js radar
 * chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#radarAreaChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class RadarChartPanel extends DataSetChartPanel<Radar, RadarChartData<RadarDataSet>, RadarChartOptions, RadarDataSet> {

	private static final long serialVersionUID = -7460695892808795726L;

	/**
	 * Instantiates a new radar chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link Radar}
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public RadarChartPanel(String id, IModel<? extends Radar> c, 
            int width, int height) {
        
		super(id, c, width, height);
	}

	/**
	 * Instantiates a new radar chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link Radar}
	 */
	public RadarChartPanel(String id, IModel<? extends Radar> c) {
		super(id, c);
	}
}
