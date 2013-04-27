package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Bar;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;
import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.options.BarChartOptions;

/**
 * The Class BarChartPanel provides a simple implementation of chart.js bar
 * chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#barChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class BarChartPanel extends DataSetChartPanel<Bar, BarChartData<BarDataSet>, BarChartOptions, BarDataSet> {

	private static final long serialVersionUID = -7460695892808795726L;

	/**
	 * Instantiates a new bar chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link Bar}
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public BarChartPanel(String id, IModel<Bar> c, int width, int height) {
		super(id, c, width, height);
	}

	/**
	 * Instantiates a new bar chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link Bar}
	 */
	public BarChartPanel(String id, IModel<Bar> c) {
		super(id, c);
	}
}
