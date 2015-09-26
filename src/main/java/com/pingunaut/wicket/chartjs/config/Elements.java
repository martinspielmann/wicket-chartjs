
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
    "line",
    "point",
    "bar",
    "slice"
})
public class Elements {

    @JsonProperty("line")
    private Line line;
    @JsonProperty("point")
    private Point point;
    @JsonProperty("bar")
    private Bar bar;
    @JsonProperty("slice")
    private Slice slice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The line
     */
    @JsonProperty("line")
    public Line getLine() {
        return line;
    }

    /**
     * 
     * @param line
     *     The line
     */
    @JsonProperty("line")
    public void setLine(Line line) {
        this.line = line;
    }

    /**
     * 
     * @return
     *     The point
     */
    @JsonProperty("point")
    public Point getPoint() {
        return point;
    }

    /**
     * 
     * @param point
     *     The point
     */
    @JsonProperty("point")
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * 
     * @return
     *     The bar
     */
    @JsonProperty("bar")
    public Bar getBar() {
        return bar;
    }

    /**
     * 
     * @param bar
     *     The bar
     */
    @JsonProperty("bar")
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    /**
     * 
     * @return
     *     The slice
     */
    @JsonProperty("slice")
    public Slice getSlice() {
        return slice;
    }

    /**
     * 
     * @param slice
     *     The slice
     */
    @JsonProperty("slice")
    public void setSlice(Slice slice) {
        this.slice = slice;
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
