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
package com.pingunaut.wicket.chartjs.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pingunaut.wicket.chartjs.chart.impl.AbstractDataSetChart;
import com.pingunaut.wicket.chartjs.data.sets.AbstractBaseDataSet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class AbstractChartData provides labels and datasets. this type of data
 * is used by every {@link AbstractDataSetChart}
 * 
 * @param <T>
 *            the dataset type (has to extend {@link AbstractBaseDataSet}
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public abstract class AbstractChartData<T extends AbstractBaseDataSet> implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -5230056951310645070L;

	/** The labels. */

	private List<String> labels;

	/** The datasets. */
	private List<T> datasets;

	/**
	 * Gets the labels.
	 * 
	 * @return the labels
	 */
	public List<String> getLabels() {
		if (labels == null) {
			labels = new ArrayList<String>();
		}
		return labels;
	}

	/**
	 * Sets the labels.
	 * 
	 * @param labels
	 *            the new labels
	 */
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	/**
	 * Gets the datasets.
	 * 
	 * @return the datasets
	 */
	public List<T> getDatasets() {
		if (datasets == null) {
			datasets = new ArrayList<T>();
		}
		return datasets;
	}

	/**
	 * Sets the datasets.
	 * 
	 * @param datasets
	 *            the new datasets
	 */
	public void setDatasets(List<T> datasets) {
		this.datasets = datasets;
	}
}
