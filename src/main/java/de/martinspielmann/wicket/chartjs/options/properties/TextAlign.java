package de.martinspielmann.wicket.chartjs.options.properties;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum TextAlign implements JsonStringAware {
  LEFT("left"), CENTER("center"), RIGHT("right");

  private final String json;

  private TextAlign(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
