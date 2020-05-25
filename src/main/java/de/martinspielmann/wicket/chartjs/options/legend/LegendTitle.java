package de.martinspielmann.wicket.chartjs.options.legend;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;
import de.martinspielmann.wicket.chartjs.options.properties.FontStyle;
import de.martinspielmann.wicket.chartjs.options.properties.Padding;

public class LegendTitle implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean display;
  private Number fontSize;
  private FontStyle fontStyle;
  private SimpleColor fontColor;
  private String fontFamily;
  private Number lineHeight;
  private Padding padding;
  private String text;

  public Boolean getDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
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

  public Number getLineHeight() {
    return lineHeight;
  }

  public void setLineHeight(Number lineHeight) {
    this.lineHeight = lineHeight;
  }

  public Padding getPadding() {
    return padding;
  }

  public void setPadding(Padding padding) {
    this.padding = padding;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
