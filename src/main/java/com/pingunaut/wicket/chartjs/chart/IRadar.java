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
package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.RadarChartData;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataSet;
import com.pingunaut.wicket.chartjs.options.RadarChartOptions;

/**
 * The Interface IRadar provides a simple implementation of chart.js radar chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#radarChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public interface IRadar extends IDataSetChart<RadarChartData<RadarDataSet>, RadarChartOptions, RadarDataSet> {

}
