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

import com.pingunaut.wicket.chartjs.chart.IDoughnut;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;
import com.pingunaut.wicket.chartjs.options.DoughnutChartOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Doughnut provides a simple implementation of chart.js doughnut
 * chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#doughnutChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Doughnut extends AbstractSimpleChart<DoughnutChartData, DoughnutChartOptions> implements IDoughnut {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6898362145345731457L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public DoughnutChartOptions getOptions() {
		if (options == null) {
			options = new DoughnutChartOptions();
		}
		return options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.impl.AbstractSimpleChart#getData()
	 */
	@Override
	public List<DoughnutChartData> getData() {
		if (data == null) {
			data = new ArrayList<DoughnutChartData>();
		}
		return data;
	}
}
