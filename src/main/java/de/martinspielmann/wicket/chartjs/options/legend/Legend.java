package de.martinspielmann.wicket.chartjs.options.legend;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.options.properties.Align;
import de.martinspielmann.wicket.chartjs.options.properties.Function;
import de.martinspielmann.wicket.chartjs.options.properties.Position;
import de.martinspielmann.wicket.chartjs.options.properties.TextDirection;

public class Legend implements Serializable {

  private static final long serialVersionUID = 1L;

  // display boolean true Is the legend shown?
  private Boolean display;
  // position string 'top' Position of the legend. more...
  private Position position;
  // align string 'center' Alignment of the legend. more...
  private Align align;
  // fullWidth boolean true Marks that this box should take the full width of the canvas (pushing
  // down other boxes). This is unlikely to need to be changed in day-to-day use.
  private Boolean fullWidth;
  // onClick function A callback that is called when a click event is registered on a label item.
  private Function onClick;
  // onHover function A callback that is called when a 'mousemove' event is registered on top of a
  // label item.
  private Function onHover;
  // onLeave function A callback that is called when a 'mousemove' event is registered outside of a
  // previously hovered label item.
  private Function onLeave;
  // reverse boolean false Legend will show datasets in reverse order.
  private Boolean reverse;
  // labels object See the Legend Label Configuration section below.
  private LegendLabel labels;
  // rtl boolean true for rendering the legends from right to left.
  private Boolean rtl;
  // textDirection string canvas' default This will force the text direction 'rtl' or 'ltr' on the
  // canvas for rendering the legend, regardless of the css specified on the canvas
  private TextDirection textDirection;
  // title object See the Legend Title Configuration section below.
  private LegendTitle title;

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

  public Align getAlign() {
    return align;
  }

  public void setAlign(Align align) {
    this.align = align;
  }

  public Boolean getFullWidth() {
    return fullWidth;
  }

  public void setFullWidth(Boolean fullWidth) {
    this.fullWidth = fullWidth;
  }

  public Function getOnClick() {
    return onClick;
  }

  public void setOnClick(Function onClick) {
    this.onClick = onClick;
  }

  public Function getOnHover() {
    return onHover;
  }

  public void setOnHover(Function onHover) {
    this.onHover = onHover;
  }

  public Function getOnLeave() {
    return onLeave;
  }

  public void setOnLeave(Function onLeave) {
    this.onLeave = onLeave;
  }

  public Boolean getReverse() {
    return reverse;
  }

  public void setReverse(Boolean reverse) {
    this.reverse = reverse;
  }

  public LegendLabel getLabels() {
    return labels;
  }

  public void setLabels(LegendLabel labels) {
    this.labels = labels;
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

  public LegendTitle getTitle() {
    return title;
  }

  public void setTitle(LegendTitle title) {
    this.title = title;
  }

}
