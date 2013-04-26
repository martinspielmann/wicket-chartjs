package com.pingunaut.wicket.chartjs.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public abstract class AbstractChartOptions implements Serializable {

	/**
	 * 
	 */
	@JsonIgnore
	private static final long serialVersionUID = 2401861279216541412L;

	// Boolean - Whether to animate the chart
	private Boolean animation;

	// Number - Number of animation steps
	private Integer animationSteps;

	// String - Animation easing effect
	private String animationEasing;

	// Function - Fires when the animation is complete
	private String onAnimationComplete;

	public Boolean getAnimation() {
		return animation;
	}

	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	public Integer getAnimationSteps() {
		return animationSteps;
	}

	public void setAnimationSteps(Integer animationSteps) {
		this.animationSteps = animationSteps;
	}

	public String getAnimationEasing() {
		return animationEasing;
	}

	public void setAnimationEasing(String animationEasing) {
		this.animationEasing = animationEasing;
	}

	public String getOnAnimationComplete() {
		return onAnimationComplete;
	}

	public void setOnAnimationComplete(String onAnimationComplete) {
		this.onAnimationComplete = onAnimationComplete;
	}

}
