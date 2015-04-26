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
package com.pingunaut.wicket.chartjs.core.panel;

import org.apache.wicket.model.IModel;

import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;
import com.pingunaut.wicket.chartjs.core.LegendGeneratingChartPanel;
import com.pingunaut.wicket.chartjs.core.SimpleChartPanel;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;
import com.pingunaut.wicket.chartjs.options.DoughnutChartOptions;

/**
 * The Class DoughnutChartPanel provides a simple implementation of chart.js
 * doughnut chart
 *
 * @see <a href="http://www.chartjs.org/docs/#doughnutChart">chart.js docs</a>
 *
 * @author Martin Spielmann
 *
 */
public class DoughnutChartPanel extends LegendGeneratingChartPanel<Doughnut, DoughnutChartData, DoughnutChartOptions> {

   private static final long serialVersionUID = -7460695892808795726L;

   /**
    * Instantiates a new doughnut chart panel.
    *
    * @param id
    *           the markup id
    * @param c
    *           the IModel of a {@link Doughnut}
    * @param width
    *           the width
    * @param height
    *           the height
    */
   public DoughnutChartPanel(final String id, final IModel<? extends Doughnut> c, final int width, final int height) {
      super(id, c, width, height);
   }

   /**
    * Instantiates a new doughnut chart panel.
    *
    * @param id
    *           the markup id
    * @param c
    *           the IModel of a {@link Doughnut}
    */
   public DoughnutChartPanel(final String id, final IModel<? extends Doughnut> c) {
      super(id, c);
   }
}
