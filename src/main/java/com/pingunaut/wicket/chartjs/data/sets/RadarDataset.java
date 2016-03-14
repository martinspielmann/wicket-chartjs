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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pingunaut.wicket.chartjs.data.RadarData;

/**
 * The Class RadarDataset provides all information needed for
 * {@link RadarData}.
 * 
 * @author Martin Spielmann
 */
public class RadarDataset extends LabelNumberDataset {

	@JsonIgnore
	private static final long serialVersionUID = -3154092519924576329L;

    // String - the color to fill the area under the line with if fill is true
    private String backgroundColor;

    // String or array - Line color
    private String borderColor;
    
    // String or array - Point fill color
    private String pointBackgroundColor;
    
    // String or array - Point stroke color
    private String pointBorderColor;

    // String or array - point background color when hovered
    private String pointHoverBackgroundColor;

    // Point border color when hovered
    private String pointHoverBorderColor;

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
}
