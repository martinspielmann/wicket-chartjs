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
import de.martinspielmann.wicket.chartjs.chart.impl.Doughnut;
import de.martinspielmann.wicket.chartjs.core.AbstractChartPanel;
import de.martinspielmann.wicket.chartjs.data.DoughnutChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.DoughnutDataset;
import de.martinspielmann.wicket.chartjs.options.DoughnutChartOptions;

/**
 * The Class DoughnutChartPanel provides a simple implementation of chart.js doughnut chart
 *
 * @see <a href="http://www.chartjs.org/docs/#doughnutChart">chart.js docs</a>
 *
 * @author Martin Spielmann
 *
 */
public class DoughnutChartPanel extends
    AbstractChartPanel<Doughnut, DoughnutChartData<DoughnutDataset>, DoughnutChartOptions, DoughnutDataset> {

  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new doughnut chart panel.
   *
   * @param id the markup id
   * @param doughnutModel the IModel of a {@link Doughnut}
   */
  public DoughnutChartPanel(final String id, final IModel<? extends Doughnut> doughnutModel) {
    super(id, doughnutModel);
  }
}
