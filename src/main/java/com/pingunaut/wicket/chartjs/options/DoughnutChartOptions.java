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
import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;

/**
 * The Class DoughnutChartOptions provides options, that are available for
 * {@link Doughnut}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class DoughnutChartOptions extends PieChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	
	/** The percentage inner cutout. */
	private Integer percentageInnerCutout;

	/**
	 * Gets the percentage inner cutout.
	 * 
	 * @return the percentage inner cutout
	 */
	public Integer getPercentageInnerCutout() {
		return percentageInnerCutout;
	}

	/**
	 * Sets the percentage inner cutout.
	 * 
	 * @param percentageInnerCutout
	 *            the percentage of the chart that we cut out of the middle
	 *            (default is 50).
	 */
	public void setPercentageInnerCutout(Integer percentageInnerCutout) {
		this.percentageInnerCutout = percentageInnerCutout;
	}

}
