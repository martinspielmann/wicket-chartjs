package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.IDataSetChart;

public class DataSetChartPanel<C extends IDataSetChart> extends AbstractChartPanel<C> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7183004710065804456L;

	public DataSetChartPanel(String id, IModel<C> c) {
		super(id, c);
	}

	public DataSetChartPanel(String id, IModel<C> c, int width, int height) {
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
