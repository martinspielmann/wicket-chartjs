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

import de.martinspielmann.wicket.chartjs.chart.IArea;
import de.martinspielmann.wicket.chartjs.data.AreaChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.AreaDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.AreaChartOptions;

/**
 * The Class Area provides a simple implementation of chart.js Area chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#AreaChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Area extends AbstractChart<AreaChartData<AreaDataset>, AreaChartOptions, AreaDataset>
    implements IArea {

  private static final long serialVersionUID = 1L;

  private final AreaChartData<AreaDataset> data = new AreaChartData<>();
  private final AreaChartOptions options = new AreaChartOptions();

  @Override
  public AreaChartOptions getOptions() {
    return options;
  }

  @Override
  public AreaChartData<AreaDataset> getData() {
    return data;
  }

  @Override
  public ChartType getType() {
    return ChartType.AREA;
  }

}
