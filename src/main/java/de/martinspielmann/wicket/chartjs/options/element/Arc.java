package de.martinspielmann.wicket.chartjs.options.element;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.SimpleBorderAlign;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;

public class Arc implements Serializable {

  private static final long serialVersionUID = 1L;

  private Number angle;
  private SimpleColor backgroundColor;
  private SimpleBorderAlign borderAlign;
  private Number borderWidth;
  private SimpleColor borderColor;

  public Number getAngle() {
    return angle;
  }

  public void setAngle(Number angle) {
    this.angle = angle;
  }

  public SimpleColor getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(SimpleColor backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public SimpleBorderAlign getBorderAlign() {
    return borderAlign;
  }

  public void setBorderAlign(SimpleBorderAlign borderAlign) {
    this.borderAlign = borderAlign;
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

}
