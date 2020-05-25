package de.martinspielmann.wicket.chartjs.core.internal.json.serializer;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.json.IndexableAware;


@SuppressWarnings("rawtypes")
public class IndexableOptionSerializer extends StdSerializer<IndexableAware> {

  private static final long serialVersionUID = 1L;

  public IndexableOptionSerializer() {
    super(IndexableAware.class);
  }

  @Override
  public boolean isEmpty(SerializerProvider provider, IndexableAware value) {
    boolean empty = value.getIndexableValues() == null || value.getIndexableValues().isEmpty();
    return empty;
  }

  @Override
  public void serialize(IndexableAware value, JsonGenerator gen, SerializerProvider provider)
      throws IOException {
    List<?> values = value.getIndexableValues();
    if (values == null || values.isEmpty()) {
      gen.writeRawValue("");
    } else if (values.size() == 1) {
      gen.writeObject(values.get(0));
    } else {
      gen.writeObject(values);
    }
  }

}
