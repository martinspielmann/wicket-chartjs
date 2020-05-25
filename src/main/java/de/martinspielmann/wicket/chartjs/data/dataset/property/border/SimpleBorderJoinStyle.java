package de.martinspielmann.wicket.chartjs.data.dataset.property.border;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum SimpleBorderJoinStyle implements BorderJoinStyle, JsonStringAware {
  BEVEL("bevel"), ROUND("round"), MITER("miter");

  private final String json;

  private SimpleBorderJoinStyle(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }
}
