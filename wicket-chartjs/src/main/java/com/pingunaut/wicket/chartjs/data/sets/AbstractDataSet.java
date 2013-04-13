package com.pingunaut.wicket.chartjs.data.sets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class AbstractDataSet implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1581171902504828797L;
	private String fillColor = "rgba(220,220,220,0.5)";
	private String strokeColor = "rgba(220,220,220,1)";
	private List<Integer> data = new ArrayList<Integer>();

	public AbstractDataSet(List<Integer> values) {
		data = values;
	}

	public AbstractDataSet() {

	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getStrokeColor() {
		return strokeColor;
	}

	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

}
