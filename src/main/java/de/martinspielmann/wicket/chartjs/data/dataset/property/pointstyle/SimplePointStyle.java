package de.martinspielmann.wicket.chartjs.data.dataset.property.pointstyle;

import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;


public enum SimplePointStyle implements JsonStringAware, PointStyle {
  CIRCLE("circle"), CROSS("cross"), CROSS_ROT("crossRot"), DASH("dash"), LINE("line"), RECT(
      "rect"), RECT_ROUNDED("rectRounded"), RECT_ROT("rectRot"), STAR("star"), TRIANGLE("triangle");

  private final String json;

  private SimplePointStyle(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }
}
