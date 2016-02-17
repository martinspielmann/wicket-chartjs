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
package com.pingunaut.wicket.chartjs.data;

import java.util.ArrayList;
import java.util.List;

import com.pingunaut.wicket.chartjs.core.Data;
import com.pingunaut.wicket.chartjs.data.sets.LineDataset;

/**
 * The Class LineChartData provides chart data used by line charts.
 * 
 * @param <T>
 *            the generic type of it's dataset
 * 
 * @author Martin Spielmann
 */
public class LineData extends Data {

	private static final long serialVersionUID = 1L;

	private final List<LineDataset> datasets = new ArrayList<>();

	public List<LineDataset> getDatasets() {
		return datasets;
	}
}
