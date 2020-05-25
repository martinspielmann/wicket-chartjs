package de.martinspielmann.wicket.chartjs.options.tooltip;


import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.SimpleColor;
import de.martinspielmann.wicket.chartjs.options.properties.FontStyle;
import de.martinspielmann.wicket.chartjs.options.properties.Function;
import de.martinspielmann.wicket.chartjs.options.properties.TextAlign;
import de.martinspielmann.wicket.chartjs.options.properties.TextDirection;

public class Tooltip implements Serializable {

  private static final long serialVersionUID = 1L;

  // enabled boolean true Are on-canvas tooltips enabled?
  private Boolean enabled;
  // custom function null See custom tooltip section.
  private Function custom;
  // mode string 'nearest' Sets which elements appear in the tooltip. more....
  private Mode mode;
  // intersect boolean true If true, the tooltip mode applies only when the mouse position
  // intersects with an element. If false, the mode will be applied at all times.
  private Boolean intersect;
  // position string 'average' The mode for positioning the tooltip. more...
  private TooltipPosition position;
  // callbacks object See the callbacks section.
  private TooltipCallbacks callbacks;
  // itemSort function Sort tooltip items. more...
  private Function itemSort;
  // filter function Filter tooltip items. more...
  private Function filter;
  // backgroundColor Color 'rgba(0, 0, 0, 0.8)' Background color of the tooltip.
  private SimpleColor backgroundColor;
  // titleFontFamily string "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" Title font.
  private String titleFontFamily;
  // titleFontSize number 12 Title font size.
  private Number titleFontSize;
  // titleFontStyle string 'bold' Title font style.
  private FontStyle titleFontStyle;
// titleFontColor Color '#fff' Title font color.
  private SimpleColor titleFontColor;
  // titleAlign string 'left' Horizontal alignment of the title text lines. more...
  private TextAlign titleAlign;
  // titleSpacing number 2 Spacing to add to top and bottom of each title line.
  private Number titleSpacing;
  // titleMarginBottom number 6 Margin to add on bottom of title section.
  private Number titleMarginBottom;
  // bodyFontFamily string "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" Body line font.
  private String bodyFontFamily;
// bodyFontSize number 12 Body font size.
  private Number bodyFontSize;
  // bodyFontStyle string 'normal' Body font style.
  private FontStyle bodyFontStyle;
// bodyFontColor Color '#fff' Body font color.
  private SimpleColor bodyFontColor;
// bodyAlign string 'left' Horizontal alignment of the body text lines. more...
  private TextAlign bodyAlign;
  // bodySpacing number 2 Spacing to add to top and bottom of each tooltip item.
  private Number bodySpacing;
// footerFontFamily string "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif" Footer font.
  private String footerFontFamily;
 // footerFontSize number 12 Footer font size.
  private Number footerFontSize;
  // footerFontStyle string 'bold' Footer font style.
  private FontStyle footerFontStyle;
 // footerFontColor Color '#fff' Footer font color.
  private SimpleColor footerFontColor;
 // footerAlign string 'left' Horizontal alignment of the footer text lines. more...
  private TextAlign footerAlign;
  // footerSpacing number 2 Spacing to add to top and bottom of each footer line.
  private Number footerSpacing;
 // footerMarginTop number 6 Margin to add before drawing the footer.
  private Number footerMarginTop;
  // xPadding number 6 Padding to add on left and right of tooltip.
  private Number xPadding;
  // yPadding number 6 Padding to add on top and bottom of tooltip.
  private Number yPadding;
  // caretPadding number 2 Extra distance to move the end of the tooltip arrow away from the tooltip
  // point.
  private Number caretPadding;  
  // caretSize number 5 Size, in px, of the tooltip arrow.
  private Number caretSize;
 // cornerRadius number 6 Radius of tooltip corner curves.
  private Number cornerRadius;
 // multiKeyBackground Color '#fff' Color to draw behind the colored boxes when multiple items are
  // in the tooltip.
  private SimpleColor multiKeyBackground;
  // displayColors boolean true If true, color boxes are shown in the tooltip.
  private Boolean displayColors;
  // boxWidth number bodyFontSize Width of the color box if displayColors is true.
  private Number boxWidth;
  // boxHeight number bodyFontSize Height of the color box if displayColors is true.
  private Number boxHeight;
  // borderColor Color 'rgba(0, 0, 0, 0)' Color of the border.
  private SimpleColor borderColor;
  // borderWidth number 0 Size of the border.
  private Number borderWidth;  
  // rtl boolean true for rendering the legends from right to left.
  private Boolean rtl;
  // textDirection string canvas' default This will force the text direction 'rtl' or 'ltr on the
  private TextDirection textDirection;
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public Function getCustom() {
    return custom;
  }
  public void setCustom(Function custom) {
    this.custom = custom;
  }
  public Mode getMode() {
    return mode;
  }
  public void setMode(Mode mode) {
    this.mode = mode;
  }
  public Boolean getIntersect() {
    return intersect;
  }
  public void setIntersect(Boolean intersect) {
    this.intersect = intersect;
  }
  public TooltipPosition getPosition() {
    return position;
  }
  public void setPosition(TooltipPosition position) {
    this.position = position;
  }
  public TooltipCallbacks getCallbacks() {
    return callbacks;
  }
  public void setCallbacks(TooltipCallbacks callbacks) {
    this.callbacks = callbacks;
  }
  public Function getItemSort() {
    return itemSort;
  }
  public void setItemSort(Function itemSort) {
    this.itemSort = itemSort;
  }
  public Function getFilter() {
    return filter;
  }
  public void setFilter(Function filter) {
    this.filter = filter;
  }
  public SimpleColor getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(SimpleColor backgroundColor) {
    this.backgroundColor = backgroundColor;
  }
  public String getTitleFontFamily() {
    return titleFontFamily;
  }
  public void setTitleFontFamily(String titleFontFamily) {
    this.titleFontFamily = titleFontFamily;
  }
  public Number getTitleFontSize() {
    return titleFontSize;
  }
  public void setTitleFontSize(Number titleFontSize) {
    this.titleFontSize = titleFontSize;
  }
  public FontStyle getTitleFontStyle() {
    return titleFontStyle;
  }
  public void setTitleFontStyle(FontStyle titleFontStyle) {
    this.titleFontStyle = titleFontStyle;
  }
  public SimpleColor getTitleFontColor() {
    return titleFontColor;
  }
  public void setTitleFontColor(SimpleColor titleFontColor) {
    this.titleFontColor = titleFontColor;
  }
  public TextAlign getTitleAlign() {
    return titleAlign;
  }
  public void setTitleAlign(TextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }
  public Number getTitleSpacing() {
    return titleSpacing;
  }
  public void setTitleSpacing(Number titleSpacing) {
    this.titleSpacing = titleSpacing;
  }
  public Number getTitleMarginBottom() {
    return titleMarginBottom;
  }
  public void setTitleMarginBottom(Number titleMarginBottom) {
    this.titleMarginBottom = titleMarginBottom;
  }
  public String getBodyFontFamily() {
    return bodyFontFamily;
  }
  public void setBodyFontFamily(String bodyFontFamily) {
    this.bodyFontFamily = bodyFontFamily;
  }
  public Number getBodyFontSize() {
    return bodyFontSize;
  }
  public void setBodyFontSize(Number bodyFontSize) {
    this.bodyFontSize = bodyFontSize;
  }
  public FontStyle getBodyFontStyle() {
    return bodyFontStyle;
  }
  public void setBodyFontStyle(FontStyle bodyFontStyle) {
    this.bodyFontStyle = bodyFontStyle;
  }
  public SimpleColor getBodyFontColor() {
    return bodyFontColor;
  }
  public void setBodyFontColor(SimpleColor bodyFontColor) {
    this.bodyFontColor = bodyFontColor;
  }
  public TextAlign getBodyAlign() {
    return bodyAlign;
  }
  public void setBodyAlign(TextAlign bodyAlign) {
    this.bodyAlign = bodyAlign;
  }
  public Number getBodySpacing() {
    return bodySpacing;
  }
  public void setBodySpacing(Number bodySpacing) {
    this.bodySpacing = bodySpacing;
  }
  public String getFooterFontFamily() {
    return footerFontFamily;
  }
  public void setFooterFontFamily(String footerFontFamily) {
    this.footerFontFamily = footerFontFamily;
  }
  public Number getFooterFontSize() {
    return footerFontSize;
  }
  public void setFooterFontSize(Number footerFontSize) {
    this.footerFontSize = footerFontSize;
  }
  public FontStyle getFooterFontStyle() {
    return footerFontStyle;
  }
  public void setFooterFontStyle(FontStyle footerFontStyle) {
    this.footerFontStyle = footerFontStyle;
  }
  public SimpleColor getFooterFontColor() {
    return footerFontColor;
  }
  public void setFooterFontColor(SimpleColor footerFontColor) {
    this.footerFontColor = footerFontColor;
  }
  public TextAlign getFooterAlign() {
    return footerAlign;
  }
  public void setFooterAlign(TextAlign footerAlign) {
    this.footerAlign = footerAlign;
  }
  public Number getFooterSpacing() {
    return footerSpacing;
  }
  public void setFooterSpacing(Number footerSpacing) {
    this.footerSpacing = footerSpacing;
  }
  public Number getFooterMarginTop() {
    return footerMarginTop;
  }
  public void setFooterMarginTop(Number footerMarginTop) {
    this.footerMarginTop = footerMarginTop;
  }
  public Number getxPadding() {
    return xPadding;
  }
  public void setxPadding(Number xPadding) {
    this.xPadding = xPadding;
  }
  public Number getyPadding() {
    return yPadding;
  }
  public void setyPadding(Number yPadding) {
    this.yPadding = yPadding;
  }
  public Number getCaretPadding() {
    return caretPadding;
  }
  public void setCaretPadding(Number caretPadding) {
    this.caretPadding = caretPadding;
  }
  public Number getCaretSize() {
    return caretSize;
  }
  public void setCaretSize(Number caretSize) {
    this.caretSize = caretSize;
  }
  public Number getCornerRadius() {
    return cornerRadius;
  }
  public void setCornerRadius(Number cornerRadius) {
    this.cornerRadius = cornerRadius;
  }
  public SimpleColor getMultiKeyBackground() {
    return multiKeyBackground;
  }
  public void setMultiKeyBackground(SimpleColor multiKeyBackground) {
    this.multiKeyBackground = multiKeyBackground;
  }
  public Boolean getDisplayColors() {
    return displayColors;
  }
  public void setDisplayColors(Boolean displayColors) {
    this.displayColors = displayColors;
  }
  public Number getBoxWidth() {
    return boxWidth;
  }
  public void setBoxWidth(Number boxWidth) {
    this.boxWidth = boxWidth;
  }
  public Number getBoxHeight() {
    return boxHeight;
  }
  public void setBoxHeight(Number boxHeight) {
    this.boxHeight = boxHeight;
  }
  public SimpleColor getBorderColor() {
    return borderColor;
  }
  public void setBorderColor(SimpleColor borderColor) {
    this.borderColor = borderColor;
  }
  public Number getBorderWidth() {
    return borderWidth;
  }
  public void setBorderWidth(Number borderWidth) {
    this.borderWidth = borderWidth;
  }
  public Boolean getRtl() {
    return rtl;
  }
  public void setRtl(Boolean rtl) {
    this.rtl = rtl;
  }
  public TextDirection getTextDirection() {
    return textDirection;
  }
  public void setTextDirection(TextDirection textDirection) {
    this.textDirection = textDirection;
  }

}
