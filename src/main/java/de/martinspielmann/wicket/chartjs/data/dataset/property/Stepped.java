package de.martinspielmann.wicket.chartjs.data.dataset.property;

import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;

public enum Stepped implements JsonAware {
  FALSE(false), BEFORE("before"), AFTER("after"), MIDDLE("middle");

  private final Object json;

  private Stepped(Object json) {
    this.json = json;
  }

  @Override
  public Object getJson() {
    return json;
  }
}
