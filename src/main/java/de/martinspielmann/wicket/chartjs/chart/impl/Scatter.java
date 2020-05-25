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
package de.martinspielmann.wicket.chartjs.chart.impl;

import de.martinspielmann.wicket.chartjs.chart.IScatter;
import de.martinspielmann.wicket.chartjs.data.ScatterChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.ScatterDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.ScatterChartOptions;

/**
 * The Class Scatter provides a simple implementation of chart.js Scatter chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#ScatterChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Scatter
    extends AbstractChart<ScatterChartData<ScatterDataset>, ScatterChartOptions, ScatterDataset>
    implements IScatter {

  private static final long serialVersionUID = 1L;

  private final ScatterChartData<ScatterDataset> data = new ScatterChartData<>();
  private final ScatterChartOptions options = new ScatterChartOptions();

  @Override
  public ScatterChartOptions getOptions() {
    return options;
  }

  @Override
  public ScatterChartData<ScatterDataset> getData() {
    return data;
  }

  @Override
  public ChartType getType() {
    return ChartType.SCATTER;
  }

}
