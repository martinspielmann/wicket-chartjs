package de.martinspielmann.wicket.chartjs.options.properties;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum Align implements JsonStringAware {
  START("start"), CENTER("center"), END("end");

  private final String json;

  private Align(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
