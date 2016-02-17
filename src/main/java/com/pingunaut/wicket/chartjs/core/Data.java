package com.pingunaut.wicket.chartjs.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Data implements Serializable{
	private static final long serialVersionUID = 1L;

	private final List<String> labels = new ArrayList<>();

	public List<String> getLabels() {
		return labels;
	}
}
