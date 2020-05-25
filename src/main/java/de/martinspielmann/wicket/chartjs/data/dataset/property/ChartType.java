package de.martinspielmann.wicket.chartjs.data.dataset.property;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum ChartType implements JsonStringAware {
  LINE("line"), BAR("bar"), HORIZONTAL_BAR("horizontalBar"), RADAR("radar"), DOUGHNUT(
      "doughnut"), PIE("pie"), POLAR_AREA(
          "polarArea"), BUBBLE("bubble"), SCATTER("scatter"), AREA("area"), MIXED(null);

  private final String json;

  private ChartType(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
