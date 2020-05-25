package de.martinspielmann.wicket.chartjs.options.element;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;
import de.martinspielmann.wicket.chartjs.options.properties.Position;

public class Rectangle implements Serializable {

  private static final long serialVersionUID = 1L;

  private SimpleColor backgroundColor;
  private Number borderWidth;
  private SimpleColor borderColor;
  private Position borderSkipped;

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

  public Position getBorderSkipped() {
    return borderSkipped;
  }

  public void setBorderSkipped(Position borderSkipped) {
    this.borderSkipped = borderSkipped;
  }

}
