package de.martinspielmann.wicket.chartjs.options.element;

import java.io.Serializable;


public class Elements implements Serializable {

  private static final long serialVersionUID = 1L;

  private Point point;
  private Line line;
  private Rectangle rectangle;
  private Arc arc;

  public Point getPoint() {
    return point;
  }

  public void setPoint(Point point) {
    this.point = point;
  }

  public Line getLine() {
    return line;
  }

  public void setLine(Line line) {
    this.line = line;
  }

  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public Arc getArc() {
    return arc;
  }

  public void setArc(Arc arc) {
    this.arc = arc;
  }

}
