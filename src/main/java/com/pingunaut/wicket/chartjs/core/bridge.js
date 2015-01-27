var WicketCharts = {};
// Get context with jQuery - using jQuery's .get() method.
function buildChart(markupId) {
	var ctx = $('#' + markupId).get(0).getContext('2d');
//	ctx.canvas.width = $('#' + markupId).parent().width();
//	ctx.canvas.height = $('#' + markupId).parent().height();
	return new Chart(ctx);
}
