package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;
import com.pingunaut.wicket.chartjs.core.SimpleChartPanel;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;
import com.pingunaut.wicket.chartjs.options.DoughnutChartOptions;

/**
 * The Class DoughnutChartPanel provides a simple implementation of chart.js
 * doughnut chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#doughnutChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class DoughnutChartPanel extends SimpleChartPanel<Doughnut, DoughnutChartData, DoughnutChartOptions> {

	private static final long serialVersionUID = -7460695892808795726L;

	/**
	 * Instantiates a new doughnut chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link Doughnut}
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public DoughnutChartPanel(String id, IModel<Doughnut> c, int width, int height) {
		super(id, c, width, height);
	}

	/**
	 * Instantiates a new doughnut chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link Doughnut}
	 */
	public DoughnutChartPanel(String id, IModel<Doughnut> c) {
		super(id, c);
	}
}
