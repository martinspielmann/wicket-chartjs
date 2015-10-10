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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pingunaut.wicket.chartjs.data.BarChartData;

/**
 * The Class BarDataSet provides all information needed for {@link BarChartData}
 * .
 * 
 * @author Martin Spielmann
 */
public class DoughnutDataSet extends AbstractBaseDataSet {

	@JsonIgnore
	private static final long serialVersionUID = 3095383371272813559L;

	/**
	 * Instantiates a new bar data set.
	 */
	public DoughnutDataSet() {
		super();
	}

	/**
	 * Instantiates a new bar data set.
	 * 
	 * @param values
	 *            the values
	 */
	public DoughnutDataSet(List<Number> values) {
		super(values);
	}

}
