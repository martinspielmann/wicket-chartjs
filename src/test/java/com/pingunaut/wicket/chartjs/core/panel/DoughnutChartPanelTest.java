package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTestCase;
import org.junit.jupiter.api.Test;
import de.martinspielmann.wicket.chartjs.chart.impl.Doughnut;
import de.martinspielmann.wicket.chartjs.panel.DoughnutChartPanel;

public class DoughnutChartPanelTest extends WicketTestCase {

  @Test
  public void testDoughnutChartPanelStringIModelOfQextendsDoughnutIntInt() {
    IModel<? extends Doughnut> model = Model.of(new Doughnut());
    DoughnutChartPanel panel = new DoughnutChartPanel("foo", model);
    tester.startComponentInPage(panel);
    tester.assertComponent("foo:chart", WebMarkupContainer.class);
  }

  @Test
  public void testDoughnutChartPanelStringIModelOfQextendsDoughnut() {
    IModel<? extends Doughnut> model = Model.of(new Doughnut());
    DoughnutChartPanel panel = new DoughnutChartPanel("foo", model);
    tester.startComponentInPage(panel);
    tester.assertComponent("foo:chart", WebMarkupContainer.class);
  }

}
