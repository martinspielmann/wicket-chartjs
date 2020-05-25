package de.martinspielmann.wicket.chartjs.data.dataset.property.fill;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum Boundary implements Fill, JsonStringAware {
  START("start"), END("end"), ORIGIN("origin");

  private final String json;

  private Boundary(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }



}
