package com.pingunaut.wicket.chartjs.core.js;

public enum ChartType {
	LINE("line"), BAR("bar"), RADAR("radar"), POLAR_AREA("polarArea"), PIE("pie"), DOUGHNUT("doughnut");
	
	private String jsTypeName;

	ChartType(String type){
		this.jsTypeName = type;
	}

	public String getJsTypeName() {
		return jsTypeName;
	}
	
}
