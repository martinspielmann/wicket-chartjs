package com.pingunaut.wicket.chartjs.example;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

import com.pingunaut.wicket.chartjs.chart.impl.Line;
import com.pingunaut.wicket.chartjs.chart.impl.Pie;
import com.pingunaut.wicket.chartjs.core.panel.LineChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PieChartPanel;
import com.pingunaut.wicket.chartjs.data.PieChartData;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;

public class ExamplePage extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8484356423313672843L;

	@Override
	protected void onInitialize() {
		super.onInitialize();
		LineChartPanel lineChartPanel = new LineChartPanel("lineChart", Model.of(new Line()));
		add(lineChartPanel);
		PieChartPanel pieChartPanel = new PieChartPanel("pieChart", Model.of(new Pie()));
		add(pieChartPanel);

		List<String> labels = new ArrayList<String>();
		labels.add("jan");
		labels.add("feb");
		labels.add("mar");
		labels.add("apr");

		List<Integer> values1 = new ArrayList<Integer>();
		values1.add(4);
		values1.add(2);
		values1.add(6);
		values1.add(7);

		lineChartPanel.getChart().getData().getDatasets().add(new LineDataSet(values1));
		lineChartPanel.getChart().getData().getLabels().addAll(labels);

		for (Integer i : values1) {
			pieChartPanel.getChart().getData().add(new PieChartData(i, "#" + i + i + i));
		}

	}
}
