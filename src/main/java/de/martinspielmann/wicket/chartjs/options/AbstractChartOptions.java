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
package de.martinspielmann.wicket.chartjs.options;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.options.element.Elements;
import de.martinspielmann.wicket.chartjs.options.legend.Legend;
import de.martinspielmann.wicket.chartjs.options.properties.Animation;
import de.martinspielmann.wicket.chartjs.options.properties.Layout;
import de.martinspielmann.wicket.chartjs.options.properties.Scales;
import de.martinspielmann.wicket.chartjs.options.properties.Title;
import de.martinspielmann.wicket.chartjs.options.tooltip.Tooltip;

/**
 * The Class AbstractChartOptions provides some basic options, that are available for all kinds of
 * charts.
 *
 * @author Martin Spielmann
 */
public abstract class AbstractChartOptions implements Serializable {

  private static final long serialVersionUID = 1L;

  private Animation animation;
  private Layout layout;
  private Legend legend;
  private Title title;
  private Tooltip tooltips;
  private Elements elements;
  private Scales scales;

  public Animation getAnimation() {
    return animation;
  }

  public void setAnimation(Animation animation) {
    this.animation = animation;
  }

  public Layout getLayout() {
    return layout;
  }

  public void setLayout(Layout layout) {
    this.layout = layout;
  }

  public Legend getLegend() {
    return legend;
  }

  public void setLegend(Legend legend) {
    this.legend = legend;
  }

  public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public Tooltip getTooltips() {
    return tooltips;
  }

  public void setTooltips(Tooltip tooltips) {
    this.tooltips = tooltips;
  }

  public Elements getElements() {
    return elements;
  }

  public void setElements(Elements elements) {
    this.elements = elements;
  }

  /**
   * @return the scales
   */
  public Scales getScales() {
    return scales;
  }

  /**
   * @param scales the scales to set
   */
  public void setScales(Scales scales) {
    this.scales = scales;
  }
  
}
