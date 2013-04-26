package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PieChartOptions extends AbstractChartOptions {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	private Boolean segmentShowStroke;

	// String - The colour of each segment stroke
	private String segmentStrokeColor;

	// Number - The width of each segment stroke
	private Integer segmentStrokeWidth;

	// Boolean - Whether we animate the rotation of the Pie
	private Boolean animateRotate;

	// Boolean - Whether we animate scaling the Pie from the centre
	private Boolean animateScale;

	public Boolean getSegmentShowStroke() {
		return segmentShowStroke;
	}

	public void setSegmentShowStroke(Boolean segmentShowStroke) {
		this.segmentShowStroke = segmentShowStroke;
	}

	public String getSegmentStrokeColor() {
		return segmentStrokeColor;
	}

	public void setSegmentStrokeColor(String segmentStrokeColor) {
		this.segmentStrokeColor = segmentStrokeColor;
	}

	public Integer getSegmentStrokeWidth() {
		return segmentStrokeWidth;
	}

	public void setSegmentStrokeWidth(Integer segmentStrokeWidth) {
		this.segmentStrokeWidth = segmentStrokeWidth;
	}

	public Boolean getAnimateRotate() {
		return animateRotate;
	}

	public void setAnimateRotate(Boolean animateRotate) {
		this.animateRotate = animateRotate;
	}

	public Boolean getAnimateScale() {
		return animateScale;
	}

	public void setAnimateScale(Boolean animateScale) {
		this.animateScale = animateScale;
	}

}