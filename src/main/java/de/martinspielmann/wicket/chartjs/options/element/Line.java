package de.martinspielmann.wicket.chartjs.options.element;

import java.io.Serializable;
import java.util.List;
import de.martinspielmann.wicket.chartjs.data.dataset.property.CubicInterpolationMode;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.SimpleBorderCapStyle;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.SimpleBorderJoinStyle;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;
import de.martinspielmann.wicket.chartjs.data.dataset.property.fill.Fill;

public class Line implements Serializable {

  private static final long serialVersionUID = 1L;

  private Number tension;
  private SimpleColor backgroundColor;
  private Number borderWidth;
  private SimpleColor borderColor;
  private SimpleBorderCapStyle borderCapStyle;
  private List<Number> borderDash;
  private Number borderDashOffset;
  private SimpleBorderJoinStyle borderJoinStyle;
  private Boolean capBezierPoints;
  private CubicInterpolationMode cubicInterpolationMode;
  private Fill fill;
  private Boolean stepped;

  public Number getTension() {
    return tension;
  }

  public void setTension(Number tension) {
    this.tension = tension;
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

  public SimpleBorderCapStyle getBorderCapStyle() {
    return borderCapStyle;
  }

  public void setBorderCapStyle(SimpleBorderCapStyle borderCapStyle) {
    this.borderCapStyle = borderCapStyle;
  }

  public List<Number> getBorderDash() {
    return borderDash;
  }

  public void setBorderDash(List<Number> borderDash) {
    this.borderDash = borderDash;
  }

  public Number getBorderDashOffset() {
    return borderDashOffset;
  }

  public void setBorderDashOffset(Number borderDashOffset) {
    this.borderDashOffset = borderDashOffset;
  }

  public SimpleBorderJoinStyle getBorderJoinStyle() {
    return borderJoinStyle;
  }

  public void setBorderJoinStyle(SimpleBorderJoinStyle borderJoinStyle) {
    this.borderJoinStyle = borderJoinStyle;
  }

  public Boolean getCapBezierPoints() {
    return capBezierPoints;
  }

  public void setCapBezierPoints(Boolean capBezierPoints) {
    this.capBezierPoints = capBezierPoints;
  }

  public CubicInterpolationMode getCubicInterpolationMode() {
    return cubicInterpolationMode;
  }

  public void setCubicInterpolationMode(CubicInterpolationMode cubicInterpolationMode) {
    this.cubicInterpolationMode = cubicInterpolationMode;
  }

  public Fill getFill() {
    return fill;
  }

  public void setFill(Fill fill) {
    this.fill = fill;
  }

  public Boolean getStepped() {
    return stepped;
  }

  public void setStepped(Boolean stepped) {
    this.stepped = stepped;
  }

}
