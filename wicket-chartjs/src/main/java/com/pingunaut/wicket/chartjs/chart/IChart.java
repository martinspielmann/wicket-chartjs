package com.pingunaut.wicket.chartjs.chart;

import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public interface IChart<D extends AbstractChartData<S>, S extends AbstractDataSet, O extends AbstractChartOptions> extends Serializable {

	D getData();

	void setData(final D data);

	O getOptions();

	void setOptions(final O options);

	ObjectMapper getMapper();

	void setMapper(final ObjectMapper mapper);
}
