/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonRawValue;

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
	
    /** Responsive option. */
    private boolean responsive;
    
	@JsonRawValue
	private String customTooltips;
	
  public String getCustomTooltips() {
    return customTooltips;
  }

  public void setCustomTooltips(String customTooltips) {
    this.customTooltips = customTooltips;
  }

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

    /**
     * Tests whether this chart is responsive or not.
     * 
     * @return true if its responsive, false otherwise.
     */
    public boolean isResponsive() {
        return responsive;
    }

    /**
     * Sets the responsive option for this chart.
     * 
     * @param responsive the responsive option value.
     */
    public void setResponsive(boolean responsive) {
        this.responsive = responsive;
    }

}
