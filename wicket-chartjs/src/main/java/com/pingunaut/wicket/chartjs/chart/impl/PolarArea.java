package com.pingunaut.wicket.chartjs.chart.impl;

import java.util.ArrayList;
import java.util.List;

import com.pingunaut.wicket.chartjs.chart.AbstractSimpleChart;
import com.pingunaut.wicket.chartjs.chart.IPolarArea;
import com.pingunaut.wicket.chartjs.data.PolarAreaChartData;
import com.pingunaut.wicket.chartjs.options.PolarAreaChartOptions;

public class PolarArea extends AbstractSimpleChart<PolarAreaChartData, PolarAreaChartOptions> implements IPolarArea {

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
	public PolarAreaChartOptions getOptions() {
		if (options == null) {
			options = new PolarAreaChartOptions();
		}
		return options;
	}

	@Override
	public List<PolarAreaChartData> getData() {
		if (data == null) {
			data = new ArrayList<PolarAreaChartData>();
		}
		return data;
	}
}