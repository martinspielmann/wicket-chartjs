var WicketCharts = {};
//Get context with jQuery - using jQuery's .get() method.
function buildChart(markupId) {
	var ctx = $('#' + markupId).get(0).getContext('2d');
	return new Chart(ctx);
}
