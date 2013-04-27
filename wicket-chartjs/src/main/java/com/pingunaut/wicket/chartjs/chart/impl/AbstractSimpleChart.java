package com.pingunaut.wicket.chartjs.chart.impl;

import java.util.List;

import com.pingunaut.wicket.chartjs.chart.ISimpleChart;
import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The class AbstractSimpleChart provides chart data and options.
 * AbstractSimpleCharts are
 * <ul>
 * <li>{@link Doughnut}</li>
 * <li>{@link Pie}</li>
 * <li>{@link PolarArea}</li>
 * </ul>
 * their chart data doesn't need datasets. data just consists of a color and a
 * value.
 * 
 * @param <D>
 *            the generic type of chart data (extends
 *            {@link SimpleColorValueChartData}
 * @param <O>
 *            the generic type of chart options {@link AbstractChartOptions}
 * 
 * @author Martin Spielmann
 */
public abstract class AbstractSimpleChart<D extends SimpleColorValueChartData, O extends AbstractChartOptions> extends AbstractChart<O> implements ISimpleChart<D, O> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4176838766615656412L;

	/** The data. */
	protected List<D> data;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.ISimpleChart#getData()
	 */
	public List<D> getData() {
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.ISimpleChart#setData(java.util.List)
	 */
	public void setData(List<D> data) {
		this.data = data;
	}
}
