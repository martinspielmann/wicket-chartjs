/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package de.martinspielmann.wicket.chartjs.core;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import de.martinspielmann.wicket.chartjs.chart.IChart;
import de.martinspielmann.wicket.chartjs.data.AbstractChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.AbstractDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.AbstractChartOptions;

/**
 * The Class ChartBehavior builds the bridge between wicket and chart.js' javascript.
 * 
 * @author Martin Spielmann
 */
public class ChartBehavior<C extends IChart<D, O, S>, D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractDataset>
    extends AbstractDefaultAjaxBehavior {

  private static final long serialVersionUID = 1L;
  private static final Logger LOG = LoggerFactory.getLogger(ChartBehavior.class);

  private final IModel<? extends C> chart;

  public ChartBehavior(IModel<? extends C> chart) {
    this.chart = chart;
  }

  @Override
  protected void respond(AjaxRequestTarget target) {

  }

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.wicket.ajax.AbstractDefaultAjaxBehavior#renderHead(org.apache
   * .wicket.Component, org.apache.wicket.markup.head.IHeaderResponse)
   */
  @Override
  public void renderHead(Component component, IHeaderResponse response) {
    super.renderHead(component, response);
    response.render(JavaScriptHeaderItem.forReference(
        new JavaScriptResourceReference(AbstractChartPanel.class, "chartjs/Chart.min.js")));
    response.render(JavaScriptHeaderItem
        .forReference(new JavaScriptResourceReference(AbstractChartPanel.class, "bridge.js")));
    String script =
        "WicketCharts['" + component.getMarkupId() + "'] = new Chart(document.getElementById('"
            + component.getMarkupId() + "').getContext('2d'), " + generateChartConfig() + ");";
    response.render(OnDomReadyHeaderItem.forScript(script));
  }

  protected String generateChartConfig() {
    String dataString = null;
    String optionString = null;
    C c = chart.getObject();
    String typeString = "";
    // if mixed, type has to be set in dataset. otherwise type has to be set here on root level.
    if (!c.getType().equals(ChartType.MIXED)) {
      typeString = "'type': '" + c.getType().getJson() + "',";
    }
    try {
      dataString = c.toJson(c.getData());
      optionString = c.toJson(c.getOptions());
    } catch (JsonProcessingException e) {
      LOG.error("Error generating chartjs configuration", e);
    }
    String chartConfig =
        String.format("{ %s 'data': %s, 'options': %s }", typeString, dataString, optionString);
    return chartConfig;
  }
}
