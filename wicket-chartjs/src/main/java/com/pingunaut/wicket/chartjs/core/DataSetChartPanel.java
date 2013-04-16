package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
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

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);

		String dataString = null;
		try {
			dataString = getChart().getMapper().writeValueAsString(getChart().getData());
			System.out.println(dataString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" + getChartCanvas().getMarkupId() + "']." + getChart().getClass().getSimpleName() + "(" + dataString + ", "
				+ getChart().getOptions() + ");"));
	}
}
