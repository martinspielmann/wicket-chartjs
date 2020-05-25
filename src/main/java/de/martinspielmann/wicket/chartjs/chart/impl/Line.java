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

import de.martinspielmann.wicket.chartjs.chart.ILine;
import de.martinspielmann.wicket.chartjs.data.LineChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.LineDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.LineChartOptions;

/**
 * The Class Line provides a simple implementation of chart.js line chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#lineChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Line extends AbstractChart<LineChartData<LineDataset>, LineChartOptions, LineDataset>
    implements ILine {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  private final LineChartData<LineDataset> data = new LineChartData<>();
  private final LineChartOptions options = new LineChartOptions();

  @Override
  public LineChartOptions getOptions() {
    return options;
  }

  @Override
  public LineChartData<LineDataset> getData() {
    return data;
  }

  @Override
  public ChartType getType() {
    return ChartType.LINE;
  }


}
