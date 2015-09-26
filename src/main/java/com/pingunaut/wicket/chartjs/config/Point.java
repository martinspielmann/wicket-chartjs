
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
    "radius",
    "backgroundColor",
    "borderWidth",
    "borderColor",
    "hitRadius",
    "hoverRadius",
    "hoverBorderWidth"
})
public class Point {

    @JsonProperty("radius")
    private Integer radius;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("borderWidth")
    private Integer borderWidth;
    @JsonProperty("borderColor")
    private String borderColor;
    @JsonProperty("hitRadius")
    private Integer hitRadius;
    @JsonProperty("hoverRadius")
    private Integer hoverRadius;
    @JsonProperty("hoverBorderWidth")
    private Integer hoverBorderWidth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The radius
     */
    @JsonProperty("radius")
    public Integer getRadius() {
        return radius;
    }

    /**
     * 
     * @param radius
     *     The radius
     */
    @JsonProperty("radius")
    public void setRadius(Integer radius) {
        this.radius = radius;
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
     *     The hitRadius
     */
    @JsonProperty("hitRadius")
    public Integer getHitRadius() {
        return hitRadius;
    }

    /**
     * 
     * @param hitRadius
     *     The hitRadius
     */
    @JsonProperty("hitRadius")
    public void setHitRadius(Integer hitRadius) {
        this.hitRadius = hitRadius;
    }

    /**
     * 
     * @return
     *     The hoverRadius
     */
    @JsonProperty("hoverRadius")
    public Integer getHoverRadius() {
        return hoverRadius;
    }

    /**
     * 
     * @param hoverRadius
     *     The hoverRadius
     */
    @JsonProperty("hoverRadius")
    public void setHoverRadius(Integer hoverRadius) {
        this.hoverRadius = hoverRadius;
    }

    /**
     * 
     * @return
     *     The hoverBorderWidth
     */
    @JsonProperty("hoverBorderWidth")
    public Integer getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    /**
     * 
     * @param hoverBorderWidth
     *     The hoverBorderWidth
     */
    @JsonProperty("hoverBorderWidth")
    public void setHoverBorderWidth(Integer hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
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
