package de.martinspielmann.wicket.chartjs.data.dataset.property;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum FlexBarThickness implements BarThickness, JsonStringAware {

  FLEX("flex");

  private String json;

  FlexBarThickness(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
