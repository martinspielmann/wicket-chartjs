/*******************************************************************************
 * Copyright 2016 Martin Spielmann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.example;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

import com.pingunaut.wicket.chartjs.core.panel.BarChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.DoughnutChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.LineChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PieChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PolarAreaChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.RadarChartPanel;
import com.pingunaut.wicket.chartjs.data.BarData;
import com.pingunaut.wicket.chartjs.data.DoughnutData;
import com.pingunaut.wicket.chartjs.data.LineData;
import com.pingunaut.wicket.chartjs.data.PieData;
import com.pingunaut.wicket.chartjs.data.PolarAreaData;
import com.pingunaut.wicket.chartjs.data.RadarData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataset;
import com.pingunaut.wicket.chartjs.data.sets.DoughnutDataset;
import com.pingunaut.wicket.chartjs.data.sets.LineDataset;
import com.pingunaut.wicket.chartjs.data.sets.PieDataset;
import com.pingunaut.wicket.chartjs.data.sets.PolarAreaDataset;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataset;

/**
 * The Class ExamplePage provides a tiny little running example of
 * wicket-chartjs2. to use it, just type mvn jetty:run
 *
 * @author Martin Spielmann
 */
public class ExamplePage extends WebPage {

	private static final long serialVersionUID = -8484356423313672843L;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.apache.wicket.Component#onInitialize()
	 */
	@Override
	protected void onInitialize() {
		super.onInitialize();

		List<String> labels = new ArrayList<String>();
		labels.add("jan");
		labels.add("feb");
		labels.add("mar");
		labels.add("apr");
		labels.add("may");

		List<Number> values1 = new ArrayList<>();
		values1.add(4d);
		values1.add(2d);
		values1.add(6.4563d);
		values1.add(7d);
		values1.add(7.56);

		add(createLineChart(labels, values1));
		add(createPieChart(labels, values1));
		add(createBarChart(labels, values1));
		add(createDoughnutChart(labels, values1));
		add(createRadarChart(labels, values1));
		add(createPolarAreaChart(labels, values1));

	}

	private DoughnutChartPanel createDoughnutChart(List<String> labels, List<Number> values) {
		DoughnutData date = new DoughnutData();
		DoughnutDataset dataset = new DoughnutDataset();
		dataset.addData(values);
		date.getDatasets().add(dataset);
		date.getLabels().addAll(labels);
		DoughnutChartPanel panel = new DoughnutChartPanel("doughnut", Model.of(date));
		return panel;
	}

	private BarChartPanel createBarChart(List<String> labels, List<Number> values) {
		BarData data = new BarData();
		BarDataset dataset = new BarDataset();
		dataset.setLabel("dataset 1");
		dataset.addData(values);
		data.getDatasets().add(dataset);
		data.getLabels().addAll(labels);
		BarChartPanel panel = new BarChartPanel("bar", Model.of(data));
		return panel;
	}

	private PieChartPanel createPieChart(List<String> labels, List<Number> values) {
		PieData data = new PieData();
		data.getLabels().addAll(labels);
		PieDataset dataset = new PieDataset();
		dataset.addData(values);
		data.getDatasets().add(dataset);
		PieChartPanel panel = new PieChartPanel("pie", Model.of(data));
		return panel;
	}

	private LineChartPanel createLineChart(List<String> labels, List<Number> values) {
		LineData data = new LineData();
		data.getLabels().addAll(labels);
		LineDataset dataset = new LineDataset();
		dataset.setLabel("dataset 1");
		dataset.addData(values);
		data.getDatasets().add(dataset);
		LineChartPanel panel = new LineChartPanel("line", Model.of(data));
		return panel;
	}

	private RadarChartPanel createRadarChart(List<String> labels, List<Number> values) {
		RadarData data = new RadarData();
		data.getLabels().addAll(labels);
		RadarDataset dataset = new RadarDataset();
		dataset.setLabel("dataset 1");
		dataset.addData(values);
		data.getDatasets().add(dataset);
		RadarChartPanel panel = new RadarChartPanel("radar", Model.of(data));
		return panel;
	}

	private PolarAreaChartPanel createPolarAreaChart(List<String> labels, List<Number> values) {
		PolarAreaData data = new PolarAreaData();
		data.getLabels().addAll(labels);
		PolarAreaDataset dataset = new PolarAreaDataset();
		dataset.setLabel("dataset 1");
		dataset.addData(values);
		data.getDatasets().add(dataset);
		PolarAreaChartPanel panel = new PolarAreaChartPanel("polarArea", Model.of(data));
		return panel;
	}
}
