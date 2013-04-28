package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pingunaut.wicket.chartjs.chart.impl.Bar;

/**
 * The Class BarChartOptions provides options, that are available for
 * {@link Bar}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class BarChartOptions extends AbstractScalableChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The bar show stroke. */
	private Boolean barShowStroke;

	/** The bar stroke width. */
	private Integer barStrokeWidth;

	/** The bar value spacing. */
	private Integer barValueSpacing;

	/** The bar dataset spacing. */
	private Integer barDatasetSpacing;

	/**
	 * Gets the bar show stroke.
	 * 
	 * @return the bar show stroke
	 */
	public Boolean getBarShowStroke() {
		return barShowStroke;
	}

	/**
	 * Sets the bar show stroke.
	 * 
	 * @param barShowStroke
	 *            the new bar show stroke (default is true).
	 */
	public void setBarShowStroke(Boolean barShowStroke) {
		this.barShowStroke = barShowStroke;
	}

	/**
	 * Gets the bar stroke width.
	 * 
	 * @return the bar stroke width
	 */
	public Integer getBarStrokeWidth() {
		return barStrokeWidth;
	}

	/**
	 * Sets the bar stroke width.
	 * 
	 * @param barStrokeWidth
	 *            the new bar stroke width (default is 2).
	 */
	public void setBarStrokeWidth(Integer barStrokeWidth) {
		this.barStrokeWidth = barStrokeWidth;
	}

	/**
	 * Gets the bar value spacing.
	 * 
	 * @return the bar value spacing
	 */
	public Integer getBarValueSpacing() {
		return barValueSpacing;
	}

	/**
	 * Sets the bar value spacing.
	 * 
	 * @param barValueSpacing
	 *            the spacing between each of the X value sets (default is 5)
	 */
	public void setBarValueSpacing(Integer barValueSpacing) {
		this.barValueSpacing = barValueSpacing;
	}

	/**
	 * Gets the bar dataset spacing.
	 * 
	 * @return the bar dataset spacing
	 */
	public Integer getBarDatasetSpacing() {
		return barDatasetSpacing;
	}

	/**
	 * Sets the bar dataset spacing.
	 * 
	 * @param barDatasetSpacing
	 *            the spacing between data sets within X values (default is 1).
	 */
	public void setBarDatasetSpacing(Integer barDatasetSpacing) {
		this.barDatasetSpacing = barDatasetSpacing;
	}

}
