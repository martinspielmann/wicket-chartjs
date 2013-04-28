package com.pingunaut.wicket.chartjs.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class PieChartData provides chart data used by pie charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class PieChartData extends SimpleColorValueChartData {

	@JsonIgnore
	private static final long serialVersionUID = -5122104387810776812L;

	/**
	 * Instantiates a new pie chart data.
	 * 
	 * @param value
	 *            the value
	 * @param color
	 *            the color
	 */
	public PieChartData(Integer value, String color) {
		super(value, color);
	}

}
