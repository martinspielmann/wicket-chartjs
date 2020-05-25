package de.martinspielmann.wicket.chartjs.chart.impl;

import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;

public class HorizontalBar extends Bar {

  private static final long serialVersionUID = 1L;

  @Override
  public ChartType getType() {
    return ChartType.HORIZONTAL_BAR;
  }

}
