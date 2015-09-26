
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
    "backgroundColor",
    "borderColor",
    "borderWidth"
})
public class Slice {

    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("borderColor")
    private String borderColor;
    @JsonProperty("borderWidth")
    private Integer borderWidth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The backgroundColor
     */
    @JsonProperty("backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 
     * @param backgroundColor
     *     The backgroundColor
     */
    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * 
     * @return
     *     The borderColor
     */
    @JsonProperty("borderColor")
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 
     * @param borderColor
     *     The borderColor
     */
    @JsonProperty("borderColor")
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * 
     * @return
     *     The borderWidth
     */
    @JsonProperty("borderWidth")
    public Integer getBorderWidth() {
        return borderWidth;
    }

    /**
     * 
     * @param borderWidth
     *     The borderWidth
     */
    @JsonProperty("borderWidth")
    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
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
