package com.pingunaut.wicket.chartjs.chart.impl;

import com.pingunaut.wicket.chartjs.chart.ILine;
import com.pingunaut.wicket.chartjs.data.LineChartData;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;
import com.pingunaut.wicket.chartjs.options.LineChartOptions;

/**
 * The Class Line provides a simple implementation of chart.js line chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#lineChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Line extends AbstractDataSetChart<LineChartData<LineDataSet>, LineChartOptions, LineDataSet> implements ILine {

	/** The Constant serialVersionUID. */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.impl.AbstractDataSetChart#getData()
	 */
	@Override
	public LineChartData<LineDataSet> getData() {
		if (data == null) {
			data = new LineChartData<LineDataSet>();
		}
		return data;
	}
}
