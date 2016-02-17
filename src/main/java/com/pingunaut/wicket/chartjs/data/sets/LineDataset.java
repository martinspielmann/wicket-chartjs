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
package com.pingunaut.wicket.chartjs.data.sets;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pingunaut.wicket.chartjs.data.LineData;

/**
 * The Class LineDataset provides all information needed for
 * {@link LineData}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_EMPTY)
public class LineDataset extends Dataset {

	@JsonIgnore
	private static long serialVersionUID = 1L;

	private String label;

    // Boolean - if true fill the area under the line
	private Boolean fill = false;

    // String - the color to fill the area under the line with if fill is true
    private String backgroundColor= "rgba(220,220,220,0.2)";

    
    // The properties below allow an array to be specified to change the value of the item at the given index

    // String or array - Line color
    private String borderColor= "rgba(220,220,220,1)";

    // String - cap style of the line. See https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap
    private String borderCapStyle= "butt";

    // Array - Length and spacing of dashes. See https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash
//    borderDash: [],

    // Number - Offset for line dashes. See https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset
    private Double borderDashOffset = 0.0;

    // String - line join style. See https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin
    private String borderJoinStyle = "miter";

    // String or array - Point stroke color
    private String pointBorderColor="rgba(220,220,220,1)";

    // String or array - Point fill color
    private String pointBackgroundColor= "#fff";

    // Number or array - Stroke width of point border
    private Integer pointBorderWidth= 1;

    // Number or array - Radius of point when hovered
    private Integer pointHoverRadius= 5;

    // String or array - point background color when hovered
    private String pointHoverBackgroundColor = "rgba(220,220,220,1)";

    // Point border color when hovered
    private String pointHoverBorderColor = "rgba(220,220,220,1)";

    // Number or array - border width of point when hovered
    private Integer pointHoverBorderWidth = 2;

    // Tension - bezier curve tension of the line. Set to 0 to draw straight Wlines connecting points
    private Double tension = 0.1;

    // The actual data
    private final List<Number> data = new ArrayList<>();

    // String - If specified, binds the dataset to a certain y-axis. If not specified, the first y-axis is used.
    private String yAxisID = "y-axis-1";

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getFill() {
		return fill;
	}

	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public String getBorderCapStyle() {
		return borderCapStyle;
	}

	public void setBorderCapStyle(String borderCapStyle) {
		this.borderCapStyle = borderCapStyle;
	}

	public Double getBorderDashOffset() {
		return borderDashOffset;
	}

	public void setBorderDashOffset(Double borderDashOffset) {
		this.borderDashOffset = borderDashOffset;
	}

	public String getBorderJoinStyle() {
		return borderJoinStyle;
	}

	public void setBorderJoinStyle(String borderJoinStyle) {
		this.borderJoinStyle = borderJoinStyle;
	}

	public String getPointBorderColor() {
		return pointBorderColor;
	}

	public void setPointBorderColor(String pointBorderColor) {
		this.pointBorderColor = pointBorderColor;
	}

	public String getPointBackgroundColor() {
		return pointBackgroundColor;
	}

	public void setPointBackgroundColor(String pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	public Integer getPointBorderWidth() {
		return pointBorderWidth;
	}

	public void setPointBorderWidth(Integer pointBorderWidth) {
		this.pointBorderWidth = pointBorderWidth;
	}

	public Integer getPointHoverRadius() {
		return pointHoverRadius;
	}

	public void setPointHoverRadius(Integer pointHoverRadius) {
		this.pointHoverRadius = pointHoverRadius;
	}

	public String getPointHoverBackgroundColor() {
		return pointHoverBackgroundColor;
	}

	public void setPointHoverBackgroundColor(String pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}

	public String getPointHoverBorderColor() {
		return pointHoverBorderColor;
	}

	public void setPointHoverBorderColor(String pointHoverBorderColor) {
		this.pointHoverBorderColor = pointHoverBorderColor;
	}

	public Integer getPointHoverBorderWidth() {
		return pointHoverBorderWidth;
	}

	public void setPointHoverBorderWidth(Integer pointHoverBorderWidth) {
		this.pointHoverBorderWidth = pointHoverBorderWidth;
	}

	public Double getTension() {
		return tension;
	}

	public void setTension(Double tension) {
		this.tension = tension;
	}

	public List<Number> getData() {
		return data;
	}

	public void setData(List<Number> data) {
		this.data.clear();
		this.data.addAll(data);
	}

	public String getyAxisID() {
		return yAxisID;
	}

	public void setyAxisID(String yAxisID) {
		this.yAxisID = yAxisID;
	}
    
}
