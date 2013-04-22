package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.ISimpleChart;

public class SimpleChartPanel<C extends ISimpleChart> extends AbstractChartPanel<C> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2899070514574123978L;

	public SimpleChartPanel(String id, IModel<C> c) {
		super(id, c);
	}

	public SimpleChartPanel(String id, IModel<C> c, int width, int height) {
		super(id, c, width, height);
	}

	// @Override
	// public void renderHead(IHeaderResponse response) {
	// super.renderHead(response);
	// response.render(OnDomReadyHeaderItem.forScript(generateChart()));
	// }

	@Override
	public String generateChart() {
		String dataString = null;
		try {
			dataString = getChart().getMapper().writeValueAsString(getChart().getData());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "WicketCharts['" + getChartCanvas().getMarkupId() + "']." + getChart().getClass().getSimpleName() + "(" + dataString + ", " + getChart().getOptions() + ");";
	}
}
