package de.martinspielmann.wicket.chartjs.data.dataset.property.data;


public class PointDataValue implements DataValue {

  private static final long serialVersionUID = 1L;
  private final DataValue x;
  private final DataValue y;

  public PointDataValue(DataValue x, DataValue y) {
    super();
    this.x = x;
    this.y = y;
  }

  public PointDataValue(Number x, Number y) {
    this.x = new NumberDataValue(x);
    this.y = new NumberDataValue(y);
  }

  public DataValue getX() {
    return x;
  }

  public DataValue getY() {
    return y;
  }

}
