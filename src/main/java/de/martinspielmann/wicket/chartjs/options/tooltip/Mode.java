package de.martinspielmann.wicket.chartjs.options.tooltip;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum Mode implements JsonStringAware {
  POINT("point"), NEAREST("nearest"), INDEX("index"), DATASET("dataset"), X("x"), Y("y");

  private final String json;

  private Mode(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
