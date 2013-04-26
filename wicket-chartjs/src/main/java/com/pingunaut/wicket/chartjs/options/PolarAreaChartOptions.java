package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PolarAreaChartOptions extends AbstractChartOptions {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	// Boolean - Whether we show the scale above or below the chart segments
	private Boolean scaleOverlay;

	// Boolean - If we want to override with a hard coded scale
	private Boolean scaleOverride;

	// ** Required if scaleOverride is true **
	// Number - The number of steps in a hard coded scale
	private Integer scaleSteps;
	// Number - The value jump in the hard coded scale
	private Integer scaleStepWidth;
	// Number - The centre starting value
	private Integer scaleStartValue;

	// Boolean - Show line for each value in the scale
	private Boolean scaleShowLine;

	// String - The colour of the scale line
	private String scaleLineColor;

	// Number - The width of the line - in pixels
	private Integer scaleLineWidth;

	// Boolean - whether we should show text labels
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

	// Boolean - Show a backdrop to the scale label
	private Boolean scaleShowLabelBackdrop;

	// String - The colour of the label backdrop
	private String scaleBackdropColor;

	// Number - The backdrop padding above & below the label in pixels
	private Integer scaleBackdropPaddingY;

	// Number - The backdrop padding to the side of the label in pixels
	private Integer scaleBackdropPaddingX;

	// Boolean - Stroke a line around each segment in the chart
	private Boolean segmentShowStroke;

	// String - The colour of the stroke on each segement.
	private String segmentStrokeColor;

	// Number - The width of the stroke value in pixels
	private Integer segmentStrokeWidth;

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

	public Boolean getScaleShowLine() {
		return scaleShowLine;
	}

	public void setScaleShowLine(Boolean scaleShowLine) {
		this.scaleShowLine = scaleShowLine;
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

	public Boolean getScaleShowLabelBackdrop() {
		return scaleShowLabelBackdrop;
	}

	public void setScaleShowLabelBackdrop(Boolean scaleShowLabelBackdrop) {
		this.scaleShowLabelBackdrop = scaleShowLabelBackdrop;
	}

	public String getScaleBackdropColor() {
		return scaleBackdropColor;
	}

	public void setScaleBackdropColor(String scaleBackdropColor) {
		this.scaleBackdropColor = scaleBackdropColor;
	}

	public Integer getScaleBackdropPaddingY() {
		return scaleBackdropPaddingY;
	}

	public void setScaleBackdropPaddingY(Integer scaleBackdropPaddingY) {
		this.scaleBackdropPaddingY = scaleBackdropPaddingY;
	}

	public Integer getScaleBackdropPaddingX() {
		return scaleBackdropPaddingX;
	}

	public void setScaleBackdropPaddingX(Integer scaleBackdropPaddingX) {
		this.scaleBackdropPaddingX = scaleBackdropPaddingX;
	}

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
}
