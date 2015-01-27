/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractBaseDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Interface IDataSetChart provides chart data and options. IDataSetCharts
 * are
 * <ul>
 * <li>{@link IBar}</li>
 * <li>{@link ILine}</li>
 * <li>{@link IRadar}</li>
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
 */
public interface IDataSetChart<D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractBaseDataSet> extends IChart<O> {

	/**
	 * Gets the chart data.
	 * 
	 * @return the chart data (extends {@link AbstractChartData}).
	 * 
	 */
	D getData();

	/**
	 * Sets the data.
	 * 
	 * @param data
	 *            the new data
	 */
	void setData(final D data);

}
