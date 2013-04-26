package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Line;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;

public class LineChartPanel extends DataSetChartPanel<Line> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7460695892808795726L;

	public LineChartPanel(String id, IModel<Line> c, int width, int height) {
		super(id, c, width, height);
	}

	public LineChartPanel(String id, IModel<Line> c) {
		super(id, c);
	}
}
