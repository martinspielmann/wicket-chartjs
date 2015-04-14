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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class AbstractScalableChartOptions provides some basic options, that are
 * available for all kinds of scalable charts.
 *
 * @author Martin Spielmann
 *
 * @deprecated No Longer used with Chart.js 1.0.2 - Use
 *             {@link AbstractChartOptions} instead
 *
 *
 */
@JsonInclude(Include.NON_NULL)
@Deprecated
public abstract class AbstractScalableChartOptions extends AbstractChartOptions {

   @JsonIgnore
   private static final long serialVersionUID = 5541028648375495668L;

   /** The scale overlay. */
   private Boolean scaleOverlay;

   /** The scale show grid lines. */
   private Boolean scaleShowGridLines;

   /** The scale grid line color. */
   private String scaleGridLineColor;

   /** The scale grid line width. */
   private Integer scaleGridLineWidth;

   /**
    * Gets the scale overlay.
    *
    * @return the scale overlay
    */
   public Boolean getScaleOverlay() {
      return scaleOverlay;
   }

   /**
    * Sets the scale overlay.
    *
    * @param scaleOverlay
    *           decides if the scale above the chart data is shown (default is
    *           false)
    */
   public void setScaleOverlay(final Boolean scaleOverlay) {
      this.scaleOverlay = scaleOverlay;
   }

   /**
    * Gets the scale show grid lines.
    *
    * @return the scale show grid lines
    */
   public Boolean getScaleShowGridLines() {
      return scaleShowGridLines;
   }

   /**
    * Sets the scale show grid lines.
    *
    * @param scaleShowGridLines
    *           decides whether grid lines are shown across the chart (default
    *           is true).
    */
   public void setScaleShowGridLines(final Boolean scaleShowGridLines) {
      this.scaleShowGridLines = scaleShowGridLines;
   }

   /**
    * Gets the scale grid line color.
    *
    * @return the scale grid line color
    */
   public String getScaleGridLineColor() {
      return scaleGridLineColor;
   }

   /**
    * Sets the scale grid line color.
    *
    * @param scaleGridLineColor
    *           the new scale grid line color (default is "rgba(0,0,0,.05)").
    */
   public void setScaleGridLineColor(final String scaleGridLineColor) {
      this.scaleGridLineColor = scaleGridLineColor;
   }

   /**
    * Gets the scale grid line width.
    *
    * @return the scale grid line width
    */
   public Integer getScaleGridLineWidth() {
      return scaleGridLineWidth;
   }

   /**
    * Sets the scale grid line width.
    *
    * @param scaleGridLineWidth
    *           the new scale grid line width (default is 1)
    */
   public void setScaleGridLineWidth(final Integer scaleGridLineWidth) {
      this.scaleGridLineWidth = scaleGridLineWidth;
   }

}
