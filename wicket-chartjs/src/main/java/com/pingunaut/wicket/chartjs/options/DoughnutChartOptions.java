package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DoughnutChartOptions extends PieChartOptions {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;
	// The percentage of the chart that we cut out of the middle.
	private Integer percentageInnerCutout;

	public Integer getPercentageInnerCutout() {
		return percentageInnerCutout;
	}

	public void setPercentageInnerCutout(Integer percentageInnerCutout) {
		this.percentageInnerCutout = percentageInnerCutout;
	}

}
