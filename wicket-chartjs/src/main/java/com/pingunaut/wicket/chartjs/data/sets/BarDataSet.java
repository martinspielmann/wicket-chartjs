package com.pingunaut.wicket.chartjs.data.sets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pingunaut.wicket.chartjs.data.BarChartData;

/**
 * The Class BarDataSet provides all information needed for {@link BarChartData}
 * .
 * 
 * @author Martin Spielmann
 */
public class BarDataSet extends AbstractBaseDataSet {

	@JsonIgnore
	private static final long serialVersionUID = 3095383371272813559L;

	/**
	 * Instantiates a new bar data set.
	 */
	public BarDataSet() {
		super();
	}

	/**
	 * Instantiates a new bar data set.
	 * 
	 * @param values
	 *            the values
	 */
	public BarDataSet(List<Integer> values) {
		super(values);
	}

}
