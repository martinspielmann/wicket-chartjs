package de.martinspielmann.wicket.chartjs.options.properties;

import java.io.Serializable;

public class Layout implements Serializable {

  private static final long serialVersionUID = 1L;

  private Padding padding;

  public Padding getPadding() {
    return padding;
  }

  public void setPadding(Padding padding) {
    this.padding = padding;
  }

}
