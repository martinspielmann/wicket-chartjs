package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.Application;
import org.apache.wicket.Component;
import org.apache.wicket.Session;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.head.OnLoadHeaderItem;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class BuildChartBehavior extends AbstractDefaultAjaxBehavior {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5935294904099227859L;

	@Override
	protected void respond(AjaxRequestTarget target) {

	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);
		Application.get().getRequestCycleSettings().setGatherExtendedBrowserInfo(true);
		WebSession session = (WebSession) Session.get();

		boolean isIE = session.getClientInfo().getProperties().isBrowserInternetExplorer();
		boolean isLowerThan9 = session.getClientInfo().getProperties().getBrowserVersionMajor() < 9;
		if (isIE && isLowerThan9) {
			response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "modernizr-2.6.2-respond-1.1.0.min.js")));
			response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "excanvas.js")));
			((AbstractChartPanel) component.getParent()).getChart().getOptions().setAnimation(false);
		}

		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "Chart.min.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "bridge.js")));

		if (isIE && isLowerThan9) {
			response.render(OnLoadHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "']=buildChart('" + component.getMarkupId() + "');"));
		} else {
			response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "']=buildChart('" + component.getMarkupId() + "');"));
		}

		if (component.getParent() instanceof AbstractChartPanel) {
			if (isIE && isLowerThan9) {
				response.render(OnLoadHeaderItem.forScript(((AbstractChartPanel) component.getParent()).generateChart()));
			} else {
				response.render(OnDomReadyHeaderItem.forScript(((AbstractChartPanel) component.getParent()).generateChart()));
			}
		}
	}
}
