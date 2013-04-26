<h1>This project combines Wicket with chart.js</h1>
<hr />
<h3><small>it's the first library combining charts with wicket, which is completely open source and free to use.
create beautiful charts and graphs in your wicket project. 
no flash, just html, css and javascript.</small></h3>
<h2>project homepage</h2>
[homepage](http://wicket-chartjs.pingunaut.com/).
<h3>Examples</h3>
See the [examples](http://wicket-chartjs.pingunaut.com/examples).



<h3>How to use</h3>

<ol>
<li>using maven? include artifact in your pom.  NOT using maven? download the jar and add it to your classpath (artifact and jar coming soon)</li>
<li>add a new ChartPanel to your Page</li>
<pre>
/*
 * Line Chart
 */
LineChartPanel lineChart = new LineChartPanel("lineChartPanel", Model.of(new Line()));
add(lineChart);
</pre>

<li>fill in some data</li>
<pre>
List<String> labels = new ArrayList<String>();
labels.add("jan");
labels.add("feb");
labels.add("mar");
labels.add("apr");

List<Integer> values1 = new ArrayList<Integer>();
values1.add(4);
values1.add(2);
values1.add(6);
values1.add(7);

List<Integer> values2 = new ArrayList<Integer>();
values2.add(3);
values2.add(4);
values2.add(8);
values2.add(3);

LineChartData<LineDataSet> lineData = new LineChartData<LineDataSet>();
lineData.getDatasets().add(new LineDataSet(values1));
lineData.getDatasets().add(new LineDataSet(values2));

lineChart.getChart().setData(lineData);
lineData.setLabels(labels);
</pre>
<li>add the chart inside your html markup</li>
<pre>
&lt;div wicket:id="lineChartPanel"&gt;&lt;/div&gt;
</pre>
</ol>
<h5>That was it :) That's your first Chart in Java with wicket-chartjs</h5>

<h3>Compatibility</h3>
<ul>
<li>IE 9 and upwards</li>
<li>IE 7 and 8 will be available soon</li>
<li>the rest isn't a problem ;)</li>
<ul>
