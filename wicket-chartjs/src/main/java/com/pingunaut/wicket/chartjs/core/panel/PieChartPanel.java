package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Pie;
import com.pingunaut.wicket.chartjs.core.SimpleChartPanel;
import com.pingunaut.wicket.chartjs.data.PieChartData;
import com.pingunaut.wicket.chartjs.options.PieChartOptions;

public class PieChartPanel extends SimpleChartPanel<Pie, PieChartData, PieChartOptions> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7460695892808795726L;

	public PieChartPanel(String id, IModel<Pie> c, int width, int height) {
		super(id, c, width, height);
	}

	public PieChartPanel(String id, IModel<Pie> c) {
		super(id, c);
	}
}
