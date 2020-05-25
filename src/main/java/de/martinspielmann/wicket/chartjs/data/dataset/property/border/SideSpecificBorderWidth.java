package de.martinspielmann.wicket.chartjs.data.dataset.property.border;

public class SideSpecificBorderWidth implements BorderWidth {

  private static final long serialVersionUID = 1L;
  
  private final Number top;
  private final Number right;
  private final Number bottom;
  private final Number left;

  public SideSpecificBorderWidth(Number top, Number right, Number bottom, Number left) {
    super();
    this.top = top;
    this.right = right;
    this.bottom = bottom;
    this.left = left;
  }

  public Number getTop() {
    return top;
  }

  public Number getRight() {
    return right;
  }

  public Number getBottom() {
    return bottom;
  }

  public Number getLeft() {
    return left;
  }

}
