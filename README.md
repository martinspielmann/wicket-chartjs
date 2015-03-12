<h1>This project combines Wicket with chart.js</h1>
<p>this project provides all chart.js charts. 
it is completely open source and free to use (also in commercial projects). 
create beautiful charts and graphs in your wicket project. no flash, just html, css and javascript.</p>
<h2>project homepage</h2>
[homepage](http://pingunaut.com/wicket-chartjs).

<h3>How to use</h3>

<ol>
<li>include maven artifact in your pom</li>
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

LineChartData<LineDataSet> lineData = new LineChartData<LineDataSet>();
lineData.getDatasets().add(new LineDataSet(values1));

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
<li>IE 7 and 8 in parts</li>
<li>others are not a problem ;)</li>
<ul>
