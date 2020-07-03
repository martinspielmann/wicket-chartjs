package de.martinspielmann.wicket.chartjs.options.properties;

import java.io.Serializable;

public class Axes implements Serializable {

  private static final long serialVersionUID = 1L;
  private Boolean display;
  private Number weight;
  private Ticks ticks;
  private Boolean stacked;
  private Boolean beginAtZero;

  private Function beforeUpdate;
  private Function beforeSetDimensions;
  private Function afterSetDimensions;
  private Function beforeDataLimits;
  private Function afterDataLimits;
  private Function beforeBuildTicks;
  private Function afterBuildTicks;
  private Function beforeTickToLabelConversion;
  private Function afterTickToLabelConversion;
  private Function beforeCalculateTickRotation;
  private Function afterCalculateTickRotation;
  private Function beforeFit;
  private Function afterFit;
  private Function afterUpdate;



  /**
   * @return the stacked
   */
  public Boolean getStacked() {
    return stacked;
  }

  /**
   * @param stacked the stacked to set
   */
  public void setStacked(Boolean stacked) {
    this.stacked = stacked;
  }

  /**
   * @return the ticks
   */
  public Ticks getTicks() {
    return ticks;
  }

  /**
   * @param ticks the ticks to set
   */
  public void setTicks(Ticks ticks) {
    this.ticks = ticks;
  }

  /**
   * @return the display
   */
  public Boolean getDisplay() {
    return display;
  }

  /**
   * @param display the display to set
   */
  public void setDisplay(Boolean display) {
    this.display = display;
  }

  /**
   * @return the weight
   */
  public Number getWeight() {
    return weight;
  }

  /**
   * @param weight the weight to set
   */
  public void setWeight(Number weight) {
    this.weight = weight;
  }

  /**
   * @return the beforeUpdate
   */
  public Function getBeforeUpdate() {
    return beforeUpdate;
  }

  /**
   * @param beforeUpdate the beforeUpdate to set
   */
  public void setBeforeUpdate(Function beforeUpdate) {
    this.beforeUpdate = beforeUpdate;
  }

  /**
   * @return the beforeSetDimensions
   */
  public Function getBeforeSetDimensions() {
    return beforeSetDimensions;
  }

  /**
   * @param beforeSetDimensions the beforeSetDimensions to set
   */
  public void setBeforeSetDimensions(Function beforeSetDimensions) {
    this.beforeSetDimensions = beforeSetDimensions;
  }

  /**
   * @return the afterSetDimensions
   */
  public Function getAfterSetDimensions() {
    return afterSetDimensions;
  }

  /**
   * @param afterSetDimensions the afterSetDimensions to set
   */
  public void setAfterSetDimensions(Function afterSetDimensions) {
    this.afterSetDimensions = afterSetDimensions;
  }

  /**
   * @return the beforeDataLimits
   */
  public Function getBeforeDataLimits() {
    return beforeDataLimits;
  }

  /**
   * @param beforeDataLimits the beforeDataLimits to set
   */
  public void setBeforeDataLimits(Function beforeDataLimits) {
    this.beforeDataLimits = beforeDataLimits;
  }

  /**
   * @return the afterDataLimits
   */
  public Function getAfterDataLimits() {
    return afterDataLimits;
  }

  /**
   * @param afterDataLimits the afterDataLimits to set
   */
  public void setAfterDataLimits(Function afterDataLimits) {
    this.afterDataLimits = afterDataLimits;
  }

  /**
   * @return the beforeBuildTicks
   */
  public Function getBeforeBuildTicks() {
    return beforeBuildTicks;
  }

  /**
   * @param beforeBuildTicks the beforeBuildTicks to set
   */
  public void setBeforeBuildTicks(Function beforeBuildTicks) {
    this.beforeBuildTicks = beforeBuildTicks;
  }

  /**
   * @return the afterBuildTicks
   */
  public Function getAfterBuildTicks() {
    return afterBuildTicks;
  }

  /**
   * @param afterBuildTicks the afterBuildTicks to set
   */
  public void setAfterBuildTicks(Function afterBuildTicks) {
    this.afterBuildTicks = afterBuildTicks;
  }

  /**
   * @return the beforeTickToLabelConversion
   */
  public Function getBeforeTickToLabelConversion() {
    return beforeTickToLabelConversion;
  }

  /**
   * @param beforeTickToLabelConversion the beforeTickToLabelConversion to set
   */
  public void setBeforeTickToLabelConversion(Function beforeTickToLabelConversion) {
    this.beforeTickToLabelConversion = beforeTickToLabelConversion;
  }

  /**
   * @return the afterTickToLabelConversion
   */
  public Function getAfterTickToLabelConversion() {
    return afterTickToLabelConversion;
  }

  /**
   * @param afterTickToLabelConversion the afterTickToLabelConversion to set
   */
  public void setAfterTickToLabelConversion(Function afterTickToLabelConversion) {
    this.afterTickToLabelConversion = afterTickToLabelConversion;
  }

  /**
   * @return the beforeCalculateTickRotation
   */
  public Function getBeforeCalculateTickRotation() {
    return beforeCalculateTickRotation;
  }

  /**
   * @param beforeCalculateTickRotation the beforeCalculateTickRotation to set
   */
  public void setBeforeCalculateTickRotation(Function beforeCalculateTickRotation) {
    this.beforeCalculateTickRotation = beforeCalculateTickRotation;
  }

  /**
   * @return the afterCalculateTickRotation
   */
  public Function getAfterCalculateTickRotation() {
    return afterCalculateTickRotation;
  }

  /**
   * @param afterCalculateTickRotation the afterCalculateTickRotation to set
   */
  public void setAfterCalculateTickRotation(Function afterCalculateTickRotation) {
    this.afterCalculateTickRotation = afterCalculateTickRotation;
  }

  /**
   * @return the beforeFit
   */
  public Function getBeforeFit() {
    return beforeFit;
  }

  /**
   * @param beforeFit the beforeFit to set
   */
  public void setBeforeFit(Function beforeFit) {
    this.beforeFit = beforeFit;
  }

  /**
   * @return the afterFit
   */
  public Function getAfterFit() {
    return afterFit;
  }

  /**
   * @param afterFit the afterFit to set
   */
  public void setAfterFit(Function afterFit) {
    this.afterFit = afterFit;
  }

  /**
   * @return the afterUpdate
   */
  public Function getAfterUpdate() {
    return afterUpdate;
  }

  /**
   * @param afterUpdate the afterUpdate to set
   */
  public void setAfterUpdate(Function afterUpdate) {
    this.afterUpdate = afterUpdate;
  }

  public Boolean getBeginAtZero() {
    return beginAtZero;
  }

  public void setBeginAtZero(Boolean beginAtZero) {
    this.beginAtZero = beginAtZero;
  }

}
