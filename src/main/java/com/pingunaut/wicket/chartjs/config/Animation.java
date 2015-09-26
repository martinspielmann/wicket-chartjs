
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
    "duration",
    "easing",
    "onProgress",
    "onComplete"
})
public class Animation {

    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("easing")
    private String easing;
    @JsonProperty("onProgress")
    private String onProgress;
    @JsonProperty("onComplete")
    private String onComplete;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The duration
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The easing
     */
    @JsonProperty("easing")
    public String getEasing() {
        return easing;
    }

    /**
     * 
     * @param easing
     *     The easing
     */
    @JsonProperty("easing")
    public void setEasing(String easing) {
        this.easing = easing;
    }

    /**
     * 
     * @return
     *     The onProgress
     */
    @JsonProperty("onProgress")
    public String getOnProgress() {
        return onProgress;
    }

    /**
     * 
     * @param onProgress
     *     The onProgress
     */
    @JsonProperty("onProgress")
    public void setOnProgress(String onProgress) {
        this.onProgress = onProgress;
    }

    /**
     * 
     * @return
     *     The onComplete
     */
    @JsonProperty("onComplete")
    public String getOnComplete() {
        return onComplete;
    }

    /**
     * 
     * @param onComplete
     *     The onComplete
     */
    @JsonProperty("onComplete")
    public void setOnComplete(String onComplete) {
        this.onComplete = onComplete;
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
