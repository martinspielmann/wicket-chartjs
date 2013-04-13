package com.pingunaut.wicket.chartjs;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.request.cycle.RequestCycle;

public class BuildChartBehavior extends AbstractDefaultAjaxBehavior {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5935294904099227859L;

	@Override
	protected void respond(AjaxRequestTarget target) {
		System.out.println(RequestCycle.get().getRequest().getRequestParameters().getParameterValue("chart"));
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);
		// response.render(OnDomReadyHeaderItem.forScript("Wicket.Ajax.get({'u':'"
		// + getCallbackUrl() + "', 'c':'" + component.getMarkupId() +
		// "', 'ep':{'chart': buildChart('" + component.getMarkupId()
		// + "') }})"));
		response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "'] = buildChart('" + component.getMarkupId() + "');"));
	}

}
