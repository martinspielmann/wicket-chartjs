package com.pingunaut.wicket.chartjs.chart.impl;

import com.pingunaut.wicket.chartjs.chart.AbstractDataSetChart;
import com.pingunaut.wicket.chartjs.chart.IRadar;
import com.pingunaut.wicket.chartjs.data.RadarChartData;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataSet;
import com.pingunaut.wicket.chartjs.options.RadarChartOptions;

public class Radar extends AbstractDataSetChart<RadarChartData<RadarDataSet>, RadarChartOptions, RadarDataSet> implements IRadar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123723866473637510L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public RadarChartOptions getOptions() {
		if (options == null) {
			options = new RadarChartOptions();
		}
		return options;
	}

	@Override
	public RadarChartData<RadarDataSet> getData() {
		if (data == null) {
			data = new RadarChartData<RadarDataSet>();
		}
		return data;
	}
}
