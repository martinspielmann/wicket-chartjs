package de.martinspielmann.wicket.chartjs.data.dataset;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import de.martinspielmann.wicket.chartjs.core.internal.IndexableOption;
import de.martinspielmann.wicket.chartjs.data.dataset.property.Clip;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.BorderCapStyle;
import de.martinspielmann.wicket.chartjs.data.dataset.property.border.BorderJoinStyle;
import de.martinspielmann.wicket.chartjs.data.dataset.property.color.Color;
import de.martinspielmann.wicket.chartjs.data.dataset.property.fill.Fill;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.INumber;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.SimpleNumber;
import de.martinspielmann.wicket.chartjs.data.dataset.property.pointstyle.PointStyle;
import de.martinspielmann.wicket.chartjs.data.dataset.property.spangaps.SpanGaps;


public class RadarDataset extends AbstractDataset {

  @JsonIgnore
  private static final long serialVersionUID = 1L;

  // backgroundColor Color Yes - 'rgba(0, 0, 0, 0.1)'
  private Color backgroundColor;
  // borderCapStyle string Yes - 'butt'
  private BorderCapStyle borderCapStyle;
  // borderColor Color Yes - 'rgba(0, 0, 0, 0.1)'
  private Color borderColor;
  // borderDash number[] Yes - []
  private final List<INumber> borderDash = new ArrayList<>();
  // borderDashOffset number Yes - 0.0
  private INumber borderDashOffset;
  // borderJoinStyle string Yes - 'miter'
  private BorderJoinStyle borderJoinStyle;
  // borderWidth number Yes - 3
  private INumber borderWidth;
  // hoverBackgroundColor Color Yes - undefined
  private Color hoverBackgroundColor;
  // hoverBorderCapStyle string Yes - undefined
  private BorderCapStyle hoverBorderCapStyle;
  // hoverBorderColor Color Yes - undefined
  private Color hoverBorderColor;
  // hoverBorderDash number[] Yes - undefined
  private final List<INumber> hoverBorderDash = new ArrayList<>();
  // hoverBorderDashOffset number Yes - undefined
  private INumber hoverBorderDashOffset;
  // hoverBorderJoinStyle string Yes - undefined
  private BorderJoinStyle hoverBorderJoinStyle;
  // hoverBorderWidth number Yes - undefined
  private INumber hoverBorderWidth;
  // clip number|object - - undefined
  private Clip clip;
  // fill boolean|string Yes - true
  private Fill fill;
  // order number - - 0
  private SimpleNumber order;
  // lineTension number - - 0.4
  private SimpleNumber lineTension;
  // pointBackgroundColor Color Yes Yes 'rgba(0, 0, 0, 0.1)'
  private IndexableOption<Color> pointBackgroundColor;
  // pointBorderColor Color Yes Yes 'rgba(0, 0, 0, 0.1)'
  private IndexableOption<Color> pointBorderColor;
  // pointBorderWidth number Yes Yes 1
  private IndexableOption<INumber> pointBorderWidth;
  // pointHitRadius number Yes Yes 1
  private IndexableOption<INumber> pointHitRadius;
  // pointHoverBackgroundColor Color Yes Yes undefined
  private IndexableOption<Color> pointHoverBackgroundColor;
  // pointHoverBorderColor Color Yes Yes undefined
  private IndexableOption<Color> pointHoverBorderColor;
  // pointHoverBorderWidth number Yes Yes 1
  private IndexableOption<INumber> pointHoverBorderWidth;
  // pointHoverRadius number Yes Yes 4
  private IndexableOption<INumber> pointHoverRadius;
  // pointRadius number Yes Yes 3
  private IndexableOption<INumber> pointRadius;
  // pointRotation number Yes Yes 0
  private IndexableOption<INumber> pointRotation;
  // pointStyle string|Image Yes Yes 'circle'
  private PointStyle pointStyle;
  // showLine boolean - - undefined
  private Boolean showLine;
  // spanGaps boolean|number - - undefined
  private SpanGaps spanGaps;

  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public BorderCapStyle getBorderCapStyle() {
    return borderCapStyle;
  }

  public void setBorderCapStyle(BorderCapStyle borderCapStyle) {
    this.borderCapStyle = borderCapStyle;
  }

  public Color getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(Color borderColor) {
    this.borderColor = borderColor;
  }

  public INumber getBorderDashOffset() {
    return borderDashOffset;
  }

  public void setBorderDashOffset(INumber borderDashOffset) {
    this.borderDashOffset = borderDashOffset;
  }

  public BorderJoinStyle getBorderJoinStyle() {
    return borderJoinStyle;
  }

  public void setBorderJoinStyle(BorderJoinStyle borderJoinStyle) {
    this.borderJoinStyle = borderJoinStyle;
  }

  public INumber getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(INumber borderWidth) {
    this.borderWidth = borderWidth;
  }

  public Color getHoverBackgroundColor() {
    return hoverBackgroundColor;
  }

  public void setHoverBackgroundColor(Color hoverBackgroundColor) {
    this.hoverBackgroundColor = hoverBackgroundColor;
  }

  public BorderCapStyle getHoverBorderCapStyle() {
    return hoverBorderCapStyle;
  }

  public void setHoverBorderCapStyle(BorderCapStyle hoverBorderCapStyle) {
    this.hoverBorderCapStyle = hoverBorderCapStyle;
  }

  public Color getHoverBorderColor() {
    return hoverBorderColor;
  }

  public void setHoverBorderColor(Color hoverBorderColor) {
    this.hoverBorderColor = hoverBorderColor;
  }

  public INumber getHoverBorderDashOffset() {
    return hoverBorderDashOffset;
  }

  public void setHoverBorderDashOffset(INumber hoverBorderDashOffset) {
    this.hoverBorderDashOffset = hoverBorderDashOffset;
  }

  public BorderJoinStyle getHoverBorderJoinStyle() {
    return hoverBorderJoinStyle;
  }

  public void setHoverBorderJoinStyle(BorderJoinStyle hoverBorderJoinStyle) {
    this.hoverBorderJoinStyle = hoverBorderJoinStyle;
  }

  public INumber getHoverBorderWidth() {
    return hoverBorderWidth;
  }

  public void setHoverBorderWidth(INumber hoverBorderWidth) {
    this.hoverBorderWidth = hoverBorderWidth;
  }

  public Clip getClip() {
    return clip;
  }

  public void setClip(Clip clip) {
    this.clip = clip;
  }

  public Fill getFill() {
    return fill;
  }

  public void setFill(Fill fill) {
    this.fill = fill;
  }

  public SimpleNumber getOrder() {
    return order;
  }

  public void setOrder(SimpleNumber order) {
    this.order = order;
  }

  public SimpleNumber getLineTension() {
    return lineTension;
  }

  public void setLineTension(SimpleNumber lineTension) {
    this.lineTension = lineTension;
  }

  public IndexableOption<Color> getPointBackgroundColor() {
    return pointBackgroundColor;
  }

  public void setPointBackgroundColor(IndexableOption<Color> pointBackgroundColor) {
    this.pointBackgroundColor = pointBackgroundColor;
  }

  public IndexableOption<Color> getPointBorderColor() {
    return pointBorderColor;
  }

  public void setPointBorderColor(IndexableOption<Color> pointBorderColor) {
    this.pointBorderColor = pointBorderColor;
  }

  public IndexableOption<INumber> getPointBorderWidth() {
    return pointBorderWidth;
  }

  public void setPointBorderWidth(IndexableOption<INumber> pointBorderWidth) {
    this.pointBorderWidth = pointBorderWidth;
  }

  public IndexableOption<INumber> getPointHitRadius() {
    return pointHitRadius;
  }

  public void setPointHitRadius(IndexableOption<INumber> pointHitRadius) {
    this.pointHitRadius = pointHitRadius;
  }

  public IndexableOption<Color> getPointHoverBackgroundColor() {
    return pointHoverBackgroundColor;
  }

  public void setPointHoverBackgroundColor(IndexableOption<Color> pointHoverBackgroundColor) {
    this.pointHoverBackgroundColor = pointHoverBackgroundColor;
  }

  public IndexableOption<Color> getPointHoverBorderColor() {
    return pointHoverBorderColor;
  }

  public void setPointHoverBorderColor(IndexableOption<Color> pointHoverBorderColor) {
    this.pointHoverBorderColor = pointHoverBorderColor;
  }

  public IndexableOption<INumber> getPointHoverBorderWidth() {
    return pointHoverBorderWidth;
  }

  public void setPointHoverBorderWidth(IndexableOption<INumber> pointHoverBorderWidth) {
    this.pointHoverBorderWidth = pointHoverBorderWidth;
  }

  public IndexableOption<INumber> getPointHoverRadius() {
    return pointHoverRadius;
  }

  public void setPointHoverRadius(IndexableOption<INumber> pointHoverRadius) {
    this.pointHoverRadius = pointHoverRadius;
  }

  public IndexableOption<INumber> getPointRadius() {
    return pointRadius;
  }

  public void setPointRadius(IndexableOption<INumber> pointRadius) {
    this.pointRadius = pointRadius;
  }

  public IndexableOption<INumber> getPointRotation() {
    return pointRotation;
  }

  public void setPointRotation(IndexableOption<INumber> pointRotation) {
    this.pointRotation = pointRotation;
  }

  public PointStyle getPointStyle() {
    return pointStyle;
  }

  public void setPointStyle(PointStyle pointStyle) {
    this.pointStyle = pointStyle;
  }

  public Boolean getShowLine() {
    return showLine;
  }

  public void setShowLine(Boolean showLine) {
    this.showLine = showLine;
  }

  public SpanGaps getSpanGaps() {
    return spanGaps;
  }

  public void setSpanGaps(SpanGaps spanGaps) {
    this.spanGaps = spanGaps;
  }

  public List<INumber> getBorderDash() {
    return borderDash;
  }

  public List<INumber> getHoverBorderDash() {
    return hoverBorderDash;
  }

}
