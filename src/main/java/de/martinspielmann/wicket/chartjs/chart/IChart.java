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
package de.martinspielmann.wicket.chartjs.chart;

import java.io.Serializable;
import com.fasterxml.jackson.core.JsonProcessingException;
import de.martinspielmann.wicket.chartjs.data.AbstractChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.AbstractDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.ChartType;
import de.martinspielmann.wicket.chartjs.options.AbstractChartOptions;

/**
 * IChart provides chart options and a pojo-json mapper to communicate with javascript.
 * 
 * @param <O> the generic type of options (has to extend {@link AbstractChartOptions})
 * 
 * @author Martin Spielmann
 */
public interface IChart<D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractDataset>
    extends Serializable {

  String toJson(O options) throws JsonProcessingException;

  String toJson(D data) throws JsonProcessingException;

  /**
   * Gets the options.
   * 
   * @return the charts options. these are the same options, which are available for the pure
   *         javascript <a href="http://chart.js">http://chart.js</a>
   * 
   *         the implementations inside the impl package all override this method to ensure
   *         {@code getOptions()} doesn't return {@code null} , so you won't have to create a new
   *         one by yourself
   */
  O getOptions();

  D getData();

  ChartType getType();

}
