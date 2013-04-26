package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Bar;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;

public class BarChartPanel extends DataSetChartPanel<Bar> {

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
