package de.martinspielmann.wicket.chartjs.core.internal.json;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 
 * @author m
 *
 */
public interface IndexableAware<T> extends Serializable {

  public List<T> getIndexableValues();

}
