package de.martinspielmann.wicket.chartjs.options.properties;


import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public enum FontStyle implements JsonStringAware {
  NORMAL("normal"), BOLD("bold"), ITALIC("italic"), OBLIQUE("oblique"), INITIAL("initial"), INHERIT(
      "inherit");

  private final String json;

  private FontStyle(String json) {
    this.json = json;
  }

  @Override
  public String getJson() {
    return json;
  }
}
