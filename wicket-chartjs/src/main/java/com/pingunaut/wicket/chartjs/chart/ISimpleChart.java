package com.pingunaut.wicket.chartjs.chart;

import java.util.List;

import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public interface ISimpleChart<D extends SimpleColorValueChartData, O extends AbstractChartOptions> extends IChart<O> {

	List<D> getData();

	void setData(List<D> data);

}
