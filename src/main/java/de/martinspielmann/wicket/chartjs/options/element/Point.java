package de.martinspielmann.wicket.chartjs.options.element;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;
import de.martinspielmann.wicket.chartjs.data.dataset.property.pointstyle.SimplePointStyle;

public class Point implements Serializable {

  private static final long serialVersionUID = 1L;

  private Number radius;
  private SimplePointStyle pointStyle;
  private Number rotation;
  private SimpleColor backgroundColor;
  private Number borderWidth;
  private SimpleColor borderColor;
  private Number hitRadius;
  private Number hoverRadius;
  private Number hoverBorderWidth;

  public Number getRadius() {
    return radius;
  }

  public void setRadius(Number radius) {
    this.radius = radius;
  }

  public SimplePointStyle getPointStyle() {
    return pointStyle;
  }

  public void setPointStyle(SimplePointStyle pointStyle) {
    this.pointStyle = pointStyle;
  }

  public Number getRotation() {
    return rotation;
  }

  public void setRotation(Number rotation) {
    this.rotation = rotation;
  }

  public SimpleColor getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(SimpleColor backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public Number getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(Number borderWidth) {
    this.borderWidth = borderWidth;
  }

  public SimpleColor getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(SimpleColor borderColor) {
    this.borderColor = borderColor;
  }

  public Number getHitRadius() {
    return hitRadius;
  }

  public void setHitRadius(Number hitRadius) {
    this.hitRadius = hitRadius;
  }

  public Number getHoverRadius() {
    return hoverRadius;
  }

  public void setHoverRadius(Number hoverRadius) {
    this.hoverRadius = hoverRadius;
  }

  public Number getHoverBorderWidth() {
    return hoverBorderWidth;
  }

  public void setHoverBorderWidth(Number hoverBorderWidth) {
    this.hoverBorderWidth = hoverBorderWidth;
  }

}
