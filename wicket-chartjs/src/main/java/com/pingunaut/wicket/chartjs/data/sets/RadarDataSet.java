package com.pingunaut.wicket.chartjs.data.sets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pingunaut.wicket.chartjs.data.RadarChartData;

/**
 * The Class RadarDataSet provides all information needed for
 * {@link RadarChartData}.
 * 
 * @author Martin Spielmann
 */
public class RadarDataSet extends AbstractPointColorDataSet {

	@JsonIgnore
	private static final long serialVersionUID = -3154092519924576329L;

	/**
	 * Instantiates a new radar data set.
	 */
	public RadarDataSet() {
		super();
	}

	/**
	 * Instantiates a new radar data set.
	 * 
	 * @param values
	 *            the values
	 */
	public RadarDataSet(List<Integer> values) {
		super(values);
	}

}
