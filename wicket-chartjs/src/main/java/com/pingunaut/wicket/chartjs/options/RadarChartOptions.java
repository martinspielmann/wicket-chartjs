package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RadarChartOptions extends AbstractChartOptions {

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
	// Number - The centre starting value
	private Integer scaleStartValue;

	// Boolean - Whether to show lines for each scale point
	private Boolean scaleShowLine;

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

	// Boolean - Show a backdrop to the scale label
	private Boolean scaleShowLabelBackdrop;

	// String - The colour of the label backdrop
	private String scaleBackdropColor;

	// Number - The backdrop padding above & below the label in pixels
	private Integer scaleBackdropPaddingY;

	// Number - The backdrop padding to the side of the label in pixels
	private Integer scaleBackdropPaddingX;

	// Boolean - Whether we show the angle lines out of the radar
	private Boolean angleShowLineOut;

	// String - Colour of the angle line
	private String angleLineColor;

	// Number - Pixel width of the angle line
	private Integer angleLineWidth;

	// String - Point label font declaration
	private String pointLabelFontFamily;

	// String - Point label font weight
	private String pointLabelFontStyle;

	// Number - Point label font size in pixels
	private Integer pointLabelFontSize;

	// String - Point label font colour
	private String pointLabelFontColor;

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

	public Boolean getAngleShowLineOut() {
		return angleShowLineOut;
	}

	public void setAngleShowLineOut(Boolean angleShowLineOut) {
		this.angleShowLineOut = angleShowLineOut;
	}

	public String getAngleLineColor() {
		return angleLineColor;
	}

	public void setAngleLineColor(String angleLineColor) {
		this.angleLineColor = angleLineColor;
	}

	public Integer getAngleLineWidth() {
		return angleLineWidth;
	}

	public void setAngleLineWidth(Integer angleLineWidth) {
		this.angleLineWidth = angleLineWidth;
	}

	public String getPointLabelFontFamily() {
		return pointLabelFontFamily;
	}

	public void setPointLabelFontFamily(String pointLabelFontFamily) {
		this.pointLabelFontFamily = pointLabelFontFamily;
	}

	public String getPointLabelFontStyle() {
		return pointLabelFontStyle;
	}

	public void setPointLabelFontStyle(String pointLabelFontStyle) {
		this.pointLabelFontStyle = pointLabelFontStyle;
	}

	public Integer getPointLabelFontSize() {
		return pointLabelFontSize;
	}

	public void setPointLabelFontSize(Integer pointLabelFontSize) {
		this.pointLabelFontSize = pointLabelFontSize;
	}

	public String getPointLabelFontColor() {
		return pointLabelFontColor;
	}

	public void setPointLabelFontColor(String pointLabelFontColor) {
		this.pointLabelFontColor = pointLabelFontColor;
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
}
