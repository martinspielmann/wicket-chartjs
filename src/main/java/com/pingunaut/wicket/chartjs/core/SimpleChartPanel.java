/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.ISimpleChart;
import com.pingunaut.wicket.chartjs.core.panel.DoughnutChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PieChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PolarAreaChartPanel;
import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Class SimpleChartPanel is a prototype for
 * <ul>
 * <li>{@link DoughnutChartPanel}</li>
 * <li>{@link PieChartPanel}</li>
 * <li>{@link PolarAreaChartPanel}</li>
 * </ul>
 * 
 * @param <C>
 *            the generic type of the corresponding chart
 * @param <D>
 *            the generic type of the data displayed by the chart
 * @param <O>
 *            the generic type of the chart's options
 */
public abstract class SimpleChartPanel<C extends ISimpleChart<D, O>, D extends SimpleColorValueChartData, O extends AbstractChartOptions> extends AbstractChartPanel<C, O> {

  private static final long serialVersionUID = 2899070514574123978L;

  /**
   * Instantiates a new simple chart panel.
   * 
   * @param id
   *            the markup id
   * @param c
   *            the IModel of a {@link ISimpleChart}
   */
  public SimpleChartPanel(String id, IModel<C> c) {
    super(id, c);
  }

  /**
   * Instantiates a new simple chart panel.
   * 
   * @param id
   *            the markup id
   * @param c
   *            the IModel of a {@link ISimpleChart}
   * @param width
   *            the width
   * @param height
   *            the height
   */
  public SimpleChartPanel(String id, IModel<C> c, int width, int height) {
    super(id, c, width, height);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.pingunaut.wicket.chartjs.core.AbstractChartPanel#generateChart()
   */
  @Override
  public String generateChart() {
    String dataString = null;
    String optionString = null;
    try {
      dataString = getChart().getMapper().writeValueAsString(getChart().getData());
      optionString = getChart().getMapper().writeValueAsString(getChart().getOptions());
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    String js = "var " + getChartCanvas().getMarkupId() + " = WicketCharts['" + getChartCanvas().getMarkupId() + "']." + getChart().getClass().getSimpleName() + "(" + dataString
      + ", " + optionString + ");";
    return js;
  }
}
