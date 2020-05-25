package de.martinspielmann.wicket.chartjs.options.properties;

public class SideSpecificPadding implements Padding {

  private static final long serialVersionUID = 1L;

  private Number top;
  private Number right;
  private Number bottom;
  private Number left;

  public Number getTop() {
    return top;
  }

  public void setTop(Number top) {
    this.top = top;
  }

  public Number getRight() {
    return right;
  }

  public void setRight(Number right) {
    this.right = right;
  }

  public Number getBottom() {
    return bottom;
  }

  public void setBottom(Number bottom) {
    this.bottom = bottom;
  }

  public Number getLeft() {
    return left;
  }

  public void setLeft(Number left) {
    this.left = left;
  }
}
