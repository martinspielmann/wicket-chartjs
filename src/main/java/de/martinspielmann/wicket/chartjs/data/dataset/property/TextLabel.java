package de.martinspielmann.wicket.chartjs.data.dataset.property;


import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public class TextLabel implements JsonStringAware {

  private static final long serialVersionUID = 1L;

  private final String text;

  public TextLabel(String text) {
    this.text = text;
  }

  public static List<TextLabel> of(String... labels) {
    return List.of(labels).stream().map(TextLabel::new).collect(Collectors.toList());
  }

  public static List<TextLabel> of(List<String> labels) {
    return labels.stream().map(TextLabel::new).collect(Collectors.toList());
  }

  public String getText() {
    return text;
  }

  @Override
  public String getJson() {
    return getText();
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof TextLabel)) {
      return false;
    }
    TextLabel other = (TextLabel) obj;
    return Objects.equals(text, other.text);
  }

}
