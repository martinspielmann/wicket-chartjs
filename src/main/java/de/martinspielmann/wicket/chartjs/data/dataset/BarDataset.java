package de.martinspielmann.wicket.chartjs.data.dataset;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.martinspielmann.wicket.chartjs.core.internal.IndexableOption;
import de.martinspielmann.wicket.chartjs.data.BarChartData;
import de.martinspielmann.wicket.chartjs.data.dataset.property.BarThickness;
import de.martinspielmann.wicket.chartjs.data.dataset.property.Clip;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.BorderSkipped;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.BorderWidth;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.Color;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.INumber;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.SimpleNumber;

/**
 * The Class BarDataset provides all information needed for {@link BarChartData} .
 * 
 * @author Martin Spielmann
 */
public class BarDataset extends AbstractDataset {

  private static final long serialVersionUID = 1L;

  // backgroundColor Color Yes Yes 'rgba(0, 0, 0, 0.1)'
  private IndexableOption<Color> backgroundColor;

  // borderColor Color Yes Yes 'rgba(0, 0, 0, 0.1)'
  private IndexableOption<Color> borderColor;

  // borderSkipped string Yes Yes 'bottom'
  private IndexableOption<BorderSkipped> borderSkipped;

  // borderWidth number|object Yes Yes 0
  private IndexableOption<BorderWidth> borderWidth;

  // clip number|object - - undefined
  private Clip clip;

  // hoverBackgroundColor Color - Yes undefined
  private IndexableOption<Color> hoverBackgroundColor;

  // hoverBorderColor Color - Yes undefined
  private IndexableOption<Color> hoverBorderColor;

  // hoverBorderWidth number - Yes 1
  private IndexableOption<INumber> hoverBorderWidth;

  // order number - - 0
  private SimpleNumber order;

  @JsonProperty("yAxisID")
  private String yAxisID;

  @JsonProperty("xAxisID")
  private String xAxisID;

  private SimpleNumber barPercentage;

  private SimpleNumber categoryPercentage;

  private BarThickness barThickness;

  private SimpleNumber maxBarThickness;

  private SimpleNumber minBarLength;

  public IndexableOption<Color> getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(IndexableOption<Color> backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public IndexableOption<Color> getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(IndexableOption<Color> borderColor) {
    this.borderColor = borderColor;
  }

  public IndexableOption<BorderSkipped> getBorderSkipped() {
    return borderSkipped;
  }

  public void setBorderSkipped(IndexableOption<BorderSkipped> borderSkipped) {
    this.borderSkipped = borderSkipped;
  }

  public IndexableOption<BorderWidth> getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(IndexableOption<BorderWidth> borderWidth) {
    this.borderWidth = borderWidth;
  }

  public Clip getClip() {
    return clip;
  }

  public void setClip(Clip clip) {
    this.clip = clip;
  }

  public IndexableOption<Color> getHoverBackgroundColor() {
    return hoverBackgroundColor;
  }

  public void setHoverBackgroundColor(IndexableOption<Color> hoverBackgroundColor) {
    this.hoverBackgroundColor = hoverBackgroundColor;
  }

  public IndexableOption<Color> getHoverBorderColor() {
    return hoverBorderColor;
  }

  public void setHoverBorderColor(IndexableOption<Color> hoverBorderColor) {
    this.hoverBorderColor = hoverBorderColor;
  }

  public IndexableOption<INumber> getHoverBorderWidth() {
    return hoverBorderWidth;
  }

  public void setHoverBorderWidth(IndexableOption<INumber> hoverBorderWidth) {
    this.hoverBorderWidth = hoverBorderWidth;
  }

  public SimpleNumber getOrder() {
    return order;
  }

  public void setOrder(SimpleNumber order) {
    this.order = order;
  }

  public String getyAxisID() {
    return yAxisID;
  }

  public void setyAxisID(String yAxisID) {
    this.yAxisID = yAxisID;
  }

  public String getxAxisID() {
    return xAxisID;
  }

  public void setxAxisID(String xAxisID) {
    this.xAxisID = xAxisID;
  }

  public SimpleNumber getBarPercentage() {
    return barPercentage;
  }

  public void setBarPercentage(SimpleNumber barPercentage) {
    this.barPercentage = barPercentage;
  }

  public SimpleNumber getCategoryPercentage() {
    return categoryPercentage;
  }

  public void setCategoryPercentage(SimpleNumber categoryPercentage) {
    this.categoryPercentage = categoryPercentage;
  }

  public BarThickness getBarThickness() {
    return barThickness;
  }

  public void setBarThickness(BarThickness barThickness) {
    this.barThickness = barThickness;
  }

  public SimpleNumber getMaxBarThickness() {
    return maxBarThickness;
  }

  public void setMaxBarThickness(SimpleNumber maxBarThickness) {
    this.maxBarThickness = maxBarThickness;
  }

  public SimpleNumber getMinBarLength() {
    return minBarLength;
  }

  public void setMinBarLength(SimpleNumber minBarLength) {
    this.minBarLength = minBarLength;
  }


}
