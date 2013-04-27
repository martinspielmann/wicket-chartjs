package com.pingunaut.wicket.chartjs.chart.impl;

import com.pingunaut.wicket.chartjs.chart.AbstractDataSetChart;
import com.pingunaut.wicket.chartjs.chart.ILine;
import com.pingunaut.wicket.chartjs.data.LineChartData;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;
import com.pingunaut.wicket.chartjs.options.LineChartOptions;

public class Line extends AbstractDataSetChart<LineChartData<LineDataSet>, LineChartOptions, LineDataSet> implements ILine {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3014944174538037710L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public LineChartOptions getOptions() {
		if (options == null) {
			options = new LineChartOptions();
		}
		return options;
	}

	@Override
	public LineChartData<LineDataSet> getData() {
		if (data == null) {
			data = new LineChartData<LineDataSet>();
		}
		return data;
	}
}
