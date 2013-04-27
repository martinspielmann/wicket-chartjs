package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.options.BarChartOptions;

/**
 * The Interface IBar provides a simple implementation of chart.js bar chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#barChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public interface IBar extends IDataSetChart<BarChartData<BarDataSet>, BarChartOptions, BarDataSet> {

}
