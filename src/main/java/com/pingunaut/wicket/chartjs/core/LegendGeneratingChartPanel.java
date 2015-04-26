/**
 * 
 */
package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.ISimpleChart;
import com.pingunaut.wicket.chartjs.data.SimpleColorValueChartData;
import com.pingunaut.wicket.chartjs.options.AbstractChartOptions;

/**
 * @author Martin Spielmann
 *
 */
public abstract class LegendGeneratingChartPanel<C extends ISimpleChart<D, O>, D extends SimpleColorValueChartData, O extends AbstractChartOptions>
		extends SimpleChartPanel<C, D, O> {

	private static final long serialVersionUID = 3754597810130287433L;

	private String legendMarkupId;

	public LegendGeneratingChartPanel(String id, IModel<? extends C> c) {
		super(id, c);
	}

	public LegendGeneratingChartPanel(String id, IModel<? extends C> c,
			int width, int height) {
		super(id, c, width, height);
	}

	public String getLegendMarkupId() {
		return legendMarkupId;
	}

	public void setLegendMarkupId(String legendMarkupId) {
		this.legendMarkupId = legendMarkupId;
	}

	@Override
	public void renderHead(final IHeaderResponse response) {
		super.renderHead(response);
		if (legendMarkupId != null && !"".equals(legendMarkupId)) {
			CharSequence showLegend = String.format(
					"$('#%1$s').html(%2$s.generateLegend());", legendMarkupId,
					getChartCanvas().getMarkupId());
			response.render(OnDomReadyHeaderItem.forScript(showLegend));
		}
	}

}
