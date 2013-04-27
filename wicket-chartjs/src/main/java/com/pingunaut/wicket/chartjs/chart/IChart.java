package com.pingunaut.wicket.chartjs.chart;

import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * IChart provides chart options and a pojo-json mapper to communicate with
 * javascript.
 * 
 * @param <O>
 *            the generic type of options (has to extend
 *            {@link AbstractChartOptions})
 * 
 * @author Martin Spielmann
 */
public interface IChart<O extends AbstractChartOptions> extends Serializable {

	/**
	 * Gets the mapper.
	 * 
	 * @return an instance of {@link ObjectMapper} to be able to map pojos to
	 *         javascript objects and the other way round if necessary.
	 */
	public ObjectMapper getMapper();

	/**
	 * Sets the mapper.
	 * 
	 * @param mapper
	 *            the new mapper
	 */
	public void setMapper(final ObjectMapper mapper);

	/**
	 * Gets the options.
	 * 
	 * @return the charts options. these are the same options, which are
	 *         available for the pure javascript <a
	 *         href="http://chart.js">http://chart.js</a>
	 * 
	 *         the implementations inside the impl package all override this
	 *         method to ensure {@code getOptions()} doesn't return {@code null}
	 *         , so you won't have to create a new one by yourself
	 */
	public O getOptions();
}
