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
package com.pingunaut.wicket.chartjs.data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pingunaut.wicket.chartjs.core.Data;
import com.pingunaut.wicket.chartjs.data.sets.PieDataset;

/**
 * The Class PieData provides chart data used by pie charts.
 *
 * @author Martin Spielmann, Brill Pappin
 */
@JsonInclude(Include.NON_NULL)
public class PieData extends Data {

	private static final long serialVersionUID = -5122104387810776812L;
	
	private final List<PieDataset> datasets = new ArrayList<>();

	public List<PieDataset> getDatasets() {
		return datasets;
	}
}
