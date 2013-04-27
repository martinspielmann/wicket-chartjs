package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractBaseDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public interface IDataSetChart<D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractBaseDataSet> extends IChart<O> {

	D getData();

	void setData(final D data);

}
