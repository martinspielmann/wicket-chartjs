package com.pingunaut.wicket.chartjs.data.sets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LineDataSet extends AbstractDataSet {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1581171902504828797L;
	private String pointColor = "rgba(220,220,220,1)";
	private String pointStrokeColor = "#fff";

	public LineDataSet() {

	}

	public LineDataSet(List<Integer> values) {
		setData(values);
	}

	public String getPointColor() {
		return pointColor;
	}

	public void setPointColor(String pointColor) {
		this.pointColor = pointColor;
	}

	public String getPointStrokeColor() {
		return pointStrokeColor;
	}

	public void setPointStrokeColor(String pointStrokeColor) {
		this.pointStrokeColor = pointStrokeColor;
	}
}
