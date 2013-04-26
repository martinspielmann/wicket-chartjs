package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Pie;
import com.pingunaut.wicket.chartjs.core.SimpleChartPanel;

public class PieChartPanel extends SimpleChartPanel<Pie> {

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
