
package com.pingunaut.wicket.chartjs.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "animation",
    "responsive",
    "maintainAspectRatio",
    "events",
    "hover",
    "onClick",
    "tooltips",
    "defaultColor",
    "elements"
})
public class GlobalConfigs {

    @JsonProperty("animation")
    private Animation animation;
    @JsonProperty("responsive")
    private Boolean responsive;
    @JsonProperty("maintainAspectRatio")
    private Boolean maintainAspectRatio;
    @JsonProperty("events")
    private List<String> events = new ArrayList<String>();
    @JsonProperty("hover")
    private Hover hover;
    @JsonProperty("onClick")
    private Object onClick;
    @JsonProperty("tooltips")
    private Tooltips tooltips;
    @JsonProperty("defaultColor")
    private String defaultColor;
    @JsonProperty("elements")
    private Elements elements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The animation
     */
    @JsonProperty("animation")
    public Animation getAnimation() {
        return animation;
    }

    /**
     * 
     * @param animation
     *     The animation
     */
    @JsonProperty("animation")
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    /**
     * 
     * @return
     *     The responsive
     */
    @JsonProperty("responsive")
    public Boolean getResponsive() {
        return responsive;
    }

    /**
     * 
     * @param responsive
     *     The responsive
     */
    @JsonProperty("responsive")
    public void setResponsive(Boolean responsive) {
        this.responsive = responsive;
    }

    /**
     * 
     * @return
     *     The maintainAspectRatio
     */
    @JsonProperty("maintainAspectRatio")
    public Boolean getMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    /**
     * 
     * @param maintainAspectRatio
     *     The maintainAspectRatio
     */
    @JsonProperty("maintainAspectRatio")
    public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
    }

    /**
     * 
     * @return
     *     The events
     */
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    /**
     * 
     * @param events
     *     The events
     */
    @JsonProperty("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    /**
     * 
     * @return
     *     The hover
     */
    @JsonProperty("hover")
    public Hover getHover() {
        return hover;
    }

    /**
     * 
     * @param hover
     *     The hover
     */
    @JsonProperty("hover")
    public void setHover(Hover hover) {
        this.hover = hover;
    }

    /**
     * 
     * @return
     *     The onClick
     */
    @JsonProperty("onClick")
    public Object getOnClick() {
        return onClick;
    }

    /**
     * 
     * @param onClick
     *     The onClick
     */
    @JsonProperty("onClick")
    public void setOnClick(Object onClick) {
        this.onClick = onClick;
    }

    /**
     * 
     * @return
     *     The tooltips
     */
    @JsonProperty("tooltips")
    public Tooltips getTooltips() {
        return tooltips;
    }

    /**
     * 
     * @param tooltips
     *     The tooltips
     */
    @JsonProperty("tooltips")
    public void setTooltips(Tooltips tooltips) {
        this.tooltips = tooltips;
    }

    /**
     * 
     * @return
     *     The defaultColor
     */
    @JsonProperty("defaultColor")
    public String getDefaultColor() {
        return defaultColor;
    }

    /**
     * 
     * @param defaultColor
     *     The defaultColor
     */
    @JsonProperty("defaultColor")
    public void setDefaultColor(String defaultColor) {
        this.defaultColor = defaultColor;
    }

    /**
     * 
     * @return
     *     The elements
     */
    @JsonProperty("elements")
    public Elements getElements() {
        return elements;
    }

    /**
     * 
     * @param elements
     *     The elements
     */
    @JsonProperty("elements")
    public void setElements(Elements elements) {
        this.elements = elements;
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
