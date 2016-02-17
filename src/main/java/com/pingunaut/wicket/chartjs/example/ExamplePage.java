/*******************************************************************************
 * Copyright 2016 Martin Spielmann
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
package com.pingunaut.wicket.chartjs.example;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

import com.pingunaut.wicket.chartjs.core.panel.BarChartPanel;
import com.pingunaut.wicket.chartjs.data.BarData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataset;

/**
 * The Class ExamplePage provides a tiny little running example of
 * wicket-chartjs2. to use it, just type mvn jetty:run
 *
 * @author Martin Spielmann
 */
public class ExamplePage extends WebPage {

   private static final long serialVersionUID = -8484356423313672843L;

   /*
    * (non-Javadoc)
    *
    * @see org.apache.wicket.Component#onInitialize()
    */
   @Override
   protected void onInitialize() {
      super.onInitialize();
//      LineChartPanel lineChartPanel = new LineChartPanel("lineChart", Model.of(new Line()));
//      add(lineChartPanel);
//      PieChartPanel pieChartPanel = new PieChartPanel("pieChart", Model.of(new Pie()));
//      add(pieChartPanel);
//
//      PieChartPanel pieChartWithoutTooltips = new PieChartPanel("pieChartWithoutTooltips", Model.of(new Pie()));
//      add(pieChartWithoutTooltips);
//      pieChartWithoutTooltips.setLegendMarkupId("pieChartLegend");

      List<String> labels = new ArrayList<String>();
      labels.add("jan");
      labels.add("feb");
      labels.add("mar");
      labels.add("apr");
      labels.add("may");

      List<Number> values1 = new ArrayList<>();
      values1.add(4d);
      values1.add(2d);
      values1.add(6.4563d);
      values1.add(7d);
      values1.add(7.56);

      BarData barData = new BarData();
	BarChartPanel barChartPanel = new BarChartPanel("bar", Model.of(barData));
      add(barChartPanel);
      BarDataset barDataSet = new BarDataset();
      barDataSet.setLabel("test set 1");
      barDataSet.setData(values1);
      barData.getDatasets().add(barDataSet);
      barData.getLabels().addAll(labels);
      
      

//      lineChartPanel.getChart().getData().getDatasets().add(new LineDataSet(values1));
//      lineChartPanel.getChart().getData().getLabels().addAll(labels);

//      lineChartPanel.getChart().getOptions()
//            .setCustomTooltips("function(tooltip){var tooltipEl = $('#chartjs-tooltip');"
//                  + "if (!tooltip) {tooltipEl.css({opacity: 0});return;}"
//                  + "tooltipEl.removeClass('above below');tooltipEl.addClass(tooltip.yAlign);"
//                  + "tooltipEl.html('my custom text: '+tooltip.text);var top;if (tooltip.yAlign == 'above') {top = tooltip.y - tooltip.caretHeight - tooltip.caretPadding;"
//                  + "} else {top = tooltip.y + tooltip.caretHeight + tooltip.caretPadding;}tooltipEl.css({"
//                  + "opacity: 1,left: tooltip.chart.canvas.offsetLeft + tooltip.x + 'px',top: tooltip.chart.canvas.offsetTop + top + 'px',"
//                  + "fontFamily: tooltip.fontFamily,fontSize: tooltip.fontSize,fontStyle: tooltip.fontStyle,});}");
//
//      for (Double di : values1) {
//    	  int i = di.intValue();
////         pieChartPanel.getChart().getData().add(new PieChartData(i, "#" + i + i + i));
////         pieChartWithoutTooltips.getChart().getData().add(new PieChartData(i, "#" + (i + 3) + i + i, "label for " + di));
////         pieChartWithoutTooltips.getChart().getOptions().setShowTooltips(Boolean.FALSE);
//      }
   }
}
