package com.pingunaut.wicket.chartjs.chart;

import com.pingunaut.wicket.chartjs.data.RadarChartData;
import com.pingunaut.wicket.chartjs.data.sets.RadarDataSet;
import com.pingunaut.wicket.chartjs.options.RadarChartOptions;

/**
 * The Interface IRadar provides a simple implementation of chart.js radar chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#radarChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public interface IRadar extends IDataSetChart<RadarChartData<RadarDataSet>, RadarChartOptions, RadarDataSet> {

}
