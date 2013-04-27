package com.pingunaut.wicket.chartjs.chart.impl;

import java.util.ArrayList;
import java.util.List;

import com.pingunaut.wicket.chartjs.chart.AbstractSimpleChart;
import com.pingunaut.wicket.chartjs.chart.IDoughnut;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;
import com.pingunaut.wicket.chartjs.options.DoughnutChartOptions;

public class Doughnut extends AbstractSimpleChart<DoughnutChartData, DoughnutChartOptions> implements IDoughnut {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6898362145345731457L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public DoughnutChartOptions getOptions() {
		if (options == null) {
			options = new DoughnutChartOptions();
		}
		return options;
	}

	@Override
	public List<DoughnutChartData> getData() {
		if (data == null) {
			data = new ArrayList<DoughnutChartData>();
		}
		return data;
	}
}