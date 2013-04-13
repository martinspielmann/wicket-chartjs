package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.chart.IChart;

public class ChartPanel<C extends IChart> extends Panel {

	private static final long serialVersionUID = -5882448897795445250L;
	private final WebMarkupContainer wmc;

	private int width;
	private int height;
	private final C chart;

	public ChartPanel(String id, C c) {
		super(id);
		this.chart = c;
		wmc = new WebMarkupContainer("chart");
	}

	public ChartPanel(String id, C c, final int width, final int height) {
		super(id);
		this.chart = c;
		this.width = width;
		this.height = height;
		wmc = new WebMarkupContainer("chart") {
			private static final long serialVersionUID = 3385419188467369696L;

			@Override
			protected void onComponentTag(ComponentTag tag) {
				super.onComponentTag(tag);
				tag.append("width", String.valueOf(width), " ");
				tag.append("height", String.valueOf(height), " ");
			}
		};
	}

	public int getWidth() {
		return width;
	}

	//
	// public void setWidth(int width) {
	// this.width = width;
	// }

	public int getHeight() {
		return height;
	}

	//
	// public void setHeight(int height) {
	// this.height = height;
	// }

	public C getChart() {
		return chart;
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(JavaScriptHeaderItem.forReference(JQueryResourceReference.get()));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(ChartPanel.class, "Chart.min.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(ChartPanel.class, "excanvas.compiled.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(ChartPanel.class, "bridge.js")));

		String dataString = null;
		try {
			dataString = chart.getMapper().writeValueAsString(chart.getData());
			System.out.println(dataString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" + getChartCanvas().getMarkupId() + "']." + chart.getClass().getSimpleName() + "(" + dataString + ", " + chart.getOptions()
				+ ");"));

	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(wmc);
		wmc.setOutputMarkupId(true);
		wmc.add(new BuildChartBehavior());
	}

	public WebMarkupContainer getChartCanvas() {
		return wmc;
	}

}
