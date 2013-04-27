package com.pingunaut.wicket.chartjs.chart.impl;

import com.pingunaut.wicket.chartjs.chart.IDataSetChart;
import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractBaseDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The class AbstractDataSetChart provides chart data and options.
 * AbstractDataSetCharts are
 * <ul>
 * <li>{@link Bar}</li>
 * <li>{@link Line}</li>
 * <li>{@link Radar}</li>
 * </ul>
 * instead of simple color&value pairs, this type uses labels and datasets.
 * 
 * @param <D>
 *            the generic type of chart data (has to extend
 *            {@link AbstractChartData}
 * @param <O>
 *            the generic type of chart options (has to extend
 *            {@link AbstractChartOptions}
 * @param <S>
 *            the generic type of a chart data set (has to extend
 *            {@link AbstractBaseDataSet}
 * 
 * @author Martin Spielmann
 * 
 */
public abstract class AbstractDataSetChart<D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractBaseDataSet> extends AbstractChart<O> implements IDataSetChart<D, O, S> {

	private static final long serialVersionUID = 999846601210465414L;

	/** The data. */
	protected D data;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IDataSetChart#getData()
	 */
	public D getData() {
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.IDataSetChart#setData(com.pingunaut
	 * .wicket.chartjs.data.AbstractChartData)
	 */
	public void setData(D data) {
		this.data = data;
	}

}
