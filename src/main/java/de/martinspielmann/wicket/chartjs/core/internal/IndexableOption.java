package de.martinspielmann.wicket.chartjs.core.internal;

import java.util.ArrayList;
import java.util.List;
import de.martinspielmann.wicket.chartjs.core.internal.json.IndexableAware;

public class IndexableOption<T> implements IndexableAware<T> {

  private static final long serialVersionUID = 1L;

  private final List<T> indexableValues = new ArrayList<>();

  public IndexableOption() {

  }

  public IndexableOption(T option) {
    getIndexableValues().add(option);
  }

  public IndexableOption(List<T> options) {
    getIndexableValues().addAll(options);
  }

  @Override
  public List<T> getIndexableValues() {
    return indexableValues;
  }

}
