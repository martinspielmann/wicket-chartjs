package de.martinspielmann.wicket.chartjs.data.dataset.property.border;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum SimpleBorderAlign implements JsonStringAware, BorderAlign {
  CENTER("center"), INNER("inner");

  private final String json;

  private SimpleBorderAlign(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }

}
