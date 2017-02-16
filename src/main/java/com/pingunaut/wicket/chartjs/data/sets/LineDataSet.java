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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pingunaut.wicket.chartjs.data.LineChartData;

import java.util.List;

/**
 * The Class LineDataSet provides all information needed for
 * {@link LineChartData}.
 * 
 * @author Martin Spielmann
 */
public class LineDataSet extends AbstractPointColorDataSet {

	@JsonIgnore
	private static final long serialVersionUID = -3154092519924576329L;

	private String label;

	/**
	 * Instantiates a new line data set.
	 */
	public LineDataSet() {
		super();
	}

	/**
	 * Instantiates a new line data set.
	 * 
	 * @param values
	 *            the values
	 */
	public LineDataSet(List<? extends Number> values) {
		super(values);
	}

	/**
	 * Instantiates a new line data set.
	 * 
	 * @param values
	 *            the values
	 * @param label
	 *            the label
	 */
	public LineDataSet(List<? extends Number> values, String label) {
		super(values);
                this.label = label;
	}

	/**
	 * Gets the label.
	 * 
	 * @return label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

}
