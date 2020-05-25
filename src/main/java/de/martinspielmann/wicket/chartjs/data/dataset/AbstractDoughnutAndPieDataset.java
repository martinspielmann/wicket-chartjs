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
package de.martinspielmann.wicket.chartjs.data.dataset;

import de.martinspielmann.wicket.chartjs.core.internal.IndexableOption;
import de.martinspielmann.wicket.chartjs.data.dataset.property.Clip;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.BorderAlign;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.BorderWidth;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.Color;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.SimpleNumber;

/**
 * The Class AbstractDataset provides the simplest kind of a dataset. besides the list of data
 * itself, it contains default values for fill- and stroke color.
 * 
 * @author Martin Spielmann
 */
public class AbstractDoughnutAndPieDataset extends AbstractDataset {

  private static final long serialVersionUID = 1L;

  // backgroundColor Color Yes Yes 'rgba(0, 0, 0, 0.1)'
  private IndexableOption<Color> backgroundColor;
  // borderAlign string Yes Yes 'center'
  private IndexableOption<BorderAlign> borderAlign;
  // borderColor Color Yes Yes '#fff'
  private IndexableOption<Color> borderColor;
  // borderWidth number Yes Yes 2
  private IndexableOption<BorderWidth> borderWidth;
  // clip number|object - - undefined
  private Clip clip;
  // hoverBackgroundColor Color Yes Yes undefined
  private IndexableOption<Color> hoverBackgroundColor;
  // hoverBorderColor Color Yes Yes undefined
  private IndexableOption<Color> hoverBorderColor;
  // hoverBorderWidth number Yes Yes undefined
  private IndexableOption<BorderWidth> hoverBorderWidth;
  // weight number - - 1
  private SimpleNumber weight;

  public IndexableOption<Color> getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(IndexableOption<Color> backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public IndexableOption<BorderAlign> getBorderAlign() {
    return borderAlign;
  }

  public void setBorderAlign(IndexableOption<BorderAlign> borderAlign) {
    this.borderAlign = borderAlign;
  }

  public IndexableOption<Color> getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(IndexableOption<Color> borderColor) {
    this.borderColor = borderColor;
  }

  public IndexableOption<BorderWidth> getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(IndexableOption<BorderWidth> borderWidth) {
    this.borderWidth = borderWidth;
  }

  public Clip getClip() {
    return clip;
  }

  public void setClip(Clip clip) {
    this.clip = clip;
  }

  public IndexableOption<Color> getHoverBackgroundColor() {
    return hoverBackgroundColor;
  }

  public void setHoverBackgroundColor(IndexableOption<Color> hoverBackgroundColor) {
    this.hoverBackgroundColor = hoverBackgroundColor;
  }

  public IndexableOption<Color> getHoverBorderColor() {
    return hoverBorderColor;
  }

  public void setHoverBorderColor(IndexableOption<Color> hoverBorderColor) {
    this.hoverBorderColor = hoverBorderColor;
  }

  public IndexableOption<BorderWidth> getHoverBorderWidth() {
    return hoverBorderWidth;
  }

  public void setHoverBorderWidth(IndexableOption<BorderWidth> hoverBorderWidth) {
    this.hoverBorderWidth = hoverBorderWidth;
  }

  public SimpleNumber getWeight() {
    return weight;
  }

  public void setWeight(SimpleNumber weight) {
    this.weight = weight;
  }



}
