/*******************************************************************************
 * Copyright 2013 Martin Spielmann
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
package com.pingunaut.wicket.chartjs.core;

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
  private boolean isCanvasSupported;

  public ChartBehavior() {
    super();
  }

  public boolean isCanvasSupported() {
    return isCanvasSupported;
  }

  public void setCanvasSupported(boolean isCanvasSupported) {
    this.isCanvasSupported = isCanvasSupported;
  }

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

    ClientProperties clientProperties = ((WebSession) Session.get()).getClientInfo().getProperties();
    boolean isIE = clientProperties.isBrowserInternetExplorer();
    boolean isLowerThan9 = clientProperties.getBrowserVersionMajor() < 9;
    isCanvasSupported = !(isIE && isLowerThan9);
    // ie lower than 9 doesn't know what to do with canvas and some js... so
    // we'll teach him...
    if (!isCanvasSupported) {
      response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "modernizr-2.6.2-respond-1.1.0.min.js")));
      response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "excanvas.js")));
    }

    response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "chartjs/Chart.min.js")));
    response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "bridge.js")));

    // chart.js docs describe a problem with initializing canvas context
    // onDomReady in IE < 9. to avoid that, onLoad is used in that case
    // instead
    if (isCanvasSupported) {
      response.render(OnDomReadyHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "']=buildChart('" + component.getMarkupId() + "');"));
    } else {
      response.render(OnLoadHeaderItem.forScript("WicketCharts['" + component.getMarkupId() + "']=buildChart('" + component.getMarkupId() + "');"));

    }

    if (component.getParent() instanceof AbstractChartPanel) {
      // another IE crap... animation is deactivated for versions < 9
      // because it's not working anyway
      if (isCanvasSupported) {
        response.render(OnDomReadyHeaderItem.forScript(((AbstractChartPanel) component.getParent()).generateChart()));
      } else {
        ((AbstractChartPanel) component.getParent()).getChart().getOptions().setAnimation(false);
        response.render(OnLoadHeaderItem.forScript(((AbstractChartPanel) component.getParent()).generateChart()));
      }

    }
  }
}
