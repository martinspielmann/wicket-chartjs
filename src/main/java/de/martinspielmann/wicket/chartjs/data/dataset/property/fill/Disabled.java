package de.martinspielmann.wicket.chartjs.data.dataset.property.fill;

import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;

public enum Disabled implements Fill, JsonAware {
  FALSE(false), TRUE(true);

  private Boolean json;

  private Disabled(Boolean value) {
    this.json = value;
  }

  @Override
  public Object getJson() {
    return json;
  }
}
