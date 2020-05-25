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
package de.martinspielmann.wicket.chartjs.chart.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.martinspielmann.wicket.chartjs.chart.IChart;
import de.martinspielmann.wicket.chartjs.core.internal.json.Mapper;
import de.martinspielmann.wicket.chartjs.data.AbstractChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.AbstractDataset;
import de.martinspielmann.wicket.chartjs.options.AbstractChartOptions;

/**
 * AbstractChart provides chart options and a pojo-json mapper to communicate with javascript.
 * 
 * @param <O> the generic type of options (has to extend {@link AbstractChartOptions})
 * 
 * @author Martin Spielmann
 */
public abstract class AbstractChart<D extends AbstractChartData<S>, O extends AbstractChartOptions, S extends AbstractDataset>
    implements IChart<D, O, S> {

  private static final long serialVersionUID = 1L;

  @Override
  public String toJson(O options) throws JsonProcessingException {
    return Mapper.toJson(options);
  }

  @Override
  public String toJson(D data) throws JsonProcessingException {
    return Mapper.toJson(data);
  }

}
