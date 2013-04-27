package com.pingunaut.wicket.chartjs.chart.impl;

import java.util.ArrayList;
import java.util.List;

import com.pingunaut.wicket.chartjs.chart.IPolarArea;
import com.pingunaut.wicket.chartjs.data.PolarAreaChartData;
import com.pingunaut.wicket.chartjs.options.PolarAreaChartOptions;

/**
 * The Class PolarArea provides a simple implementation of chart.js polar area
 * chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#polarAreaChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class PolarArea extends AbstractSimpleChart<PolarAreaChartData, PolarAreaChartOptions> implements IPolarArea {

	/** The Constant serialVersionUID. */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.impl.AbstractSimpleChart#getData()
	 */
	@Override
	public List<PolarAreaChartData> getData() {
		if (data == null) {
			data = new ArrayList<PolarAreaChartData>();
		}
		return data;
	}
}