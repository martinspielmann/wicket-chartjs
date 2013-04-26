package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Radar;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;

public class RadarChartPanel extends DataSetChartPanel<Radar> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7460695892808795726L;

	public RadarChartPanel(String id, IModel<Radar> c, int width, int height) {
		super(id, c, width, height);
	}

	public RadarChartPanel(String id, IModel<Radar> c) {
		super(id, c);
	}
}
