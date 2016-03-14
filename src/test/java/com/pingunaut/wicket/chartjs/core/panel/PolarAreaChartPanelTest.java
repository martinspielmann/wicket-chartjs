package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTestCase;
import org.junit.Test;

import com.pingunaut.wicket.chartjs.data.PolarAreaData;

public class PolarAreaChartPanelTest extends WicketTestCase{

	@Test
	public void test() {
		IModel<PolarAreaData> model = Model.of(new PolarAreaData());
		PolarAreaChartPanel panel = new PolarAreaChartPanel("foo", model);
		tester.startComponentInPage(panel);
		tester.assertComponent("foo:canvas", WebMarkupContainer.class);
	}
}
