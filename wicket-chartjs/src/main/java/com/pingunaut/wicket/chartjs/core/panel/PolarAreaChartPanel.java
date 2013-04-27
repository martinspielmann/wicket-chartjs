package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.PolarArea;
import com.pingunaut.wicket.chartjs.core.SimpleChartPanel;
import com.pingunaut.wicket.chartjs.data.PolarAreaChartData;
import com.pingunaut.wicket.chartjs.options.PolarAreaChartOptions;

public class PolarAreaChartPanel extends SimpleChartPanel<PolarArea, PolarAreaChartData, PolarAreaChartOptions> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7460695892808795726L;

	public PolarAreaChartPanel(String id, IModel<PolarArea> c, int width, int height) {
		super(id, c, width, height);
	}

	public PolarAreaChartPanel(String id, IModel<PolarArea> c) {
		super(id, c);
	}
}
