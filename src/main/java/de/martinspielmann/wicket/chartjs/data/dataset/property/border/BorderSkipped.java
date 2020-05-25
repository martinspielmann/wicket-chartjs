package de.martinspielmann.wicket.chartjs.data.dataset.property.border;

import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;

public enum BorderSkipped implements JsonAware {
  TOP("top"), RIGHT("right"), BOTTOM("bottom"), LEFT("left"), FALSE(false);

  private final Object json;

  private BorderSkipped(Object json) {
    this.json = json;
  }

  @Override
  public Object getJson() {
    return json;
  }

}
