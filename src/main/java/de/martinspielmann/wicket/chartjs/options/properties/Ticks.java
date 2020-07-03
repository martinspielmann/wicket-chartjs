package de.martinspielmann.wicket.chartjs.options.properties;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.Color;


public class Ticks implements Serializable {
  private static final long serialVersionUID = 1L;

  private Boolean autoSkip;
  private Number min;
  private Number max;
  private Boolean beginAtZero;
  private Number stepSize;
  private Number suggestedMax;
  private Number suggestedMin;
  private Color backdropColor;
  private Number backdropPaddingX;
  private Number backdropPaddingY;
  private Boolean showLabelBackdrop;
  private Function callback;
  private Boolean display;
  private Color fontColor;
  private String fontFamily;
  private Number fontSize;
  private String fontStyle;
  private Boolean reverse;


  /**
   * @return the autoSkip
   */
  public Boolean getAutoSkip() {
    return autoSkip;
  }

  /**
   * @param autoSkip the autoSkip to set
   */
  public void setAutoSkip(Boolean autoSkip) {
    this.autoSkip = autoSkip;
  }

  /**
   * @return the min
   */
  public Number getMin() {
    return min;
  }

  /**
   * @param min the min to set
   */
  public void setMin(Number min) {
    this.min = min;
  }

  /**
   * @return the max
   */
  public Number getMax() {
    return max;
  }

  /**
   * @param max the max to set
   */
  public void setMax(Number max) {
    this.max = max;
  }

  /**
   * @return the beginAtZero
   */
  public Boolean getBeginAtZero() {
    return beginAtZero;
  }

  /**
   * @param beginAtZero the beginAtZero to set
   */
  public void setBeginAtZero(Boolean beginAtZero) {
    this.beginAtZero = beginAtZero;
  }

  /**
   * @return the stepSize
   */
  public Number getStepSize() {
    return stepSize;
  }

  /**
   * @param stepSize the stepSize to set
   */
  public void setStepSize(Number stepSize) {
    this.stepSize = stepSize;
  }

  /**
   * @return the suggestedMax
   */
  public Number getSuggestedMax() {
    return suggestedMax;
  }

  /**
   * @param suggestedMax the suggestedMax to set
   */
  public void setSuggestedMax(Number suggestedMax) {
    this.suggestedMax = suggestedMax;
  }

  /**
   * @return the suggestedMin
   */
  public Number getSuggestedMin() {
    return suggestedMin;
  }

  /**
   * @param suggestedMin the suggestedMin to set
   */
  public void setSuggestedMin(Number suggestedMin) {
    this.suggestedMin = suggestedMin;
  }

  /**
   * @return the backdropColor
   */
  public Color getBackdropColor() {
    return backdropColor;
  }

  /**
   * @param backdropColor the backdropColor to set
   */
  public void setBackdropColor(Color backdropColor) {
    this.backdropColor = backdropColor;
  }

  /**
   * @return the backdropPaddingX
   */
  public Number getBackdropPaddingX() {
    return backdropPaddingX;
  }

  /**
   * @param backdropPaddingX the backdropPaddingX to set
   */
  public void setBackdropPaddingX(Number backdropPaddingX) {
    this.backdropPaddingX = backdropPaddingX;
  }

  /**
   * @return the backdropPaddingY
   */
  public Number getBackdropPaddingY() {
    return backdropPaddingY;
  }

  /**
   * @param backdropPaddingY the backdropPaddingY to set
   */
  public void setBackdropPaddingY(Number backdropPaddingY) {
    this.backdropPaddingY = backdropPaddingY;
  }

  /**
   * @return the showLabelBackdrop
   */
  public Boolean getShowLabelBackdrop() {
    return showLabelBackdrop;
  }

  /**
   * @param showLabelBackdrop the showLabelBackdrop to set
   */
  public void setShowLabelBackdrop(Boolean showLabelBackdrop) {
    this.showLabelBackdrop = showLabelBackdrop;
  }

  /**
   * @return the callback
   */
  public Function getCallback() {
    return callback;
  }

  /**
   * @param callback the callback to set
   */
  public void setCallback(Function callback) {
    this.callback = callback;
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
   * @return the fontColor
   */
  public Color getFontColor() {
    return fontColor;
  }

  /**
   * @param fontColor the fontColor to set
   */
  public void setFontColor(Color fontColor) {
    this.fontColor = fontColor;
  }

  /**
   * @return the fontFamily
   */
  public String getFontFamily() {
    return fontFamily;
  }

  /**
   * @param fontFamily the fontFamily to set
   */
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  /**
   * @return the fontSize
   */
  public Number getFontSize() {
    return fontSize;
  }

  /**
   * @param fontSize the fontSize to set
   */
  public void setFontSize(Number fontSize) {
    this.fontSize = fontSize;
  }

  /**
   * @return the fontStyle
   */
  public String getFontStyle() {
    return fontStyle;
  }

  /**
   * @param fontStyle the fontStyle to set
   */
  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
  }

  /**
   * @return the reverse
   */
  public Boolean getReverse() {
    return reverse;
  }

  /**
   * @param reverse the reverse to set
   */
  public void setReverse(Boolean reverse) {
    this.reverse = reverse;
  }

}
