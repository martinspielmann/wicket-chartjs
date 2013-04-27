package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.IDataSetChart;
import com.pingunaut.wicket.chartjs.core.panel.BarChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.LineChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.RadarChartPanel;
import com.pingunaut.wicket.chartjs.data.AbstractChartData;
import com.pingunaut.wicket.chartjs.data.sets.AbstractBaseDataSet;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Class DataSetChartPanel is a prototype for
 * <ul>
 * <li>{@link BarChartPanel}</li>
 * <li>{@link LineChartPanel}</li>
 * <li>{@link RadarChartPanel}</li>
 * </ul>
 * 
 * @param <C>
 *            the generic type of the corresponding chart
 * @param <D>
 *            the generic type of the data displayed by the chart
 * @param <O>
 *            the generic type of the chart's options
 * @param <S>
 *            the generic type of the data's dataset
 */
public abstract class DataSetChartPanel<C extends IDataSetChart<D, O, S>, D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractBaseDataSet> extends
		AbstractChartPanel<C, O> {

	private static final long serialVersionUID = -7183004710065804456L;

	/**
	 * Instantiates a new data set chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link IDataSetChart}
	 */
	public DataSetChartPanel(String id, IModel<C> c) {
		super(id, c);
	}

	/**
	 * Instantiates a new data set chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link IDataSetChart}
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public DataSetChartPanel(String id, IModel<C> c, int width, int height) {
		super(id, c, width, height);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.core.AbstractChartPanel#generateChart()
	 */
	@Override
	public String generateChart() {
		String dataString = null;
		String optionString = null;
		try {
			dataString = getChart().getMapper().writeValueAsString(getChart().getData());
			optionString = getChart().getMapper().writeValueAsString(getChart().getOptions());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "WicketCharts['" + getChartCanvas().getMarkupId() + "']." + getChart().getClass().getSimpleName() + "(" + dataString + ", " + optionString + ");";
	}
}
