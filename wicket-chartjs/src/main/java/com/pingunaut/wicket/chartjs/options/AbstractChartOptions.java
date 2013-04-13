package com.pingunaut.wicket.chartjs.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public abstract class AbstractChartOptions implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 2401861279216541412L;

	// Boolean - If we show the scale above the chart data
	private Boolean scaleOverlay;

	// Boolean - If we want to override with a hard coded scale
	private Boolean scaleOverride;

	// ** Required if scaleOverride is true **
	// Number - The number of steps in a hard coded scale
	private Integer scaleSteps;
	// Number - The value jump in the hard coded scale
	private Integer scaleStepWidth;
	// Number - The scale starting value
	private Integer scaleStartValue;

	// String - Colour of the scale line
	private String scaleLineColor;

	// Number - Pixel width of the scale line
	private Integer scaleLineWidth;

	// Boolean - Whether to show labels on the scale
	private Boolean scaleShowLabels;

	// Interpolated JS string - can access value
	private String scaleLabel;

	// String - Scale label font declaration for the scale label
	private String scaleFontFamily;

	// Number - Scale label font size in pixels
	private Integer scaleFontSize;

	// String - Scale label font weight style
	private String scaleFontStyle;

	// String - Scale label font colour
	private String scaleFontColor;

	// /Boolean - Whether grid lines are shown across the chart
	private Boolean scaleShowGridLines;

	// String - Colour of the grid lines
	private String scaleGridLineColor;

	// Number - Width of the grid lines
	private Integer scaleGridLineWidth;

	// Boolean - Whether the line is curved between points
	private Boolean bezierCurve;

	// Boolean - Whether to show a dot for each point
	private Boolean pointDot;

	// Number - Radius of each point dot in pixels
	private Integer pointDotRadius;

	// Number - Pixel width of point dot stroke
	private Integer pointDotStrokeWidth;

	// Boolean - Whether to show a stroke for datasets
	private Boolean datasetStroke;

	// Number - Pixel width of dataset stroke
	private Integer datasetStrokeWidth;

	// Boolean - Whether to fill the dataset with a colour
	private Boolean datasetFill;

	// Boolean - Whether to animate the chart
	private Boolean animation;

	// Number - Number of animation steps
	private Integer animationSteps;

	// String - Animation easing effect
	private String animationEasing;

	// Function - Fires when the animation is complete
	private String onAnimationComplete;

	public Boolean getScaleOverlay() {
		return scaleOverlay;
	}

	public void setScaleOverlay(Boolean scaleOverlay) {
		this.scaleOverlay = scaleOverlay;
	}

	public Boolean getScaleOverride() {
		return scaleOverride;
	}

	public void setScaleOverride(Boolean scaleOverride) {
		this.scaleOverride = scaleOverride;
	}

	public Integer getScaleSteps() {
		return scaleSteps;
	}

	public void setScaleSteps(Integer scaleSteps) {
		this.scaleSteps = scaleSteps;
	}

	public Integer getScaleStepWidth() {
		return scaleStepWidth;
	}

	public void setScaleStepWidth(Integer scaleStepWidth) {
		this.scaleStepWidth = scaleStepWidth;
	}

	public Integer getScaleStartValue() {
		return scaleStartValue;
	}

	public void setScaleStartValue(Integer scaleStartValue) {
		this.scaleStartValue = scaleStartValue;
	}

	public String getScaleLineColor() {
		return scaleLineColor;
	}

	public void setScaleLineColor(String scaleLineColor) {
		this.scaleLineColor = scaleLineColor;
	}

	public Integer getScaleLineWidth() {
		return scaleLineWidth;
	}

	public void setScaleLineWidth(Integer scaleLineWidth) {
		this.scaleLineWidth = scaleLineWidth;
	}

	public Boolean getScaleShowLabels() {
		return scaleShowLabels;
	}

	public void setScaleShowLabels(Boolean scaleShowLabels) {
		this.scaleShowLabels = scaleShowLabels;
	}

	public String getScaleLabel() {
		return scaleLabel;
	}

	public void setScaleLabel(String scaleLabel) {
		this.scaleLabel = scaleLabel;
	}

	public String getScaleFontFamily() {
		return scaleFontFamily;
	}

	public void setScaleFontFamily(String scaleFontFamily) {
		this.scaleFontFamily = scaleFontFamily;
	}

	public Integer getScaleFontSize() {
		return scaleFontSize;
	}

	public void setScaleFontSize(Integer scaleFontSize) {
		this.scaleFontSize = scaleFontSize;
	}

	public String getScaleFontStyle() {
		return scaleFontStyle;
	}

	public void setScaleFontStyle(String scaleFontStyle) {
		this.scaleFontStyle = scaleFontStyle;
	}

	public String getScaleFontColor() {
		return scaleFontColor;
	}

	public void setScaleFontColor(String scaleFontColor) {
		this.scaleFontColor = scaleFontColor;
	}

	public Boolean getScaleShowGridLines() {
		return scaleShowGridLines;
	}

	public void setScaleShowGridLines(Boolean scaleShowGridLines) {
		this.scaleShowGridLines = scaleShowGridLines;
	}

	public String getScaleGridLineColor() {
		return scaleGridLineColor;
	}

	public void setScaleGridLineColor(String scaleGridLineColor) {
		this.scaleGridLineColor = scaleGridLineColor;
	}

	public Integer getScaleGridLineWidth() {
		return scaleGridLineWidth;
	}

	public void setScaleGridLineWidth(Integer scaleGridLineWidth) {
		this.scaleGridLineWidth = scaleGridLineWidth;
	}

	public Boolean getBezierCurve() {
		return bezierCurve;
	}

	public void setBezierCurve(Boolean bezierCurve) {
		this.bezierCurve = bezierCurve;
	}

	public Boolean getPointDot() {
		return pointDot;
	}

	public void setPointDot(Boolean pointDot) {
		this.pointDot = pointDot;
	}

	public Integer getPointDotRadius() {
		return pointDotRadius;
	}

	public void setPointDotRadius(Integer pointDotRadius) {
		this.pointDotRadius = pointDotRadius;
	}

	public Integer getPointDotStrokeWidth() {
		return pointDotStrokeWidth;
	}

	public void setPointDotStrokeWidth(Integer pointDotStrokeWidth) {
		this.pointDotStrokeWidth = pointDotStrokeWidth;
	}

	public Boolean getDatasetStroke() {
		return datasetStroke;
	}

	public void setDatasetStroke(Boolean datasetStroke) {
		this.datasetStroke = datasetStroke;
	}

	public Integer getDatasetStrokeWidth() {
		return datasetStrokeWidth;
	}

	public void setDatasetStrokeWidth(Integer datasetStrokeWidth) {
		this.datasetStrokeWidth = datasetStrokeWidth;
	}

	public Boolean getDatasetFill() {
		return datasetFill;
	}

	public void setDatasetFill(Boolean datasetFill) {
		this.datasetFill = datasetFill;
	}

	public Boolean getAnimation() {
		return animation;
	}

	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	public Integer getAnimationSteps() {
		return animationSteps;
	}

	public void setAnimationSteps(Integer animationSteps) {
		this.animationSteps = animationSteps;
	}

	public String getAnimationEasing() {
		return animationEasing;
	}

	public void setAnimationEasing(String animationEasing) {
		this.animationEasing = animationEasing;
	}

	public String getOnAnimationComplete() {
		return onAnimationComplete;
	}

	public void setOnAnimationComplete(String onAnimationComplete) {
		this.onAnimationComplete = onAnimationComplete;
	}

}
