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

import de.martinspielmann.wicket.chartjs.chart.IRadar;
import de.martinspielmann.wicket.chartjs.data.RadarChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.RadarDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.RadarChartOptions;

/**
 * The Class Radar provides a simple implementation of chart.js radar chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#radarChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Radar extends
    AbstractChart<RadarChartData<RadarDataset>, RadarChartOptions, RadarDataset> implements IRadar {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  private final RadarChartData<RadarDataset> data = new RadarChartData<>();
  private final RadarChartOptions options = new RadarChartOptions();

  @Override
  public RadarChartOptions getOptions() {
    return options;
  }

  @Override
  public RadarChartData<RadarDataset> getData() {
    return data;
  }

  @Override
  public ChartType getType() {
    return ChartType.RADAR;
  }



}
