package de.martinspielmann.wicket.chartjs.core.internal.json;

import java.util.Locale;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;
import de.martinspielmann.wicket.chartjs.core.internal.JsonNumberAware;
import de.martinspielmann.wicket.chartjs.core.internal.JsonStringAware;
import de.martinspielmann.wicket.chartjs.core.internal.ScriptAware;
import de.martinspielmann.wicket.chartjs.core.internal.json.serializer.IndexableOptionSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.json.serializer.JsonAwareSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.json.serializer.JsonNumberAwareSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.json.serializer.JsonStringAwareSerializer;
import de.martinspielmann.wicket.chartjs.core.internal.json.serializer.ScriptableOptionSerializer;

public class Mapper {

  private static final ObjectMapper MAPPER;

  private Mapper() {}

  static {
    SimpleModule module = new SimpleModule();

    module.addSerializer(JsonAware.class, new JsonAwareSerializer());
    module.addSerializer(JsonNumberAware.class, new JsonNumberAwareSerializer());
    module.addSerializer(JsonStringAware.class, new JsonStringAwareSerializer());
    module.addSerializer(IndexableAware.class, new IndexableOptionSerializer());
    module.addSerializer(ScriptAware.class, new ScriptableOptionSerializer());

    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    mapper.setSerializationInclusion(Include.NON_EMPTY);
    mapper.setLocale(Locale.ENGLISH);
    mapper.registerModule(module);
    MAPPER = mapper;
  }

  public static ObjectMapper getInstance() {
    return MAPPER;
  }


  public static String toJson(final Object object) throws JsonProcessingException {
    return getInstance().writeValueAsString(object);
  }
}
