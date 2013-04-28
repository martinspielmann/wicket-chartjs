package com.pingunaut.wicket.chartjs.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class AbstractChartOptions provides some basic options, that are
 * available for all kinds of charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public abstract class AbstractChartOptions implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 2401861279216541412L;

	/** The animation. */
	private Boolean animation;

	/** The animation steps. */
	private Integer animationSteps;

	/** The animation easing. */
	private String animationEasing;

	/** The on animation complete. */
	private String onAnimationComplete;

	/**
	 * Gets the animation.
	 * 
	 * @return the animation
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * Sets the animation.
	 * 
	 * @param animation
	 *            decides whether to animate the chart (default is true)
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	/**
	 * Gets the animation steps.
	 * 
	 * @return the animation steps
	 */
	public Integer getAnimationSteps() {
		return animationSteps;
	}

	/**
	 * Sets the animation steps.
	 * 
	 * @param animationSteps
	 *            the number of animation steps (default is 60)
	 */
	public void setAnimationSteps(Integer animationSteps) {
		this.animationSteps = animationSteps;
	}

	/**
	 * Gets the animation easing.
	 * 
	 * @return the animation easing
	 */
	public String getAnimationEasing() {
		return animationEasing;
	}

	/**
	 * Sets the animation easing.
	 * 
	 * @param animationEasing
	 *            the animation easing effect (default is "easeOutQuart"F)
	 */
	public void setAnimationEasing(String animationEasing) {
		this.animationEasing = animationEasing;
	}

	/**
	 * Gets the javascript function that fires on animation complete.
	 * 
	 * @return the onAnimationComplete javascript function
	 */
	public String getOnAnimationComplete() {
		return onAnimationComplete;
	}

	/**
	 * Sets the onAnimationComplete javascript function.
	 * 
	 * @param onAnimationComplete
	 *            a function, that fires when the animation is complete
	 */
	public void setOnAnimationComplete(String onAnimationComplete) {
		this.onAnimationComplete = onAnimationComplete;
	}

}
