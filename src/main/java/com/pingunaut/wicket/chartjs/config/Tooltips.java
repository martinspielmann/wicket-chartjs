
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
    "enabled",
    "custom",
    "backgroundColor",
    "fontFamily",
    "fontSize",
    "fontStyle",
    "fontColor",
    "titleFontFamily",
    "titleFontSize",
    "titleFontStyle",
    "titleFontColor",
    "yPadding",
    "xPadding",
    "caretSize",
    "cornerRadius",
    "xOffset",
    "template",
    "multiTemplate",
    "multiKeyBackground"
})
public class Tooltips {

    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("custom")
    private Object custom;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("fontFamily")
    private String fontFamily;
    @JsonProperty("fontSize")
    private Integer fontSize;
    @JsonProperty("fontStyle")
    private String fontStyle;
    @JsonProperty("fontColor")
    private String fontColor;
    @JsonProperty("titleFontFamily")
    private String titleFontFamily;
    @JsonProperty("titleFontSize")
    private Integer titleFontSize;
    @JsonProperty("titleFontStyle")
    private String titleFontStyle;
    @JsonProperty("titleFontColor")
    private String titleFontColor;
    @JsonProperty("yPadding")
    private Integer yPadding;
    @JsonProperty("xPadding")
    private Integer xPadding;
    @JsonProperty("caretSize")
    private Integer caretSize;
    @JsonProperty("cornerRadius")
    private Integer cornerRadius;
    @JsonProperty("xOffset")
    private Integer xOffset;
    @JsonProperty("template")
    private String template;
    @JsonProperty("multiTemplate")
    private String multiTemplate;
    @JsonProperty("multiKeyBackground")
    private String multiKeyBackground;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 
     * @return
     *     The custom
     */
    @JsonProperty("custom")
    public Object getCustom() {
        return custom;
    }

    /**
     * 
     * @param custom
     *     The custom
     */
    @JsonProperty("custom")
    public void setCustom(Object custom) {
        this.custom = custom;
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
     *     The fontFamily
     */
    @JsonProperty("fontFamily")
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * 
     * @param fontFamily
     *     The fontFamily
     */
    @JsonProperty("fontFamily")
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * 
     * @return
     *     The fontSize
     */
    @JsonProperty("fontSize")
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * 
     * @param fontSize
     *     The fontSize
     */
    @JsonProperty("fontSize")
    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * 
     * @return
     *     The fontStyle
     */
    @JsonProperty("fontStyle")
    public String getFontStyle() {
        return fontStyle;
    }

    /**
     * 
     * @param fontStyle
     *     The fontStyle
     */
    @JsonProperty("fontStyle")
    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    /**
     * 
     * @return
     *     The fontColor
     */
    @JsonProperty("fontColor")
    public String getFontColor() {
        return fontColor;
    }

    /**
     * 
     * @param fontColor
     *     The fontColor
     */
    @JsonProperty("fontColor")
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * 
     * @return
     *     The titleFontFamily
     */
    @JsonProperty("titleFontFamily")
    public String getTitleFontFamily() {
        return titleFontFamily;
    }

    /**
     * 
     * @param titleFontFamily
     *     The titleFontFamily
     */
    @JsonProperty("titleFontFamily")
    public void setTitleFontFamily(String titleFontFamily) {
        this.titleFontFamily = titleFontFamily;
    }

    /**
     * 
     * @return
     *     The titleFontSize
     */
    @JsonProperty("titleFontSize")
    public Integer getTitleFontSize() {
        return titleFontSize;
    }

    /**
     * 
     * @param titleFontSize
     *     The titleFontSize
     */
    @JsonProperty("titleFontSize")
    public void setTitleFontSize(Integer titleFontSize) {
        this.titleFontSize = titleFontSize;
    }

    /**
     * 
     * @return
     *     The titleFontStyle
     */
    @JsonProperty("titleFontStyle")
    public String getTitleFontStyle() {
        return titleFontStyle;
    }

    /**
     * 
     * @param titleFontStyle
     *     The titleFontStyle
     */
    @JsonProperty("titleFontStyle")
    public void setTitleFontStyle(String titleFontStyle) {
        this.titleFontStyle = titleFontStyle;
    }

    /**
     * 
     * @return
     *     The titleFontColor
     */
    @JsonProperty("titleFontColor")
    public String getTitleFontColor() {
        return titleFontColor;
    }

    /**
     * 
     * @param titleFontColor
     *     The titleFontColor
     */
    @JsonProperty("titleFontColor")
    public void setTitleFontColor(String titleFontColor) {
        this.titleFontColor = titleFontColor;
    }

    /**
     * 
     * @return
     *     The yPadding
     */
    @JsonProperty("yPadding")
    public Integer getYPadding() {
        return yPadding;
    }

    /**
     * 
     * @param yPadding
     *     The yPadding
     */
    @JsonProperty("yPadding")
    public void setYPadding(Integer yPadding) {
        this.yPadding = yPadding;
    }

    /**
     * 
     * @return
     *     The xPadding
     */
    @JsonProperty("xPadding")
    public Integer getXPadding() {
        return xPadding;
    }

    /**
     * 
     * @param xPadding
     *     The xPadding
     */
    @JsonProperty("xPadding")
    public void setXPadding(Integer xPadding) {
        this.xPadding = xPadding;
    }

    /**
     * 
     * @return
     *     The caretSize
     */
    @JsonProperty("caretSize")
    public Integer getCaretSize() {
        return caretSize;
    }

    /**
     * 
     * @param caretSize
     *     The caretSize
     */
    @JsonProperty("caretSize")
    public void setCaretSize(Integer caretSize) {
        this.caretSize = caretSize;
    }

    /**
     * 
     * @return
     *     The cornerRadius
     */
    @JsonProperty("cornerRadius")
    public Integer getCornerRadius() {
        return cornerRadius;
    }

    /**
     * 
     * @param cornerRadius
     *     The cornerRadius
     */
    @JsonProperty("cornerRadius")
    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    /**
     * 
     * @return
     *     The xOffset
     */
    @JsonProperty("xOffset")
    public Integer getXOffset() {
        return xOffset;
    }

    /**
     * 
     * @param xOffset
     *     The xOffset
     */
    @JsonProperty("xOffset")
    public void setXOffset(Integer xOffset) {
        this.xOffset = xOffset;
    }

    /**
     * 
     * @return
     *     The template
     */
    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

    /**
     * 
     * @param template
     *     The template
     */
    @JsonProperty("template")
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * 
     * @return
     *     The multiTemplate
     */
    @JsonProperty("multiTemplate")
    public String getMultiTemplate() {
        return multiTemplate;
    }

    /**
     * 
     * @param multiTemplate
     *     The multiTemplate
     */
    @JsonProperty("multiTemplate")
    public void setMultiTemplate(String multiTemplate) {
        this.multiTemplate = multiTemplate;
    }

    /**
     * 
     * @return
     *     The multiKeyBackground
     */
    @JsonProperty("multiKeyBackground")
    public String getMultiKeyBackground() {
        return multiKeyBackground;
    }

    /**
     * 
     * @param multiKeyBackground
     *     The multiKeyBackground
     */
    @JsonProperty("multiKeyBackground")
    public void setMultiKeyBackground(String multiKeyBackground) {
        this.multiKeyBackground = multiKeyBackground;
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
