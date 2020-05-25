package de.martinspielmann.wicket.chartjs.data.dataset.property.data;

import java.util.ArrayList;
import java.util.List;
import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public class StringDataValue implements DataValue, JsonStringAware {
  private static final long serialVersionUID = 1L;
  private String value;

  public StringDataValue() {}

  public StringDataValue(String value) {
    this.value = value;
  }

  public static List<StringDataValue> of(List<String> stringList) {
    List<StringDataValue> resultList = new ArrayList<StringDataValue>();
    for (String string : stringList) {
      resultList.add(new StringDataValue(string));
    }
    return resultList;
  }

  public static List<StringDataValue> of(String... strings) {
    List<StringDataValue> resultList = new ArrayList<StringDataValue>();
    for (String string : strings) {
      resultList.add(new StringDataValue(string));
    }
    return resultList;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String getJson() {
    return getValue();
  }

}
