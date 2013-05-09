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
import com.pingunaut.wicket.chartjs.chart.impl.Line;

/**
 * The Class LineChartOptions provides options, that are available for
 * {@link Line}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class LineChartOptions extends AbstractScalableChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The bezier curve. */
	private Boolean bezierCurve;

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

	/**
	 * Gets the bezier curve.
	 * 
	 * @return the bezier curve
	 */
	public Boolean getBezierCurve() {
		return bezierCurve;
	}

	/**
	 * Sets the bezier curve.
	 * 
	 * @param bezierCurve
	 *            decides whether the line is curved between points (default is
	 *            true).
	 */
	public void setBezierCurve(Boolean bezierCurve) {
		this.bezierCurve = bezierCurve;
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
	 *            the new point dot radius (default is 3).
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
	 *            the new point dot stroke width (default is 1).
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
	 *            the new dataset stroke width (default is 2).
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
	 *            whether to fill the dataset with a color (default is true)
	 */
	public void setDatasetFill(Boolean datasetFill) {
		this.datasetFill = datasetFill;
	}

}
