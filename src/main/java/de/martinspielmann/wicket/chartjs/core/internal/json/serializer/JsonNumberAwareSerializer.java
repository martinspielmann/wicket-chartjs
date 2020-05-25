package de.martinspielmann.wicket.chartjs.core.internal.json.serializer;

import java.io.IOException;
import java.math.BigInteger;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.JsonNumberAware;

public class JsonNumberAwareSerializer extends StdSerializer<JsonNumberAware> {

  private static final long serialVersionUID = 1L;

  public JsonNumberAwareSerializer() {
    super(JsonNumberAware.class);
  }

  @Override
  public boolean isEmpty(SerializerProvider prov, JsonNumberAware value) {
    return value.getJson() == null;
  }

  @Override
  public void serialize(JsonNumberAware value, JsonGenerator gen, SerializerProvider provider)
      throws IOException {
    if (value.getJson() != null) {
      Number v = value.getJson();
      if (v instanceof Integer) {
        gen.writeNumber((Integer) v);
      } else if (v instanceof Long) {
        gen.writeNumber((Long) v);
      } else if (v instanceof Float) {
        gen.writeNumber((Float) v);
      } else if (v instanceof Double) {
        gen.writeNumber((Double) v);
      } else if (v instanceof BigInteger) {
        gen.writeNumber((BigInteger) v);
      } else {
        throw new IOException(v.getClass() + " is not a supported Number type");
      }
    }
  }

}
