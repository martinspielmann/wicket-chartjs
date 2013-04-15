package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public interface IDataSetChart<D extends AbstractChartData, O extends AbstractChartOptions> extends IChart<O> {

	D getData();

	void setData(final D data);

}
