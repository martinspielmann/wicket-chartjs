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

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.chart.IChart;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Class AbstractChartPanel provides the base panel holding the chart
 * rendering canvas element.
 * 
 * @param <C>
 *            the generic type of the chart
 */
public abstract class AbstractChartPanel<C extends IChart<O>, O extends AbstractChartOptions> extends Panel {

  private static final long serialVersionUID = -5882448897795445250L;

  /** The container holding the canvas. */
  private final WebMarkupContainer wmc;

  /** The width. */
  private int width;

  /** The height. */
  private int height;

  /** The chart. */
  private final IModel<C> chart;

  /**
   * Instantiates a new abstract chart panel.
   * 
   * @param id
   *            the markup id
   * @param c
   *            the IModel of the chart, rendered in this panel
   */
  public AbstractChartPanel(String id, IModel<C> c) {
    super(id, c);
    this.chart = c;
    wmc = new WebMarkupContainer("chart");
  }

  /**
   * Instantiates a new abstract chart panel.
   * 
   * @param id
   *            the markup id
   * @param c
   *            the IModel of the chart, rendered in this panel
   * @param width
   *            the width
   * @param height
   *            the height
   */
  public AbstractChartPanel(String id, IModel<C> c, final int width, final int height) {
    super(id);
    this.chart = c;
    this.width = width;
    this.height = height;
    wmc = new WebMarkupContainer("chart") {
      private static final long serialVersionUID = 3385419188467369696L;

      @Override
      protected void onComponentTag(ComponentTag tag) {
        super.onComponentTag(tag);
        tag.append("width", String.valueOf(width), " ");
        tag.append("height", String.valueOf(height), " ");
      }
    };
  }

  /**
   * Gets the width.
   * 
   * @return the width
   */
  public int getWidth() {
    return width;
  }

  /**
   * Gets the height.
   * 
   * @return the height
   */
  public int getHeight() {
    return height;
  }

  /**
   * Gets the chart.
   * 
   * @return the chart
   */
  public C getChart() {
    return chart.getObject();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.wicket.Component#onInitialize()
   */
  @Override
  protected void onInitialize() {
    super.onInitialize();
    add(wmc);
    wmc.setOutputMarkupId(true);
    wmc.add(new ChartBehavior());
  }

  /**
   * Gets the chart canvas.
   * 
   * @return the chart canvas
   */
  public WebMarkupContainer getChartCanvas() {
    return wmc;
  }

  /**
   * Generates chart.
   * 
   * @return the JavaScript which generates the canvas.
   *         {@link SimpleChartPanel} and {@link DataSetChartPanel} implement
   *         this method and do nearly the same:
   *         <ul>
   *         <li>the charts {@link ObjectMapper} converts data to js object</li>
   *         <li>the charts {@link ObjectMapper} converts options to js object
   *         </li>
   *         <li>initialize the chart canvas with the just created js objects</li>
   *         </ul>
   */
   public abstract String generateChart();
}
