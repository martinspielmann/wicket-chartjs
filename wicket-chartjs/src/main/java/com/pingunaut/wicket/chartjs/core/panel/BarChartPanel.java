package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Bar;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;
import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.options.BarChartOptions;

public class BarChartPanel extends DataSetChartPanel<Bar, BarChartData<BarDataSet>, BarChartOptions, BarDataSet> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7460695892808795726L;

	public BarChartPanel(String id, IModel<Bar> c, int width, int height) {
		super(id, c, width, height);
	}

	public BarChartPanel(String id, IModel<Bar> c) {
		super(id, c);
	}
}
