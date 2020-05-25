package de.martinspielmann.wicket.chartjs.core.internal.json.serializer;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;

public class JsonAwareSerializer extends StdSerializer<JsonAware> {

  private static final long serialVersionUID = 1L;

  public JsonAwareSerializer() {
    super(JsonAware.class);
  }

  @Override
  public void serialize(JsonAware value, JsonGenerator gen, SerializerProvider provider)
      throws IOException {
    gen.writeObject(value.getJson());
  }

}
