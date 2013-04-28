package com.pingunaut.wicket.chartjs.data.sets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pingunaut.wicket.chartjs.data.LineChartData;

/**
 * The Class LineDataSet provides all information needed for
 * {@link LineChartData}.
 * 
 * @author Martin Spielmann
 */
public class LineDataSet extends AbstractPointColorDataSet {

	@JsonIgnore
	private static final long serialVersionUID = -3154092519924576329L;

	/**
	 * Instantiates a new line data set.
	 */
	public LineDataSet() {
		super();
	}

	/**
	 * Instantiates a new line data set.
	 * 
	 * @param values
	 *            the values
	 */
	public LineDataSet(List<Integer> values) {
		super(values);
	}

}
