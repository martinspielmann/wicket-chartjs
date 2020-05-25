package de.martinspielmann.wicket.chartjs.core.internal.json.serializer;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.ScriptAware;


public class ScriptableOptionSerializer extends StdSerializer<ScriptAware> {

  private static final long serialVersionUID = 1L;

  public ScriptableOptionSerializer() {
    super(ScriptAware.class);
  }

  @Override
  public boolean isEmpty(SerializerProvider provider, ScriptAware value) {
    return value.getScript() == null || value.getScript().isEmpty();
  }

  @Override
  public void serialize(ScriptAware value, JsonGenerator gen, SerializerProvider provider)
      throws IOException {
    gen.writeRawValue(value.getScript());
  }
}
