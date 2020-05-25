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
package de.martinspielmann.wicket.chartjs.example;

import java.util.List;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.LoadableDetachableModel;
import de.martinspielmann.wicket.chartjs.chart.impl.Bar;
import de.martinspielmann.wicket.chartjs.chart.impl.Mixed;
import de.martinspielmann.wicket.chartjs.core.internal.IndexableOption;
import de.martinspielmann.wicket.chartjs.data.dataset.BarDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.LineDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.data.dataset.property.Label;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.SideSpecificBorderWidth;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.Color;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.ScriptableColor;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;
import de.martinspielmann.wicket.chartjs.data.dataset.property.data.Data;
import de.martinspielmann.wicket.chartjs.data.dataset.property.data.NumberDataValue;
import de.martinspielmann.wicket.chartjs.data.dataset.property.fill.Disabled;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.SimpleNumber;
import de.martinspielmann.wicket.chartjs.panel.BarChartPanel;
import de.martinspielmann.wicket.chartjs.panel.MixedChartPanel;

/**
 * The Class ExamplePage provides a tiny little running example of wicket-chartjs. to use it, just
 * type mvn jetty:run
 *
 * @author Martin Spielmann
 */
public class ExamplePage extends WebPage {

  private static final long serialVersionUID = 1L;

  public ExamplePage() {
    add(new BarChartPanel("bar", LoadableDetachableModel.of(() -> {
      Bar bar = new Bar();
      bar.getData().getLabels()
          .addAll(Label.of("January", "February", "March", "April", "May", "June", "July"));
      BarDataset barDataSet = new BarDataset();
      barDataSet.setLabel("My First dataset");
      barDataSet.setBackgroundColor(new IndexableOption<>(new ScriptableColor("function(context) {"
          + "    var index = context.dataIndex; var value = context.dataset.data[index];"
          + "    return value < 20 ? 'red' : 'green';}")));
      barDataSet.setBorderColor(new IndexableOption<>(new SimpleColor("#f8c")));
      barDataSet.setBorderWidth(new IndexableOption<>(new SideSpecificBorderWidth(1, 2, 3, 4)));
      barDataSet.setData(new Data(NumberDataValue.of(0, 10, 5, 2.5, 20, 30, 45)));
      bar.getData().getDatasets().add(barDataSet);
      return bar;
    })));

    add(new MixedChartPanel("mixed", LoadableDetachableModel.of(() -> {
      Mixed mixed = new Mixed();
      mixed.getData().getLabels().addAll(Label.of("January", "February", "March", "April"));

      LineDataset lineDataSet = new LineDataset();
      lineDataSet.setType(ChartType.LINE);
      lineDataSet.setLabel("Line Dataset");
      lineDataSet.setFill(Disabled.TRUE);
      lineDataSet.setBorderColor(new SimpleColor("#000"));
      IndexableOption<Color> pointBackgroundColor =
          new IndexableOption<>(List.of(new SimpleColor("#f00"), new SimpleColor("#ff0"),
              new SimpleColor("#0f0"), new SimpleColor("#0ff")));
      lineDataSet.setPointBackgroundColor(pointBackgroundColor);
      lineDataSet.setPointRadius(new IndexableOption<>(List.of(new SimpleNumber(10),
          new SimpleNumber(5), new SimpleNumber(10), new SimpleNumber(15))));
      // barDataSet.getBackgroundColor().add(new RgbColor(255, 99, 132));
      // barDataSet.setBorderColor(new RgbColor(255, 99, 132));
      lineDataSet.setData(new Data(NumberDataValue.of(10, 40, 45, 30)));
      mixed.getData().getDatasets().add(lineDataSet);
      BarDataset barDataSet = new BarDataset();
      barDataSet.setType(ChartType.BAR);
      barDataSet.setLabel("Bar Dataset");
      barDataSet.setBackgroundColor(new IndexableOption<>(List.of(new SimpleColor("#00f"),
          new SimpleColor("#06f"), new SimpleColor("#0ff"), new SimpleColor("#dff"))));
      // barDataSet.setBorderColor(new Color(255, 99, 132));
      barDataSet.setData(new Data(NumberDataValue.of(10, 20, 30, 40)));
      mixed.getData().getDatasets().add(barDataSet);
      return mixed;
    })));

    //
    // LineChartPanel lineChartPanel = new LineChartPanel("lineChart", Model.of(new Line()));
    // add(lineChartPanel);
    // PieChartPanel pieChartPanel = new PieChartPanel("pieChart", Model.of(new Pie()));
    // add(pieChartPanel);
    //
    // PieChartPanel pieChartWithoutTooltips =
    // new PieChartPanel("pieChartWithoutTooltips", Model.of(new Pie()));
    // add(pieChartWithoutTooltips);
    // //
    //
    // List<Double> values1 = new ArrayList<>();
    // values1.add(4d);
    // values1.add(2d);
    // values1.add(6.4563d);
    // values1.add(7d);
    // values1.add(7.56);
    //
    //
    //
    // lineChartPanel.getChart().getData().getDatasets().add(new LineDataSet(values1));
    // lineChartPanel.getChart().getData().setLabels(labels);
    //
    // Tooltips t = new Tooltips();
    // t.setCustom(new JavaScriptReference("function(tooltip){var tooltipEl =
    // $('#chartjs-tooltip');"
    // + "if (!tooltip) {tooltipEl.css({opacity: 0});return;}"
    // + "tooltipEl.removeClass('above below');tooltipEl.addClass(tooltip.yAlign);"
    // + "tooltipEl.html('my custom text: '+tooltip.text);var top;if (tooltip.yAlign == 'above')
    // {top = tooltip.y - tooltip.caretHeight - tooltip.caretPadding;"
    // + "} else {top = tooltip.y + tooltip.caretHeight + tooltip.caretPadding;}tooltipEl.css({"
    // + "opacity: 1,left: tooltip.chart.canvas.offsetLeft + tooltip.x + 'px',top:
    // tooltip.chart.canvas.offsetTop + top + 'px',"
    // + "fontFamily: tooltip.fontFamily,fontSize: tooltip.fontSize,fontStyle:
    // tooltip.fontStyle,});}"));
    // lineChartPanel.getChart().getOptions().setTooltips(t);
    //
    // for (Double di : values1) {
    // int i = di.intValue();
    // pieChartPanel.getChart().getData().add(new PieChartData(i, "#" + i + i + i));
    // pieChartWithoutTooltips.getChart().getData()
    // .add(new PieChartData(i, "#" + (i + 3) + i + i, "label for " + di));
    // pieChartWithoutTooltips.getChart().getOptions().getTooltips().setEnabled(Boolean.FALSE);
    // }
  }

}
