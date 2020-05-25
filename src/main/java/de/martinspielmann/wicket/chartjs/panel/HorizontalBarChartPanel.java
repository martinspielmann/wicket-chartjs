package de.martinspielmann.wicket.chartjs.panel;

import org.apache.wicket.model.IModel;
import de.martinspielmann.wicket.chartjs.chart.impl.Bar;

public class HorizontalBarChartPanel extends BarChartPanel {

  private static final long serialVersionUID = 1L;

  public HorizontalBarChartPanel(String id, IModel<? extends Bar> barModel) {
    super(id, barModel);
  }
}
