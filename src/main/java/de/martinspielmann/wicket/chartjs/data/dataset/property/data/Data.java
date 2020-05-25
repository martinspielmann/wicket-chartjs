package de.martinspielmann.wicket.chartjs.data.dataset.property.data;

import java.util.List;
import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;

public class Data implements JsonAware {

  private static final long serialVersionUID = 1L;

  private final List<DataValue> listOfValues;
  private final ObjectDataValue singleObjectDataValue;

  public Data(List<DataValue> listOfValues) {
    super();
    this.listOfValues = listOfValues;
    this.singleObjectDataValue = null;
  }

  public Data(ObjectDataValue singleObjectDataValue) {
    super();
    this.listOfValues = null;
    this.singleObjectDataValue = singleObjectDataValue;
  }

  public List<DataValue> getListOfValues() {
    return listOfValues;
  }

  public ObjectDataValue getSingleObjectDataValue() {
    return singleObjectDataValue;
  }

  @Override
  public Object getJson() {
    if (listOfValues != null) {
      return listOfValues;
    } else if (singleObjectDataValue != null) {
      return singleObjectDataValue;
    } else {
      return null;
    }
  }
}
