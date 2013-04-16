package com.pingunaut.wicket.chartjs.example;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.pingunaut.wicket.chartjs.chart.impl.Bar;
import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;
import com.pingunaut.wicket.chartjs.chart.impl.Line;
import com.pingunaut.wicket.chartjs.chart.impl.Pie;
import com.pingunaut.wicket.chartjs.chart.impl.PolarArea;
import com.pingunaut.wicket.chartjs.chart.impl.Radar;
import com.pingunaut.wicket.chartjs.core.DataSetChartPanel;
import com.pingunaut.wicket.chartjs.core.SimpleChartPanel;
import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.LineChartData;
import com.pingunaut.wicket.chartjs.data.RadarChartData;
import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataSet;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6334467490104772803L;

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
		Line line = new Line();
		LineChartData<LineDataSet> lineData = new LineChartData<LineDataSet>();
		line.setData(lineData);
		lineData.setLabels(labels);

		lineData.getDatasets().add(new LineDataSet(values1));

		// Set custom colors
		LineDataSet lineDataSet2 = new LineDataSet(values2);
		lineDataSet2.setPointColor("rgba(151,187,205,1)").setPointStrokeColor("#fff").setFillColor("rgba(151,187,205,0.5)").setStrokeColor("rgba(151,187,205,1)");
		lineData.getDatasets().add(lineDataSet2);

		DataSetChartPanel<Line> lineChart = new DataSetChartPanel<Line>("lineChartPanel", Model.of(line), 400, 300);
		add(lineChart);

		/*
		 * Bar Chart
		 */

		DataSetChartPanel<Bar> barChart = new DataSetChartPanel<Bar>("barChartPanel", Model.of(new Bar()), 400, 300);
		add(barChart);

		BarChartData<BarDataSet> barData = new BarChartData<BarDataSet>();
		barChart.getChart().setData(barData);
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
		DataSetChartPanel<Radar> radar = new DataSetChartPanel<Radar>("radarChartPanel", Model.of(new Radar()), 400, 400);
		add(radar);

		RadarChartData<RadarDataSet> radarData = new RadarChartData<RadarDataSet>();
		radar.getChart().setData(radarData);
		radarData.setLabels(labels);

		radarData.getDatasets().add(new RadarDataSet(values1));
		RadarDataSet radarDataSet2 = new RadarDataSet(values2);
		radarDataSet2.setPointColor("rgba(151,187,205,1)").setPointStrokeColor("#fff").setFillColor("rgba(151,187,205,0.5)").setStrokeColor("rgba(151,187,205,1)");
		radarData.getDatasets().add(radarDataSet2);

		/*
		 * Pie Chart
		 */
		// set a custom size
		SimpleChartPanel<Pie> pie = new SimpleChartPanel<Pie>("pieChartPanel", Model.of(new Pie()), 400, 400);
		add(pie);

		List<SimpleColorValueChartData> pieData = new ArrayList<SimpleColorValueChartData>();
		for (Integer i : values1) {
			pieData.add(new SimpleColorValueChartData(i, "#" + (i + 2) + i + i));
		}
		pie.getChart().setData(pieData);

		/*
		 * Polar Area Chart
		 */
		// set a custom size
		SimpleChartPanel<PolarArea> polarArea = new SimpleChartPanel<PolarArea>("polarAreaChartPanel", Model.of(new PolarArea()), 400, 400);
		add(polarArea);

		List<SimpleColorValueChartData> polarData = new ArrayList<SimpleColorValueChartData>();
		for (Integer i : values1) {
			polarData.add(new SimpleColorValueChartData(i, "#" + i + (i + 2) + i));
		}
		polarArea.getChart().setData(polarData);

		/*
		 * Doughnut Chart
		 */
		// set a custom size
		SimpleChartPanel<Doughnut> doughnut = new SimpleChartPanel<Doughnut>("doughnutChartPanel", Model.of(new Doughnut()), 400, 400);
		add(doughnut);

		List<SimpleColorValueChartData> doughnutData = new ArrayList<SimpleColorValueChartData>();
		for (Integer i : values1) {
			doughnutData.add(new SimpleColorValueChartData(i, "#" + i + i + (i + 3)));
		}
		doughnut.getChart().setData(doughnutData);

	}
}
