package de.martinspielmann.wicket.chartjs.core.internal.json.serializer;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;

public class JsonStringAwareSerializer extends StdSerializer<JsonStringAware> {

  private static final long serialVersionUID = 1L;

  public JsonStringAwareSerializer() {
    super(JsonStringAware.class);
  }

  @Override
  public boolean isEmpty(SerializerProvider prov, JsonStringAware value) {
    return value.getJson() == null || value.getJson().isEmpty();
  }

  @Override
  public void serialize(JsonStringAware value, JsonGenerator gen, SerializerProvider provider)
      throws IOException {
    gen.writeString(value.getJson());
  }

}
