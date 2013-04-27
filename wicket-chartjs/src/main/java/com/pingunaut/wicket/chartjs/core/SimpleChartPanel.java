package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.IDataSetChart;
import com.pingunaut.wicket.chartjs.chart.ISimpleChart;
import com.pingunaut.wicket.chartjs.core.panel.DoughnutChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PieChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PolarAreaChartPanel;
import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Class SimpleChartPanel is a prototype for
 * <ul>
 * <li>{@link DoughnutChartPanel}</li>
 * <li>{@link PieChartPanel}</li>
 * <li>{@link PolarAreaChartPanel}</li>
 * </ul>
 * 
 * @param <C>
 *            the generic type of the corresponding chart
 * @param <D>
 *            the generic type of the data displayed by the chart
 * @param <O>
 *            the generic type of the chart's options
 */
public abstract class SimpleChartPanel<C extends ISimpleChart<D, O>, D extends SimpleColorValueChartData, O extends AbstractChartOptions> extends AbstractChartPanel<C, O> {

	private static final long serialVersionUID = 2899070514574123978L;

	/**
	 * Instantiates a new simple chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link ISimpleChart}
	 */
	public SimpleChartPanel(String id, IModel<C> c) {
		super(id, c);
	}

	/**
	 * Instantiates a new simple chart panel.
	 * 
	 * @param id
	 *            the markup id
	 * @param c
	 *            the IModel of a {@link ISimpleChart}
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public SimpleChartPanel(String id, IModel<C> c, int width, int height) {
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
			System.out.println(getChart().getOptions().getAnimation());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "WicketCharts['" + getChartCanvas().getMarkupId() + "']." + getChart().getClass().getSimpleName() + "(" + dataString + ", " + optionString + ");";
	}
}
