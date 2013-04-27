package com.pingunaut.wicket.chartjs.chart;

import java.util.List;

import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public abstract class AbstractSimpleChart<D extends SimpleColorValueChartData, O extends AbstractChartOptions> extends AbstractChart<O> implements ISimpleChart<D, O> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4176838766615656412L;
	protected List<D> data;

	public List<D> getData() {
		return data;
	}

	public void setData(List<D> data) {
		this.data = data;
	}
}
