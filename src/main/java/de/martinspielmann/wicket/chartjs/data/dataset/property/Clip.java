package de.martinspielmann.wicket.chartjs.data.dataset.property;

import java.util.Map;
import de.martinspielmann.wicket.chartjs.core.internal.JsonAware;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.SimpleNumber;

public class Clip implements JsonAware {

  private static final long serialVersionUID = 1L;

  private final SimpleNumber singleNumber;
  private final SidedClip sidedClip;

  public Clip(Number clipPixels) {
    this.singleNumber = new SimpleNumber(clipPixels);
    this.sidedClip = null;
  }

  /**
   * Can be number or false if number is null.
   * 
   * @param top
   * @param right
   * @param bottom
   * @param left
   */
  public Clip(Number top, Number right, Number bottom, Number left) {
    this.singleNumber = null;
    SidedClip s = new SidedClip(top, right, bottom, left);
    this.sidedClip = s;
  }

  public static class SidedClip implements JsonAware {
    private static final long serialVersionUID = 1L;

    private final Number top;
    private final Number right;
    private final Number bottom;
    private final Number left;

    public SidedClip(Number top, Number right, Number bottom, Number left) {
      super();
      this.top = top;
      this.right = right;
      this.bottom = bottom;
      this.left = left;
    }

    public Number getTop() {
      return top;
    }

    public Number getRight() {
      return right;
    }

    public Number getBottom() {
      return bottom;
    }

    public Number getLeft() {
      return left;
    }

    @Override
    public Object getJson() {
      // Can be number or false if number is null.
      return Map.of("top", top == null ? false : top, "right", right == null ? false : right,
          "bottom", bottom == null ? false : bottom, "left", left == null ? false : left);
    }
  }

  @Override
  public Object getJson() {
    if (singleNumber != null) {
      return singleNumber;
    } else if (sidedClip != null) {
      return sidedClip;
    } else {
      return null;
    }
  }
}
