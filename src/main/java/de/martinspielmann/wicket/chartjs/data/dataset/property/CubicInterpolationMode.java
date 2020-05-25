package de.martinspielmann.wicket.chartjs.data.dataset.property;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum CubicInterpolationMode implements JsonStringAware {
  DEFAULT("default"), MONOTONE("monotone");

  private final String json;

  private CubicInterpolationMode(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }
}
