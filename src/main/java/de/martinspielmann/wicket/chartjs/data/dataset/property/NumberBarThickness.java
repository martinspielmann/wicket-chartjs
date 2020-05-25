package de.martinspielmann.wicket.chartjs.data.dataset.property;

import de.martinspielmann.wicket.chartjs.core.internal.JsonNumberAware;

public class NumberBarThickness implements BarThickness, JsonNumberAware {

  private static final long serialVersionUID = 1L;

  private final Number json;

  public NumberBarThickness(Number json) {
    this.json = json;
  }

  @Override
  public Number getJson() {
    return json;
  }

}
