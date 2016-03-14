package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTestCase;
import org.junit.Test;

import com.pingunaut.wicket.chartjs.data.PieData;

public class PieChartPanelTest extends WicketTestCase{

	@Test
	public void test() {
		IModel<PieData> model = Model.of(new PieData());
		PieChartPanel panel = new PieChartPanel("foo", model);
		tester.startComponentInPage(panel);
		tester.assertComponent("foo:canvas", WebMarkupContainer.class);
	}
}
