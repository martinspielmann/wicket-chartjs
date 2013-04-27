package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractBaseDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

public abstract class AbstractDataSetChart<D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractBaseDataSet> extends AbstractChart<O> implements IDataSetChart<D, O, S> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 999846601210465414L;
	protected D data;

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}

}
