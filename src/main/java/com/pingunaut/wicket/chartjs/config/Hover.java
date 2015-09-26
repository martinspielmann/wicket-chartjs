
package com.pingunaut.wicket.chartjs.config;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "onHover",
    "mode",
    "animationDuration"
})
public class Hover {

    @JsonProperty("onHover")
    private Object onHover;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("animationDuration")
    private Integer animationDuration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The onHover
     */
    @JsonProperty("onHover")
    public Object getOnHover() {
        return onHover;
    }

    /**
     * 
     * @param onHover
     *     The onHover
     */
    @JsonProperty("onHover")
    public void setOnHover(Object onHover) {
        this.onHover = onHover;
    }

    /**
     * 
     * @return
     *     The mode
     */
    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    /**
     * 
     * @param mode
     *     The mode
     */
    @JsonProperty("mode")
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * 
     * @return
     *     The animationDuration
     */
    @JsonProperty("animationDuration")
    public Integer getAnimationDuration() {
        return animationDuration;
    }

    /**
     * 
     * @param animationDuration
     *     The animationDuration
     */
    @JsonProperty("animationDuration")
    public void setAnimationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
