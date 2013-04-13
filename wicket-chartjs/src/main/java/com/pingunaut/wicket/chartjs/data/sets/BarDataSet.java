package com.pingunaut.wicket.chartjs.data.sets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BarDataSet extends AbstractDataSet {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1581171902504828797L;

	public BarDataSet() {

	}

	public BarDataSet(List<Integer> values) {
		setData(values);
	}
}
