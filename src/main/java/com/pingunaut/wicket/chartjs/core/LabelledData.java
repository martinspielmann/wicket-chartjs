package com.pingunaut.wicket.chartjs.core;

import java.util.ArrayList;
import java.util.List;

public abstract class LabelledData<T> implements Labelled{
	private static final long serialVersionUID = 1L;

	private final List<String> labels = new ArrayList<>();
	private final List<T> datasets = new ArrayList<>();
	
	public List<String> getLabels() {
		return labels;
	}

	public List<T> getDatasets() {
		return datasets;
	}
}
