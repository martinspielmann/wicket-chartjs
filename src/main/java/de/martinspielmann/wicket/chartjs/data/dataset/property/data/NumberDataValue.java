package de.martinspielmann.wicket.chartjs.data.dataset.property.data;

import java.util.ArrayList;
import java.util.List;
import de.martinspielmann.wicket.chartjs.core.internal.JsonNumberAware;

public class NumberDataValue implements DataValue, JsonNumberAware {
  private static final long serialVersionUID = 1L;

  private Number value;

  public NumberDataValue() {

  }

  public NumberDataValue(Number number) {
    this.value = number;
  }

  public static List<NumberDataValue> of(List<Number> numbers) {
    List<NumberDataValue> resultList = new ArrayList<>();
    for (Number i : numbers) {
      resultList.add(new NumberDataValue(i));
    }
    return resultList;
  }

  public static List<NumberDataValue> of(Number... numbers) {
    List<NumberDataValue> resultList = new ArrayList<>();
    for (Number i : numbers) {
      resultList.add(new NumberDataValue(i));
    }
    return resultList;
  }

  public Number getValue() {
    return value;
  }

  public void setValue(Number value) {
    this.value = value;
  }

  @Override
  public Number getJson() {
    return getValue();
  }


}
