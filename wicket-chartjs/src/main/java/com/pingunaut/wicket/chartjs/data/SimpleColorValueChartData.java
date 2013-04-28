package com.pingunaut.wicket.chartjs.data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class SimpleColorValueChartData is what it's named. it has a color and a
 * value. it's used by doughnut, pie and radar charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class SimpleColorValueChartData implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -3393548464561735841L;

	/**
	 * Instantiates new simple color value chart data.
	 * 
	 * @param value
	 *            the value
	 * @param color
	 *            the color
	 */
	public SimpleColorValueChartData(Integer value, String color) {
		this.value = value;
		this.color = color;
	}

	/** The value. */
	private Integer value;

	/** The color. */
	private String color;

	/**
	 * Gets the color.
	 * 
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 * 
	 * @param color
	 *            the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
	public void setValue(Integer value) {
		this.value = value;
	}

}
