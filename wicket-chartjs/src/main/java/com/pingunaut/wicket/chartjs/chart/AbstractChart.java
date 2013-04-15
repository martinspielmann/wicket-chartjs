package com.pingunaut.wicket.chartjs.chart;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public class AbstractChart<O extends AbstractChartOptions> implements IChart<O> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4054134008352228006L;
	private O options;
	private ObjectMapper mapper = new ObjectMapper();

	public ObjectMapper getMapper() {
		return mapper;
	}

	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	public O getOptions() {
		return options;
	}

	public void setOptions(O options) {
		this.options = options;
	}

}
