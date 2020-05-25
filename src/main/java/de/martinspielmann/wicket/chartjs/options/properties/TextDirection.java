package de.martinspielmann.wicket.chartjs.options.properties;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum TextDirection implements JsonStringAware {
  RTL("rtl"), LTR("ltr");

  private final String json;

  private TextDirection(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
