package com.pingunaut.wicket.chartjs.chart;

import java.util.List;

import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Interface ISimpleChart provides chart data and options. ISimpleCharts are
 * <ul>
 * <li>{@link IDoughnut}</li>
 * <li>{@link IPie}</li>
 * <li>{@link IPolarArea}</li>
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
public interface ISimpleChart<D extends SimpleColorValueChartData, O extends AbstractChartOptions> extends IChart<O> {

	/**
	 * Gets the data.
	 * 
	 * @return the chart's data
	 */
	List<D> getData();

	/**
	 * Sets the data.
	 * 
	 * @param data
	 *            the chart's new data
	 */
	void setData(List<D> data);

}
