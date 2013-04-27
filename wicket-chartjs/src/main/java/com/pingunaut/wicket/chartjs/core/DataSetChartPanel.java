package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.IDataSetChart;
import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractBaseDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public abstract class DataSetChartPanel<C extends IDataSetChart<D, O, S>, D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractBaseDataSet> extends
		AbstractChartPanel<C, O> {

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
