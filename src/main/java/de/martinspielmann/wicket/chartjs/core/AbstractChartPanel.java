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
package de.martinspielmann.wicket.chartjs.core;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import de.martinspielmann.wicket.chartjs.chart.IChart;
import de.martinspielmann.wicket.chartjs.data.AbstractChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.AbstractDataset;
import de.martinspielmann.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Class AbstractChartPanel provides the base panel holding the chart rendering canvas element.
 * 
 * @param <C> the generic type of the chart
 */
public abstract class AbstractChartPanel<C extends IChart<D, O, S>, D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractDataset>
    extends Panel {

  private static final long serialVersionUID = 1L;

  /** The chart. */
  private final IModel<? extends C> chartModel;

  /**
   * Instantiates a new abstract chart panel.
   * 
   * @param id the markup id
   * @param chartModel the IModel of the chart, rendered in this panel
   */
  public AbstractChartPanel(String id, IModel<? extends C> chartModel) {
    super(id, chartModel);
    this.chartModel = chartModel;
    WebMarkupContainer chartCanvas = new WebMarkupContainer("chart");
    add(chartCanvas);
    chartCanvas.setOutputMarkupId(true);
    chartCanvas.add(new ChartBehavior<>(chartModel));
  }

  /**
   * Gets the chart.
   * 
   * @return the chart
   */
  public C getChart() {
    return chartModel.getObject();
  }

}
