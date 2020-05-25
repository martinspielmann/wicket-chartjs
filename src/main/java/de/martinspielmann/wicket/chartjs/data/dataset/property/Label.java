package de.martinspielmann.wicket.chartjs.data.dataset.property;


import java.util.List;
import java.util.stream.Collectors;
import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public class Label implements JsonStringAware {

  private static final long serialVersionUID = 1L;

  private final String text;

  public Label(String text) {
    this.text = text;
  }

  public static List<Label> of(String... labels) {
    return List.of(labels).stream().map(Label::new).collect(Collectors.toList());
  }

  public static List<Label> of(List<String> labels) {
    return labels.stream().map(Label::new).collect(Collectors.toList());
  }

  public String getText() {
    return text;
  }

  @Override
  public String getJson() {
    return getText();
  }

}
