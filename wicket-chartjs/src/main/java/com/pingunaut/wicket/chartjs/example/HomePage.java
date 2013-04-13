package com.pingunaut.wicket.chartjs.example;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.pingunaut.wicket.chartjs.chart.impl.Bar;
import com.pingunaut.wicket.chartjs.chart.impl.Line;
import com.pingunaut.wicket.chartjs.chart.impl.Radar;
import com.pingunaut.wicket.chartjs.core.ChartPanel;
import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.LineChartData;
import com.pingunaut.wicket.chartjs.data.RadarChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataSet;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
	public HomePage(final PageParameters parameters) {

		/*
		 * Shared data
		 */
		List<String> labels = new ArrayList<String>();
		labels.add("jan");
		labels.add("feb");
		labels.add("mar");
		labels.add("apr");
		labels.add("may");
		labels.add("jun");
		labels.add("jul");
		labels.add("aug");
		labels.add("sep");
		labels.add("oct");
		labels.add("nov");
		labels.add("dez");

		List<Integer> values1 = new ArrayList<Integer>();
		values1.add(4);
		values1.add(2);
		values1.add(6);
		values1.add(7);
		values1.add(4);
		values1.add(3);
		values1.add(6);
		values1.add(7);
		values1.add(4);
		values1.add(9);
		values1.add(6);
		values1.add(7);

		List<Integer> values2 = new ArrayList<Integer>();
		values2.add(3);
		values2.add(4);
		values2.add(8);
		values2.add(3);
		values2.add(5);
		values2.add(4);
		values2.add(8);
		values2.add(3);
		values2.add(3);
		values2.add(4);
		values2.add(8);
		values2.add(1);

		/*
		 * Line Chart
		 */
		ChartPanel<Line> lineChart = new ChartPanel<Line>("lineChartPanel", new Line());
		add(lineChart);

		LineChartData<LineDataSet> lineData = new LineChartData<LineDataSet>();
		lineChart.getChart().setData(lineData);
		lineData.setLabels(labels);

		lineData.getDatasets().add(new LineDataSet(values1));
		lineData.getDatasets().add(new LineDataSet(values2));

		/*
		 * Bar Chart
		 */
		// set a custom size
		ChartPanel<Bar> bar = new ChartPanel<Bar>("barChartPanel", new Bar(), 400, 300);
		add(bar);

		BarChartData<BarDataSet> barData = new BarChartData<BarDataSet>();
		bar.getChart().setData(barData);
		barData.setLabels(labels);

		barData.getDatasets().add(new BarDataSet(values1));
		BarDataSet barDataSet2 = new BarDataSet(values2);
		barDataSet2.setFillColor("#678");
		barDataSet2.setStrokeColor("#567");
		barData.getDatasets().add(barDataSet2);

		/*
		 * Radar Chart
		 */
		// set a custom size
		ChartPanel<Radar> radar = new ChartPanel<Radar>("radarChartPanel", new Radar(), 400, 400);
		add(radar);

		RadarChartData<RadarDataSet> radarData = new RadarChartData<RadarDataSet>();
		radar.getChart().setData(radarData);
		radarData.setLabels(labels);

		radarData.getDatasets().add(new RadarDataSet(values1));
		RadarDataSet radarDataSet2 = new RadarDataSet(values2);
		radarDataSet2.setFillColor("#456");
		radarDataSet2.setStrokeColor("#345");
		radarDataSet2.setPointColor("#234");
		radarDataSet2.setPointStrokeColor("#123");
		radarData.getDatasets().add(radarDataSet2);
	}
}
