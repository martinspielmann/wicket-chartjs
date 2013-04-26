package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BarChartOptions extends AbstractChartOptions {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

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

	// Boolean - If there is a stroke on each bar
	private Boolean barShowStroke;

	// Number - Pixel width of the bar stroke
	private Integer barStrokeWidth;

	// Number - Spacing between each of the X value sets
	private Integer barValueSpacing;

	// Number - Spacing between data sets within X values
	private Integer barDatasetSpacing;

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

	public Boolean getBarShowStroke() {
		return barShowStroke;
	}

	public void setBarShowStroke(Boolean barShowStroke) {
		this.barShowStroke = barShowStroke;
	}

	public Integer getBarStrokeWidth() {
		return barStrokeWidth;
	}

	public void setBarStrokeWidth(Integer barStrokeWidth) {
		this.barStrokeWidth = barStrokeWidth;
	}

	public Integer getBarValueSpacing() {
		return barValueSpacing;
	}

	public void setBarValueSpacing(Integer barValueSpacing) {
		this.barValueSpacing = barValueSpacing;
	}

	public Integer getBarDatasetSpacing() {
		return barDatasetSpacing;
	}

	public void setBarDatasetSpacing(Integer barDatasetSpacing) {
		this.barDatasetSpacing = barDatasetSpacing;
	}

}
