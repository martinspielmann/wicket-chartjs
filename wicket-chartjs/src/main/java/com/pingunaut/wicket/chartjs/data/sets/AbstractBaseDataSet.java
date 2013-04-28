package com.pingunaut.wicket.chartjs.data.sets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class AbstractBaseDataSet provides the simplest kind of a dataset.
 * besides the list of data itself, it contains default values for fill- and
 * stroke color.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public abstract class AbstractBaseDataSet implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 1581171902504828797L;

	/** The fill color. */
	private String fillColor = "rgba(220,220,220,0.5)";

	/** The stroke color. */
	private String strokeColor = "rgba(220,220,220,1)";

	/** The data. */
	private List<Integer> data;

	/**
	 * Instantiates a new abstract base data set.
	 * 
	 * @param values
	 *            the data values
	 */
	public AbstractBaseDataSet(List<Integer> values) {
		data = values;
	}

	/**
	 * Instantiates a new abstract base data set.
	 */
	public AbstractBaseDataSet() {

	}

	/**
	 * Gets the fill color.
	 * 
	 * @return the fill color
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * Sets the fill color.
	 * 
	 * @param fillColor
	 *            the fill color
	 * @return the abstract base data set
	 */
	public AbstractBaseDataSet setFillColor(String fillColor) {
		this.fillColor = fillColor;
		return this;
	}

	/**
	 * Gets the stroke color.
	 * 
	 * @return the stroke color
	 */
	public String getStrokeColor() {
		return strokeColor;
	}

	/**
	 * Sets the stroke color.
	 * 
	 * @param strokeColor
	 *            the stroke color
	 * @return the abstract base data set
	 */
	public AbstractBaseDataSet setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
		return this;
	}

	/**
	 * Gets the data.
	 * 
	 * @return the data
	 */
	public List<Integer> getData() {
		if (data == null) {
			data = new ArrayList<Integer>();
		}
		return data;
	}

	/**
	 * Sets the data.
	 * 
	 * @param data
	 *            the data
	 * @return the abstract base data set
	 */
	public AbstractBaseDataSet setData(List<Integer> data) {
		this.data = data;
		return this;
	}

}
