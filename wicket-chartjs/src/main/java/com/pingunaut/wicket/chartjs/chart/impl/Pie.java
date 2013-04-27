package com.pingunaut.wicket.chartjs.chart.impl;

import java.util.ArrayList;
import java.util.List;

import com.pingunaut.wicket.chartjs.chart.IPie;
import com.pingunaut.wicket.chartjs.data.PieChartData;
import com.pingunaut.wicket.chartjs.options.PieChartOptions;

/**
 * The Class Pie provides a simple implementation of chart.js pie chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#pieChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Pie extends AbstractSimpleChart<PieChartData, PieChartOptions> implements IPie {

	private static final long serialVersionUID = -6898362145345731457L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public PieChartOptions getOptions() {
		if (options == null) {
			options = new PieChartOptions();
		}
		return options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.impl.AbstractSimpleChart#getData()
	 */
	@Override
	public List<PieChartData> getData() {
		if (data == null) {
			data = new ArrayList<PieChartData>();
		}
		return data;
	}
}