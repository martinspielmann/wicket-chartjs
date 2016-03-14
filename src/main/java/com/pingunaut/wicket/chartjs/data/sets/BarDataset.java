/*******************************************************************************
 * Copyright 2016 Martin Spielmann
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

import com.pingunaut.wicket.chartjs.data.BarData;

/**
 * The Class BarDataset provides all information needed for {@link BarData}
 * .
 * 
 * @author Martin Spielmann
 */
public class BarDataset extends LabelNumberDataset {

	private static final long serialVersionUID = 1L;

	// String - the color to fill the area under the line with if fill is true
    private String backgroundColor;

    // The properties below allow an array to be specified to change the value of the item at the given index

    // String or array - Line color
    private String borderColor;

    // Number or array - bar border width
    private Integer borderWidth;

    // String or array - fill color when hovered
    private String hoverBackgroundColor;

    // String or array - border color when hovered
    private String hoverBorderColor;

    // String - If specified, binds the dataset to a certain y-axis. If not specified, the first y-axis is used.
    private String yAxisID;

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

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}

	public void setHoverBackgroundColor(String hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

	public String getHoverBorderColor() {
		return hoverBorderColor;
	}

	public void setHoverBorderColor(String hoverBorderColor) {
		this.hoverBorderColor = hoverBorderColor;
	}

	public String getyAxisID() {
		return yAxisID;
	}

	public void setyAxisID(String yAxisID) {
		this.yAxisID = yAxisID;
	}

}
