package de.martinspielmann.wicket.chartjs.options.legend;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;
import de.martinspielmann.wicket.chartjs.options.properties.FontStyle;
import de.martinspielmann.wicket.chartjs.options.properties.Function;

public class LegendLabel implements Serializable {

  private static final long serialVersionUID = 1L;

  private Number boxWidth;
  private Number fontSize;
  private FontStyle fontStyle;
  private SimpleColor fontColor;
  private String fontFamily;
  private Number padding;
  private Function generateLabels;
  private Function filter;
  private Boolean usePointStyle;

  public Number getBoxWidth() {
    return boxWidth;
  }

  public void setBoxWidth(Number boxWidth) {
    this.boxWidth = boxWidth;
  }

  public Number getFontSize() {
    return fontSize;
  }

  public void setFontSize(Number fontSize) {
    this.fontSize = fontSize;
  }

  public FontStyle getFontStyle() {
    return fontStyle;
  }

  public void setFontStyle(FontStyle fontStyle) {
    this.fontStyle = fontStyle;
  }

  public SimpleColor getFontColor() {
    return fontColor;
  }

  public void setFontColor(SimpleColor fontColor) {
    this.fontColor = fontColor;
  }

  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  public Number getPadding() {
    return padding;
  }

  public void setPadding(Number padding) {
    this.padding = padding;
  }

  public Function getGenerateLabels() {
    return generateLabels;
  }

  public void setGenerateLabels(Function generateLabels) {
    this.generateLabels = generateLabels;
  }

  public Function getFilter() {
    return filter;
  }

  public void setFilter(Function filter) {
    this.filter = filter;
  }

  public Boolean getUsePointStyle() {
    return usePointStyle;
  }

  public void setUsePointStyle(Boolean usePointStyle) {
    this.usePointStyle = usePointStyle;
  }

}
