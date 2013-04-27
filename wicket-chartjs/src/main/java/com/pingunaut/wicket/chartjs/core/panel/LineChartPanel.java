package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Line;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;
import com.pingunaut.wicket.chartjs.data.LineChartData;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;
import com.pingunaut.wicket.chartjs.options.LineChartOptions;

public class LineChartPanel extends DataSetChartPanel<Line, LineChartData<LineDataSet>, LineChartOptions, LineDataSet> {

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
