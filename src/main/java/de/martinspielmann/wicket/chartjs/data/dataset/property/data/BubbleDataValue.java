package de.martinspielmann.wicket.chartjs.data.dataset.property.data;

public class BubbleDataValue extends PointDataValue {

  private static final long serialVersionUID = 1L;

  private final DataValue r;

  public BubbleDataValue(DataValue x, DataValue y, DataValue r) {
    super(x, y);
    this.r = r;
  }

  public BubbleDataValue(Number x, Number y, Number r) {
    super(x, y);
    this.r = new NumberDataValue(r);
  }

  public DataValue getR() {
    return r;
  }

}
