/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package de.martinspielmann.wicket.chartjs.chart;

import de.martinspielmann.wicket.chartjs.data.PieChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.PieDataset;
import de.martinspielmann.wicket.chartjs.options.PieChartOptions;

/**
 * The Interface IPie provides a simple implementation of chart.js pie chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#pieChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public interface IPie extends IChart<PieChartData<PieDataset>, PieChartOptions, PieDataset> {

}
