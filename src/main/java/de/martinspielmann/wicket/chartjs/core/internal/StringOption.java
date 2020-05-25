package de.martinspielmann.wicket.chartjs.core.internal;

public abstract class StringOption implements JsonStringAware {

  private static final long serialVersionUID = 1L;

  private final String string;

  public StringOption(String string) {
    this.string = string;
  }

  @Override
  public String getJson() {
    return string;
  }
}

