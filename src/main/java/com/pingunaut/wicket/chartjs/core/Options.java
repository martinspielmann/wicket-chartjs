package com.pingunaut.wicket.chartjs.core;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class Options implements Serializable {

	private Boolean stacked;

	public Boolean isStacked() {
		return stacked;
	}

	public void setStacked(Boolean stacked) {
		this.stacked = stacked;
	}
	
}
