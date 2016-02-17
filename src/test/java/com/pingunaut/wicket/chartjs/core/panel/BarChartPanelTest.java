package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTestCase;
import org.junit.Test;

import com.pingunaut.wicket.chartjs.data.BarData;

public class BarChartPanelTest extends WicketTestCase{

	@Test
	public void testBarChartPanelStringIModelOfQextendsBarIntInt() {
		IModel<BarData> model = Model.of(new BarData());
		BarChartPanel panel = new BarChartPanel("foo", model);
		tester.startComponentInPage(panel);
		tester.assertComponent("foo:chart", WebMarkupContainer.class);
	}

	@Test
	public void testBarChartPanelStringIModelOfQextendsBar() {
		IModel<BarData> model = Model.of(new BarData());
		BarChartPanel panel = new BarChartPanel("foo", model);
		tester.startComponentInPage(panel);
		tester.assertComponent("foo:chart", WebMarkupContainer.class);
	}

}
