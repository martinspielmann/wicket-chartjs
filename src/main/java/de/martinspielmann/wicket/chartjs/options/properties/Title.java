package de.martinspielmann.wicket.chartjs.options.properties;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.core.internal.IndexableOption;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;

public class Title implements Serializable {

  private static final long serialVersionUID = 1L;

  private Align align;
  private Boolean display;
  private Position position;
  private Number fontSize;
  private String fontFamily;
  private SimpleColor fontColor;
  private FontStyle fontStyle;
  private Padding padding;
  private LineHeight lineHeight;
  private IndexableOption<String> text;

  public Align getAlign() {
    return align;
  }

  public void setAlign(Align align) {
    this.align = align;
  }

  public Boolean getDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public Number getFontSize() {
    return fontSize;
  }

  public void setFontSize(Number fontSize) {
    this.fontSize = fontSize;
  }

  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  public SimpleColor getFontColor() {
    return fontColor;
  }

  public void setFontColor(SimpleColor fontColor) {
    this.fontColor = fontColor;
  }

  public FontStyle getFontStyle() {
    return fontStyle;
  }

  public void setFontStyle(FontStyle fontStyle) {
    this.fontStyle = fontStyle;
  }

  public Padding getPadding() {
    return padding;
  }

  public void setPadding(Padding padding) {
    this.padding = padding;
  }

  public LineHeight getLineHeight() {
    return lineHeight;
  }

  public void setLineHeight(LineHeight lineHeight) {
    this.lineHeight = lineHeight;
  }

  public IndexableOption<String> getText() {
    return text;
  }

  public void setText(IndexableOption<String> text) {
    this.text = text;
  }



}
