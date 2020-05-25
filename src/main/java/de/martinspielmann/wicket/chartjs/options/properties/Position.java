package de.martinspielmann.wicket.chartjs.options.properties;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum Position implements JsonStringAware {
  TOP("top"), RIGHT("right"), BOTTOM("bottom"), LEFT("left");

  private final String json;

  private Position(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
