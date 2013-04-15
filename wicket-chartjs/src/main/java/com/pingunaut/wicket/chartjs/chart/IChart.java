package com.pingunaut.wicket.chartjs.chart;

import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public interface IChart<O extends AbstractChartOptions> extends Serializable {

	ObjectMapper getMapper();

	void setMapper(final ObjectMapper mapper);

	O getOptions();

	void setOptions(O options);
}
