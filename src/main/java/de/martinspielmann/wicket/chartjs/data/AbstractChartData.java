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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.martinspielmann.wicket.chartjs.data.dataset.AbstractDataset;
import de.martinspielmann.wicket.chartjs.data.dataset.property.TextLabel;

/**
 * The Class AbstractChartData provides labels and datasets.
 * 
 * @param <T> the dataset type (has to extend {@link AbstractDataset}
 * 
 * @author Martin Spielmann
 */
public abstract class AbstractChartData<T extends AbstractDataset> implements Serializable {

  @JsonIgnore
  private static final long serialVersionUID = 1L;

  private final List<TextLabel> labels = new ArrayList<>();

  private final List<T> datasets = new ArrayList<>();

  @JsonInclude(value = Include.NON_EMPTY)
  @JsonProperty("xLabels")
  private final List<TextLabel> xLabels = new ArrayList<>();

  @JsonInclude(value = Include.NON_EMPTY)
  @JsonProperty("yLabels")
  private final List<TextLabel> yLabels = new ArrayList<>();

  public List<TextLabel> getLabels() {
    return labels;
  }


  public List<TextLabel> getxLabels() {
    return xLabels;
  }

  public List<TextLabel> getyLabels() {
    return yLabels;
  }


  /**
   * Gets the datasets.
   * 
   * @return the datasets
   */
  public List<T> getDatasets() {
    return datasets;
  }

}
