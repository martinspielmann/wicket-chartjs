package de.martinspielmann.wicket.chartjs.data.dataset;

import de.martinspielmann.wicket.chartjs.core.internal.IndexableOption;
import de.martinspielmann.wicket.chartjs.data.dataset.property.Clip;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.BorderWidth;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.Color;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.INumber;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.SimpleNumber;
import de.martinspielmann.wicket.chartjs.data.dataset.property.pointstyle.PointStyle;

public class BubbleDataset extends AbstractDataset {

  private static final long serialVersionUID = 1L;

  // backgroundColor Color Yes Yes 'rgba(0, 0, 0, 0.1)'
  private IndexableOption<Color> backgroundColor;
  // borderColor Color Yes Yes 'rgba(0, 0, 0, 0.1)'
  private IndexableOption<Color> borderColor;
  // borderWidth number Yes Yes 3
  private IndexableOption<BorderWidth> borderWidth;
  // clip number|object - - undefined
  private Clip clip;
  // hoverBackgroundColor Color - Yes undefined
  private IndexableOption<Color> hoverBackgroundColor;
  // hoverBorderColor Color - Yes undefined
  private IndexableOption<Color> hoverBorderColor;
  // hoverBorderWidth number - Yes 1
  private IndexableOption<INumber> hoverBorderWidth;
  // hoverRadius number Yes Yes 4
  private IndexableOption<INumber> hoverRadius;
  // hitRadius number Yes Yes 1
  private IndexableOption<INumber> hitRadius;
  // order number - - 0
  private SimpleNumber order;
  // pointStyle string Yes Yes 'circle'
  private IndexableOption<PointStyle> pointStyle;
  // rotation number Yes Yes 0
  private IndexableOption<INumber> rotation;
  // radius number Yes Yes 3
  private IndexableOption<INumber> radius;

  public IndexableOption<Color> getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(IndexableOption<Color> backgroundColor) {
    this.backgroundColor = backgroundColor;
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

  public IndexableOption<INumber> getHoverBorderWidth() {
    return hoverBorderWidth;
  }

  public void setHoverBorderWidth(IndexableOption<INumber> hoverBorderWidth) {
    this.hoverBorderWidth = hoverBorderWidth;
  }

  public IndexableOption<INumber> getHoverRadius() {
    return hoverRadius;
  }

  public void setHoverRadius(IndexableOption<INumber> hoverRadius) {
    this.hoverRadius = hoverRadius;
  }

  public IndexableOption<INumber> getHitRadius() {
    return hitRadius;
  }

  public void setHitRadius(IndexableOption<INumber> hitRadius) {
    this.hitRadius = hitRadius;
  }

  public SimpleNumber getOrder() {
    return order;
  }

  public void setOrder(SimpleNumber order) {
    this.order = order;
  }

  public IndexableOption<PointStyle> getPointStyle() {
    return pointStyle;
  }

  public void setPointStyle(IndexableOption<PointStyle> pointStyle) {
    this.pointStyle = pointStyle;
  }

  public IndexableOption<INumber> getRotation() {
    return rotation;
  }

  public void setRotation(IndexableOption<INumber> rotation) {
    this.rotation = rotation;
  }

  public IndexableOption<INumber> getRadius() {
    return radius;
  }

  public void setRadius(IndexableOption<INumber> radius) {
    this.radius = radius;
  }

}
