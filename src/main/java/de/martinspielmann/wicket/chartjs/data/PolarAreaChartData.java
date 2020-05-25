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
package de.martinspielmann.wicket.chartjs.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import de.martinspielmann.wicket.chartjs.data.dataset.AbstractDataset;

/**
 * The Class PolarAreaChartData provides chart data used by polar area charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class PolarAreaChartData<T extends AbstractDataset> extends AbstractChartData<T> {

  @JsonIgnore
  private static final long serialVersionUID = 1L;

  public PolarAreaChartData() {

  }


  /**
   * Instantiates a new polar area chart data.
   * 
   * @param value the value
   * @param color the color
   */
  public PolarAreaChartData(Integer value, String color) {
    // TODO reimplement
  }

}
