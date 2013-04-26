package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public class AbstractDataSetChart<D extends AbstractChartData, O extends AbstractChartOptions> extends AbstractChart<O> implements IDataSetChart<D, O> {

	private D data;

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

}
