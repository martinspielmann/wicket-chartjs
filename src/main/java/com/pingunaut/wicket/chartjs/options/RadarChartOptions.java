/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class RadarChartOptions provides options, that are available for.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class RadarChartOptions extends AbstractChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;
	
  private Boolean scaleShowLine = true;

  private Boolean scaleShowLabels = false;

  private Boolean scaleBeginAtZero = true;

  private Integer pointHitDetectionRadius = 20;

  private String legendTemplate = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>";

	/** The scale show label backdrop. */
	private Boolean scaleShowLabelBackdrop;

	/** The scale backdrop color. */
	private String scaleBackdropColor;

	/** The scale backdrop padding y. */
	private Integer scaleBackdropPaddingY;

	/** The scale backdrop padding x. */
	private Integer scaleBackdropPaddingX;

	/** The angle show line out. */
	private Boolean angleShowLineOut;

	/** The angle line color. */
	private String angleLineColor;

	/** The angle line width. */
	private Integer angleLineWidth;

	/** The point label font family. */
	private String pointLabelFontFamily;

	/** The point label font style. */
	private String pointLabelFontStyle;

	/** The point label font size. */
	private Integer pointLabelFontSize;

	/** The point label font color. */
	private String pointLabelFontColor;

	/** The point dot. */
	private Boolean pointDot;

	/** The point dot radius. */
	private Integer pointDotRadius;

	/** The point dot stroke width. */
	private Integer pointDotStrokeWidth;

	/** The dataset stroke. */
	private Boolean datasetStroke;

	/** The dataset stroke width. */
	private Integer datasetStrokeWidth;

	/** The dataset fill. */
	private Boolean datasetFill;

	public Boolean getScaleShowLine() {
    return scaleShowLine;
  }

  public void setScaleShowLine(Boolean scaleShowLine) {
    this.scaleShowLine = scaleShowLine;
  }

  public Boolean getScaleShowLabels() {
    return scaleShowLabels;
  }

  public void setScaleShowLabels(Boolean scaleShowLabels) {
    this.scaleShowLabels = scaleShowLabels;
  }

  public Boolean getScaleBeginAtZero() {
    return scaleBeginAtZero;
  }

  public void setScaleBeginAtZero(Boolean scaleBeginAtZero) {
    this.scaleBeginAtZero = scaleBeginAtZero;
  }

  public Integer getPointHitDetectionRadius() {
    return pointHitDetectionRadius;
  }

  public void setPointHitDetectionRadius(Integer pointHitDetectionRadius) {
    this.pointHitDetectionRadius = pointHitDetectionRadius;
  }

  public String getLegendTemplate() {
    return legendTemplate;
  }

  public void setLegendTemplate(String legendTemplate) {
    this.legendTemplate = legendTemplate;
  }

  /**
	 * Gets the scale show label backdrop.
	 * 
	 * @return the scale show label backdrop
	 */
	public Boolean getScaleShowLabelBackdrop() {
		return scaleShowLabelBackdrop;
	}

	/**
	 * Sets the scale show label backdrop.
	 * 
	 * @param scaleShowLabelBackdrop
	 *            decides whether to show a backdrop to the scale label (default
	 *            is true).
	 */
	public void setScaleShowLabelBackdrop(Boolean scaleShowLabelBackdrop) {
		this.scaleShowLabelBackdrop = scaleShowLabelBackdrop;
	}

	/**
	 * Gets the scale backdrop color.
	 * 
	 * @return the scale backdrop color
	 */
	public String getScaleBackdropColor() {
		return scaleBackdropColor;
	}

	/**
	 * Sets the scale backdrop color.
	 * 
	 * @param scaleBackdropColor
	 *            the new scale backdrop color (default is
	 *            "rgba(255,255,255,0.75)").
	 */
	public void setScaleBackdropColor(String scaleBackdropColor) {
		this.scaleBackdropColor = scaleBackdropColor;
	}

	/**
	 * Gets the scale backdrop padding y.
	 * 
	 * @return the scale backdrop padding y
	 */
	public Integer getScaleBackdropPaddingY() {
		return scaleBackdropPaddingY;
	}

	/**
	 * Sets the scale backdrop padding y.
	 * 
	 * @param scaleBackdropPaddingY
	 *            the backdrop padding above and below the label in pixels
	 *            (default is 2).
	 */
	public void setScaleBackdropPaddingY(Integer scaleBackdropPaddingY) {
		this.scaleBackdropPaddingY = scaleBackdropPaddingY;
	}

	/**
	 * Gets the scale backdrop padding x.
	 * 
	 * @return the scale backdrop padding x
	 */
	public Integer getScaleBackdropPaddingX() {
		return scaleBackdropPaddingX;
	}

	/**
	 * Sets the scale backdrop padding x.
	 * 
	 * @param scaleBackdropPaddingX
	 *            the backdrop padding to the side of the label in pixels
	 *            (default is 2)
	 */
	public void setScaleBackdropPaddingX(Integer scaleBackdropPaddingX) {
		this.scaleBackdropPaddingX = scaleBackdropPaddingX;
	}

	/**
	 * Gets the angle show line out.
	 * 
	 * @return the angle show line out
	 */
	public Boolean getAngleShowLineOut() {
		return angleShowLineOut;
	}

	/**
	 * Sets the angle show line out.
	 * 
	 * @param angleShowLineOut
	 *            decides whether to show the angle lines out of the radar
	 *            (default is true)
	 */
	public void setAngleShowLineOut(Boolean angleShowLineOut) {
		this.angleShowLineOut = angleShowLineOut;
	}

	/**
	 * Gets the angle line color.
	 * 
	 * @return the angle line color
	 */
	public String getAngleLineColor() {
		return angleLineColor;
	}

	/**
	 * Sets the angle line color.
	 * 
	 * @param angleLineColor
	 *            the new angle line color (default is "rgba(0,0,0,.1)").
	 */
	public void setAngleLineColor(String angleLineColor) {
		this.angleLineColor = angleLineColor;
	}

	/**
	 * Gets the angle line width.
	 * 
	 * @return the angle line width
	 */
	public Integer getAngleLineWidth() {
		return angleLineWidth;
	}

	/**
	 * Sets the angle line width.
	 * 
	 * @param angleLineWidth
	 *            the new angle line width (default is 1)
	 */
	public void setAngleLineWidth(Integer angleLineWidth) {
		this.angleLineWidth = angleLineWidth;
	}

	/**
	 * Gets the point label font family.
	 * 
	 * @return the point label font family
	 */
	public String getPointLabelFontFamily() {
		return pointLabelFontFamily;
	}

	/**
	 * Sets the point label font family.
	 * 
	 * @param pointLabelFontFamily
	 *            the new point label font family (default is "'Arial'").
	 */
	public void setPointLabelFontFamily(String pointLabelFontFamily) {
		this.pointLabelFontFamily = pointLabelFontFamily;
	}

	/**
	 * Gets the point label font style.
	 * 
	 * @return the point label font style
	 */
	public String getPointLabelFontStyle() {
		return pointLabelFontStyle;
	}

	/**
	 * Sets the point label font style.
	 * 
	 * @param pointLabelFontStyle
	 *            the new point label font style (default is "normal").
	 */
	public void setPointLabelFontStyle(String pointLabelFontStyle) {
		this.pointLabelFontStyle = pointLabelFontStyle;
	}

	/**
	 * Gets the point label font size.
	 * 
	 * @return the point label font size
	 */
	public Integer getPointLabelFontSize() {
		return pointLabelFontSize;
	}

	/**
	 * Sets the point label font size.
	 * 
	 * @param pointLabelFontSize
	 *            the new point label font size (default is 12).
	 */
	public void setPointLabelFontSize(Integer pointLabelFontSize) {
		this.pointLabelFontSize = pointLabelFontSize;
	}

	/**
	 * Gets the point label font color.
	 * 
	 * @return the point label font color
	 */
	public String getPointLabelFontColor() {
		return pointLabelFontColor;
	}

	/**
	 * Sets the point label font color.
	 * 
	 * @param pointLabelFontColor
	 *            the new point label font color (default is "#666").
	 */
	public void setPointLabelFontColor(String pointLabelFontColor) {
		this.pointLabelFontColor = pointLabelFontColor;
	}

	/**
	 * Gets the point dot.
	 * 
	 * @return the point dot
	 */
	public Boolean getPointDot() {
		return pointDot;
	}

	/**
	 * Sets the point dot.
	 * 
	 * @param pointDot
	 *            decides whether to show a dot for each point (default is
	 *            true).
	 */
	public void setPointDot(Boolean pointDot) {
		this.pointDot = pointDot;
	}

	/**
	 * Gets the point dot radius.
	 * 
	 * @return the point dot radius
	 */
	public Integer getPointDotRadius() {
		return pointDotRadius;
	}

	/**
	 * Sets the point dot radius.
	 * 
	 * @param pointDotRadius
	 *            the new point dot radius (default is 3)
	 */
	public void setPointDotRadius(Integer pointDotRadius) {
		this.pointDotRadius = pointDotRadius;
	}

	/**
	 * Gets the point dot stroke width.
	 * 
	 * @return the point dot stroke width
	 */
	public Integer getPointDotStrokeWidth() {
		return pointDotStrokeWidth;
	}

	/**
	 * Sets the point dot stroke width.
	 * 
	 * @param pointDotStrokeWidth
	 *            the new point dot stroke width (default is 1)
	 */
	public void setPointDotStrokeWidth(Integer pointDotStrokeWidth) {
		this.pointDotStrokeWidth = pointDotStrokeWidth;
	}

	/**
	 * Gets the dataset stroke.
	 * 
	 * @return the dataset stroke
	 */
	public Boolean getDatasetStroke() {
		return datasetStroke;
	}

	/**
	 * Sets the dataset stroke.
	 * 
	 * @param datasetStroke
	 *            decides whether to show a stroke for datasets (default is
	 *            true)
	 */
	public void setDatasetStroke(Boolean datasetStroke) {
		this.datasetStroke = datasetStroke;
	}

	/**
	 * Gets the dataset stroke width.
	 * 
	 * @return the dataset stroke width
	 */
	public Integer getDatasetStrokeWidth() {
		return datasetStrokeWidth;
	}

	/**
	 * Sets the dataset stroke width.
	 * 
	 * @param datasetStrokeWidth
	 *            the new dataset stroke width (default is 2)
	 */
	public void setDatasetStrokeWidth(Integer datasetStrokeWidth) {
		this.datasetStrokeWidth = datasetStrokeWidth;
	}

	/**
	 * Gets the dataset fill.
	 * 
	 * @return the dataset fill
	 */
	public Boolean getDatasetFill() {
		return datasetFill;
	}

	/**
	 * Sets the dataset fill.
	 * 
	 * @param datasetFill
	 *            decides whether to fill the dataset with a color (default is
	 *            true).
	 */
	public void setDatasetFill(Boolean datasetFill) {
		this.datasetFill = datasetFill;
	}
}
