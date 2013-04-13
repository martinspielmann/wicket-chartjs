package com.pingunaut.wicket.chartjs.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pingunaut.wicket.chartjs.data.sets.AbstractDataSet;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseChartData.
 * 
 * @param <T>
 *            the dataset type (has to extend {@link AbstractDataSet}
 */
public abstract class AbstractChartData<T extends AbstractDataSet> implements Serializable {

	/** The Constant serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -5230056951310645070L;

	/** The labels. */
	List<String> labels = new ArrayList<String>();

	/** The datasets. */
	List<T> datasets = new ArrayList<T>();

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
