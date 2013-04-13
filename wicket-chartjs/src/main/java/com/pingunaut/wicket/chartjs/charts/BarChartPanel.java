package com.pingunaut.wicket.chartjs.charts;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pingunaut.wicket.chartjs.ChartPanel;
import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.options.LineChartOptions;

public class BarChartPanel extends ChartPanel<BarChartData<BarDataSet>, LineChartOptions> {
	private static final long serialVersionUID = 5105703348335788268L;

	@Override
	protected void onInitialize() {
		super.onInitialize();
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		String dataString = null;
		try {
			dataString = getMapper().writeValueAsString(getData());
			System.out.println(dataString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" + getChartCanvas().getMarkupId() + "'].Bar(" + dataString + ", " + getOptions() + ");"));
	}

	public BarChartPanel(String id) {
		super(id);
	}

	public BarChartPanel(String id, IModel<?> model) {
		super(id, model);
	}

	public BarChartPanel(String id, int width, int height) {
		super(id, width, height);
	}

	public BarChartPanel(String id, IModel<?> model, int width, int height) {
		super(id, model, width, height);
	}
}
