package com.pingunaut.wicket.chartjs.core;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

import com.pingunaut.wicket.chartjs.chart.IChart;

/**
 * The Class AbstractChartPanel provides .
 * 
 * @param <C>
 *            the generic type
 */
public abstract class AbstractChartPanel<C extends IChart> extends Panel {

	private static final long serialVersionUID = -5882448897795445250L;

	/** The container holding the canvas. */
	private final WebMarkupContainer wmc;

	/** The width. */
	private int width;

	/** The height. */
	private int height;

	/** The chart. */
	private final IModel<C> chart;

	/**
	 * Instantiates a new abstract chart panel.
	 * 
	 * @param id
	 *            the id
	 * @param c
	 *            the c
	 */
	public AbstractChartPanel(String id, IModel<C> c) {
		super(id, c);
		this.chart = c;
		wmc = new WebMarkupContainer("chart");
	}

	/**
	 * Instantiates a new abstract chart panel.
	 * 
	 * @param id
	 *            the id
	 * @param c
	 *            the c
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public AbstractChartPanel(String id, IModel<C> c, final int width, final int height) {
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

	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Gets the chart.
	 * 
	 * @return the chart
	 */
	public C getChart() {
		return chart.getObject();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.wicket.Component#renderHead(org.apache.wicket.markup.head.
	 * IHeaderResponse)
	 */
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(JavaScriptHeaderItem.forReference(JQueryResourceReference.get()));
		getApplication().getRequestCycleSettings().setGatherExtendedBrowserInfo(true);
		WebSession session = (WebSession) getSession();
		boolean isIE = session.getClientInfo().getProperties().isBrowserInternetExplorer();
		boolean isLowerThan9 = session.getClientInfo().getProperties().getBrowserVersionMajor() < 9;
		if (isIE && isLowerThan9) {
			response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "excanvas.compiled.js")));
		}
		// response.render(JavaScriptHeaderItem.forReference(new
		// JavaScriptResourceReference(AbstractChartPanel.class,
		// "excanvas.compiled.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "Chart.min.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "bridge.js")));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.wicket.Component#onInitialize()
	 */
	@Override
	protected void onInitialize() {
		super.onInitialize();
		add(wmc);
		wmc.setOutputMarkupId(true);
		wmc.add(new BuildChartBehavior());
	}

	/**
	 * Gets the chart canvas.
	 * 
	 * @return the chart canvas
	 */
	public WebMarkupContainer getChartCanvas() {
		return wmc;
	}

	/**
	 * Generate chart.
	 * 
	 * @return the string
	 */
	public abstract String generateChart();
}
