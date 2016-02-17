package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTestCase;
import org.junit.Test;

import com.pingunaut.wicket.chartjs.data.DoughnutChartData;

public class DoughnutChartPanelTest extends WicketTestCase{

	@Test
	public void testDoughnutChartPanelStringIModelOfQextendsDoughnutIntInt() {
		IModel<DoughnutChartData> model = Model.of(new DoughnutChartData());
		DoughnutChartPanel panel = new DoughnutChartPanel("foo", model);
		tester.startComponentInPage(panel);
		tester.assertComponent("foo:chart", WebMarkupContainer.class);
	}

	@Test
	public void testDoughnutChartPanelStringIModelOfQextendsDoughnut() {
		IModel<DoughnutChartData> model = Model.of(new DoughnutChartData());
		DoughnutChartPanel panel = new DoughnutChartPanel("foo", model);
		tester.startComponentInPage(panel);
		tester.assertComponent("foo:chart", WebMarkupContainer.class);	}

}
