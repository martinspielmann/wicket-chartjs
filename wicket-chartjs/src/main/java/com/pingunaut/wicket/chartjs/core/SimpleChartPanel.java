package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.ISimpleChart;
import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public abstract class SimpleChartPanel<C extends ISimpleChart<D, O>, D extends SimpleColorValueChartData, O extends AbstractChartOptions> extends AbstractChartPanel<C, O> {

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

	@Override
	public String generateChart() {
		String dataString = null;
		String optionString = null;
		try {
			dataString = getChart().getMapper().writeValueAsString(getChart().getData());
			optionString = getChart().getMapper().writeValueAsString(getChart().getOptions());
			System.out.println(getChart().getOptions().getAnimation());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "WicketCharts['" + getChartCanvas().getMarkupId() + "']." + getChart().getClass().getSimpleName() + "(" + dataString + ", " + optionString + ");";
	}
}
