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

import de.martinspielmann.wicket.chartjs.chart.IMixed;
import de.martinspielmann.wicket.chartjs.data.MixedChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.AbstractDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.MixedChartOptions;

/**
 * The Class Mixed provides a simple implementation of chart.js mixed chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#barChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Mixed extends
    AbstractChart<MixedChartData<AbstractDataset>, MixedChartOptions, AbstractDataset>
    implements IMixed {

  private static final long serialVersionUID = 1L;

  private final MixedChartData<AbstractDataset> data = new MixedChartData<>();
  private final MixedChartOptions options = new MixedChartOptions();

  @Override
  public MixedChartOptions getOptions() {
    return options;
  }

  @Override
  public MixedChartData<AbstractDataset> getData() {
    return data;
  }

  @Override
  public ChartType getType() {
    return ChartType.MIXED;
  }

}
