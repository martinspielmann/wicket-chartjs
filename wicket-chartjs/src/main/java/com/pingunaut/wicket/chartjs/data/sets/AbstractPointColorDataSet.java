package com.pingunaut.wicket.chartjs.data.sets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public abstract class AbstractPointColorDataSet extends AbstractBaseDataSet {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 1581171902504828797L;
	private String pointColor = "rgba(220,220,220,1)";
	private String pointStrokeColor = "#fff";

	public AbstractPointColorDataSet() {

	}

	public AbstractPointColorDataSet(List<Integer> values) {
		setData(values);
	}

	public String getPointColor() {
		return pointColor;
	}

	public AbstractPointColorDataSet setPointColor(String pointColor) {
		this.pointColor = pointColor;
		return this;
	}

	public String getPointStrokeColor() {
		return pointStrokeColor;
	}

	public AbstractPointColorDataSet setPointStrokeColor(String pointStrokeColor) {
		this.pointStrokeColor = pointStrokeColor;
		return this;
	}
}
