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

import de.martinspielmann.wicket.chartjs.chart.IBubble;
import de.martinspielmann.wicket.chartjs.data.BubbleChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.BubbleDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.BubbleChartOptions;

/**
 * The Class Bubble provides a simple implementation of chart.js Bubble chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#BubbleChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Bubble extends AbstractChart<BubbleChartData<BubbleDataset>, BubbleChartOptions, BubbleDataset>
    implements IBubble {

  private static final long serialVersionUID = 1L;

  private final BubbleChartData<BubbleDataset> data = new BubbleChartData<>();
  private final BubbleChartOptions options = new BubbleChartOptions();

  @Override
  public BubbleChartOptions getOptions() {
    return options;
  }

  @Override
  public BubbleChartData<BubbleDataset> getData() {
    return data;
  }

  @Override
  public ChartType getType() {
    return ChartType.BUBBLE;
  }

}
