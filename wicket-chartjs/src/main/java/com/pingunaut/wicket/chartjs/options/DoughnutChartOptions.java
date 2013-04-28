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
