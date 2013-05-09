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
package com.pingunaut.wicket.chartjs.chart.impl;

import com.pingunaut.wicket.chartjs.chart.IRadar;
import com.pingunaut.wicket.chartjs.data.RadarChartData;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataSet;
import com.pingunaut.wicket.chartjs.options.RadarChartOptions;

/**
 * The Class Radar provides a simple implementation of chart.js radar chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#radarChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Radar extends AbstractDataSetChart<RadarChartData<RadarDataSet>, RadarChartOptions, RadarDataSet> implements IRadar {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 123723866473637510L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public RadarChartOptions getOptions() {
		if (options == null) {
			options = new RadarChartOptions();
		}
		return options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.impl.AbstractDataSetChart#getData()
	 */
	@Override
	public RadarChartData<RadarDataSet> getData() {
		if (data == null) {
			data = new RadarChartData<RadarDataSet>();
		}
		return data;
	}
}
