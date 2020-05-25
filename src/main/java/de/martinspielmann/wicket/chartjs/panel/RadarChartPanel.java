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
package de.martinspielmann.wicket.chartjs.panel;

import org.apache.wicket.model.IModel;
import de.martinspielmann.wicket.chartjs.chart.impl.Radar;
import de.martinspielmann.wicket.chartjs.core.AbstractChartPanel;
import de.martinspielmann.wicket.chartjs.data.RadarChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.RadarDataset;
import de.martinspielmann.wicket.chartjs.options.RadarChartOptions;

/**
 * The Class RadarChartPanel provides a simple implementation of chart.js radar chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#radarAreaChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class RadarChartPanel extends
    AbstractChartPanel<Radar, RadarChartData<RadarDataset>, RadarChartOptions, RadarDataset> {

  private static final long serialVersionUID = 1L;


  /**
   * Instantiates a new radar chart panel.
   * 
   * @param id the markup id
   * @param radarModel the IModel of a {@link Radar}
   */
  public RadarChartPanel(String id, IModel<? extends Radar> radarModel) {
    super(id, radarModel);
  }
}
