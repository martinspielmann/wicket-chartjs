
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
    "tension",
    "backgroundColor",
    "borderWidth",
    "borderColor",
    "fill",
    "skipNull",
    "drawNull"
})
public class Line {

    @JsonProperty("tension")
    private Double tension;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("borderWidth")
    private Integer borderWidth;
    @JsonProperty("borderColor")
    private String borderColor;
    @JsonProperty("fill")
    private Boolean fill;
    @JsonProperty("skipNull")
    private Boolean skipNull;
    @JsonProperty("drawNull")
    private Boolean drawNull;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tension
     */
    @JsonProperty("tension")
    public Double getTension() {
        return tension;
    }

    /**
     * 
     * @param tension
     *     The tension
     */
    @JsonProperty("tension")
    public void setTension(Double tension) {
        this.tension = tension;
    }

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
     *     The fill
     */
    @JsonProperty("fill")
    public Boolean getFill() {
        return fill;
    }

    /**
     * 
     * @param fill
     *     The fill
     */
    @JsonProperty("fill")
    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    /**
     * 
     * @return
     *     The skipNull
     */
    @JsonProperty("skipNull")
    public Boolean getSkipNull() {
        return skipNull;
    }

    /**
     * 
     * @param skipNull
     *     The skipNull
     */
    @JsonProperty("skipNull")
    public void setSkipNull(Boolean skipNull) {
        this.skipNull = skipNull;
    }

    /**
     * 
     * @return
     *     The drawNull
     */
    @JsonProperty("drawNull")
    public Boolean getDrawNull() {
        return drawNull;
    }

    /**
     * 
     * @param drawNull
     *     The drawNull
     */
    @JsonProperty("drawNull")
    public void setDrawNull(Boolean drawNull) {
        this.drawNull = drawNull;
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
