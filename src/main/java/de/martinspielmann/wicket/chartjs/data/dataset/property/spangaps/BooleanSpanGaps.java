package de.martinspielmann.wicket.chartjs.data.dataset.property.spangaps;

import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;

public enum BooleanSpanGaps implements SpanGaps, JsonAware {
  TRUE(true), FALSE(false);

  private boolean json;

  BooleanSpanGaps(boolean json) {
    this.json = json;
  }

  @Override
  public Object getJson() {
    return json;
  }

}
