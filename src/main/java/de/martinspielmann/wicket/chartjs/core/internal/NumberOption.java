package de.martinspielmann.wicket.chartjs.core.internal;

public abstract class NumberOption implements JsonNumberAware {

  private static final long serialVersionUID = 1L;

  private final Number number;

  public NumberOption(Number number) {
    this.number = number;
  }

  @Override
  public Number getJson() {
    return number;
  }
}

