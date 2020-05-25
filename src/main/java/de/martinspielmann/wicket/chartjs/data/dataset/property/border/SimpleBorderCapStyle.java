package de.martinspielmann.wicket.chartjs.data.dataset.property.border;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum SimpleBorderCapStyle implements BorderCapStyle, JsonStringAware {
  BUTT("butt"), ROUND("round"), SQUARE("square");

  private final String json;

  private SimpleBorderCapStyle(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
