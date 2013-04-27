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
import org.apache.wicket.protocol.http.ClientProperties;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

/**
 * The Class ChartBehavior builds the bridge between wicket and chart.js'
 * javascript.
 * 
 * @author Martin Spielmann
 */
public class ChartBehavior extends AbstractDefaultAjaxBehavior {

	private static final long serialVersionUID = 5935294904099227859L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.wicket.ajax.AbstractDefaultAjaxBehavior#respond(org.apache
	 * .wicket.ajax.AjaxRequestTarget)
	 */
	@Override
	protected void respond(AjaxRequestTarget target) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.wicket.ajax.AbstractDefaultAjaxBehavior#renderHead(org.apache
	 * .wicket.Component, org.apache.wicket.markup.head.IHeaderResponse)
	 */
	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);

		// ok, we need jQuery
		response.render(JavaScriptHeaderItem.forReference(JQueryResourceReference.get()));

		// and we need some browser information too
		Application.get().getRequestCycleSettings().setGatherExtendedBrowserInfo(true);
		ClientProperties clientProperties = ((WebSession) Session.get()).getClientInfo().getProperties();
		boolean isIE = clientProperties.isBrowserInternetExplorer();
		boolean isLowerThan9 = clientProperties.getBrowserVersionMajor() < 9;

		// ie lower than 9 doesn't know what to do with canvas and some js... so
		// we'll teach him...
		if (isIE && isLowerThan9) {
			response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "modernizr-2.6.2-respond-1.1.0.min.js")));
			response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "excanvas.js")));
		}

		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "Chart.min.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "bridge.js")));

		// chart.js docs describe a problem with initializing canvas context
		// onDomReady in IE < 9. to avoid that, onLoad is used in that case
		// instead
		if (isIE && isLowerThan9) {
			response.render(OnLoadHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "']=buildChart('" + component.getMarkupId() + "');"));
		} else {
			response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "']=buildChart('" + component.getMarkupId() + "');"));
		}

		if (component.getParent() instanceof AbstractChartPanel) {
			// another IE crap... animation is deactivated for versions < 9
			// because it's not working anyway
			if (isIE && isLowerThan9) {
				response.render(OnLoadHeaderItem.forScript(((AbstractChartPanel) component.getParent()).generateChart()));
				((AbstractChartPanel) component.getParent()).getChart().getOptions().setAnimation(false);
			} else {
				response.render(OnDomReadyHeaderItem.forScript(((AbstractChartPanel) component.getParent()).generateChart()));
			}

		}
	}
}
