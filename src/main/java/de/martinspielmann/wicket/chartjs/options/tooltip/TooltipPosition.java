package de.martinspielmann.wicket.chartjs.options.tooltip;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum TooltipPosition implements JsonStringAware {
  NEAREST("nearest"), AVERAGE("average");

  private final String json;

  private TooltipPosition(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }
}
