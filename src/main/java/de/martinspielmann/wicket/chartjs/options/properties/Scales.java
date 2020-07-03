package de.martinspielmann.wicket.chartjs.options.properties;

import java.io.Serializable;

public class Scales implements Serializable {

  private static final long serialVersionUID = 1L;

  private Axes x;
  private Axes y;

  /**
   * @return the x
   */
  public Axes getX() {
    return x;
  }

  /**
   * @param x the x to set
   */
  public void setX(Axes x) {
    this.x = x;
  }

  /**
   * @return the y
   */
  public Axes getY() {
    return y;
  }

  /**
   * @param y the y to set
   */
  public void setY(Axes y) {
    this.y = y;
  }

}
