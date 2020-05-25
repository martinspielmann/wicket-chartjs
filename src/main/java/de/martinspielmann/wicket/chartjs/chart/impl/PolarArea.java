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

import de.martinspielmann.wicket.chartjs.chart.IPolarArea;
import de.martinspielmann.wicket.chartjs.data.PolarAreaChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.PolarAreaDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.PolarAreaChartOptions;

/**
 * The Class PolarArea provides a simple implementation of chart.js polar area chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#polarAreaChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class PolarArea extends
    AbstractChart<PolarAreaChartData<PolarAreaDataset>, PolarAreaChartOptions, PolarAreaDataset>
    implements IPolarArea {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  private final PolarAreaChartData<PolarAreaDataset> data = new PolarAreaChartData<>();
  private final PolarAreaChartOptions options = new PolarAreaChartOptions();

  @Override
  public PolarAreaChartOptions getOptions() {
    return options;
  }

  @Override
  public PolarAreaChartData<PolarAreaDataset> getData() {
    return data;
  }

  @Override
  public ChartType getType() {
    return ChartType.POLAR_AREA;
  }
}
