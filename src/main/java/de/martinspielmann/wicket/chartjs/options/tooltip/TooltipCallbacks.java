package de.martinspielmann.wicket.chartjs.options.tooltip;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.options.properties.Function;


public class TooltipCallbacks implements Serializable {
  private static final long serialVersionUID = 1L;
  private Function beforeTitle;
  private Function title;
  private Function afterTitle;
  private Function beforeBody;
  private Function beforeLabel;
  private Function label;
  private Function labelColor;
  private Function labelTextColor;
  private Function afterLabel;
  private Function afterBody;
  private Function beforeFooter;
  private Function footer;
  private Function afterFooter;

  public Function getBeforeTitle() {
    return beforeTitle;
  }

  public void setBeforeTitle(Function beforeTitle) {
    this.beforeTitle = beforeTitle;
  }

  public Function getTitle() {
    return title;
  }

  public void setTitle(Function title) {
    this.title = title;
  }

  public Function getAfterTitle() {
    return afterTitle;
  }

  public void setAfterTitle(Function afterTitle) {
    this.afterTitle = afterTitle;
  }

  public Function getBeforeBody() {
    return beforeBody;
  }

  public void setBeforeBody(Function beforeBody) {
    this.beforeBody = beforeBody;
  }

  public Function getBeforeLabel() {
    return beforeLabel;
  }

  public void setBeforeLabel(Function beforeLabel) {
    this.beforeLabel = beforeLabel;
  }

  public Function getLabel() {
    return label;
  }

  public void setLabel(Function label) {
    this.label = label;
  }

  public Function getLabelColor() {
    return labelColor;
  }

  public void setLabelColor(Function labelColor) {
    this.labelColor = labelColor;
  }

  public Function getLabelTextColor() {
    return labelTextColor;
  }

  public void setLabelTextColor(Function labelTextColor) {
    this.labelTextColor = labelTextColor;
  }

  public Function getAfterLabel() {
    return afterLabel;
  }

  public void setAfterLabel(Function afterLabel) {
    this.afterLabel = afterLabel;
  }

  public Function getAfterBody() {
    return afterBody;
  }

  public void setAfterBody(Function afterBody) {
    this.afterBody = afterBody;
  }

  public Function getBeforeFooter() {
    return beforeFooter;
  }

  public void setBeforeFooter(Function beforeFooter) {
    this.beforeFooter = beforeFooter;
  }

  public Function getFooter() {
    return footer;
  }

  public void setFooter(Function footer) {
    this.footer = footer;
  }

  public Function getAfterFooter() {
    return afterFooter;
  }

  public void setAfterFooter(Function afterFooter) {
    this.afterFooter = afterFooter;
  }


}
