package com.pingunaut.wicket.chartjs.chart;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public abstract class AbstractChart<D extends AbstractChartData<S>, S extends AbstractDataSet, O extends AbstractChartOptions> implements IChart<D, S, O> {

	private D data;
	private O options;
	private ObjectMapper mapper = new ObjectMapper();

	public D getData() {
		// TODO Auto-generated method stub
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

	public O getOptions() {
		// TODO Auto-generated method stub
		return options;
	}

	public void setOptions(O options) {
		// TODO Auto-generated method stub
		this.options = options;
	}

	public ObjectMapper getMapper() {
		// TODO Auto-generated method stub
		return mapper;
	}

	public void setMapper(ObjectMapper mapper) {
		// TODO Auto-generated method stub
		this.mapper = mapper;
	}

}
