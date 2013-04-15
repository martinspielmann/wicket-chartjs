package com.pingunaut.wicket.chartjs.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pingunaut.wicket.chartjs.data.sets.AbstractDataSet;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseChartData.
 * 
 * @param <T>
 *            the dataset type (has to extend {@link AbstractDataSet}
 */
public abstract class AbstractChartData<T extends AbstractDataSet> extends SimpleColorValueChartData implements Serializable {

	/** The Constant serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -5230056951310645070L;

	/** The labels. */
	@JsonInclude(Include.NON_NULL)
	private List<String> labels;

	/** The datasets. */
	@JsonInclude(Include.NON_NULL)
	private List<T> datasets;

	/**
	 * Instantiates a new base chart data.
	 */
	public AbstractChartData() {
		// TODO Auto-generated constructor stub
	}

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
