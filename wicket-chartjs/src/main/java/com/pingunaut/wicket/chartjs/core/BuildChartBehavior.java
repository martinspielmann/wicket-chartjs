package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnLoadHeaderItem;

public class BuildChartBehavior extends AbstractDefaultAjaxBehavior {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5935294904099227859L;

	@Override
	protected void respond(AjaxRequestTarget target) {
		// System.out.println(RequestCycle.get().getRequest().getRequestParameters().getParameterValue("chart"));
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);
		// response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" +
		// component.getMarkupId() + "']=buildChart('" + component.getMarkupId()
		// + "');"));
		response.render(OnLoadHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "']=buildChart('" + component.getMarkupId() + "');"));

		if (component.getParent() instanceof AbstractChartPanel) {
			// response.render(OnDomReadyHeaderItem.forScript(((AbstractChartPanel)
			// component.getParent()).generateChart()));
			response.render(OnLoadHeaderItem.forScript(((AbstractChartPanel) component.getParent()).generateChart()));
		}
	}

}
