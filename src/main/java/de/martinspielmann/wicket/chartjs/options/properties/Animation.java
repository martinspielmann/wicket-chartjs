package de.martinspielmann.wicket.chartjs.options.properties;

import java.io.Serializable;
import de.martinspielmann.wicket.chartjs.data.dataset.property.number.SimpleNumber;

public class Animation implements Serializable {

  private static final long serialVersionUID = 1L;

  // duration number 1000 The number of milliseconds an animation takes.
  private SimpleNumber duration;
  // easing string 'easeOutQuart' Easing function to use. more...
  private Easing easing;
  // debug boolean undefined Running animation count + FPS display in upper left corner of the
  // chart.
  private Boolean debug;
  // onProgress function null Callback called on each step of an animation. more...
  private Function onProgress;
  // onComplete function null Callback called when all animations are completed. more...
  private Function onComplete;
  // delay number undefined Delay before starting the animations.
  private SimpleNumber delay;
  // loop boolean undefined If set to true, loop the animations loop endlessly.
  private Boolean loop;

  // type string typeof property Type of property, determines the interpolator used. Possible
  // values: 'number', 'color'.
  // from number|Color undefined Start value for the animation. Current value is used when undefined
  // active object { duration: 400 } Option overrides for active animations (hover)
  // resize object { duration: 0 } Option overrides for resize animations.
  // [property] object undefined Option overrides for [property].
  // [collection] object defaults... Option overrides for multiple properties, identified by
  // properties array.
  // [mode] object defaults... Option overrides for update mode. Core modes: 'active', 'hide',
  // 'reset', 'resize', 'show'. A custom mode can be used by passing a custom mode to update
  public SimpleNumber getDuration() {
    return duration;
  }

  public void setDuration(SimpleNumber duration) {
    this.duration = duration;
  }

  public Easing getEasing() {
    return easing;
  }

  public void setEasing(Easing easing) {
    this.easing = easing;
  }

  public Boolean getDebug() {
    return debug;
  }

  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  public Function getOnProgress() {
    return onProgress;
  }

  public void setOnProgress(Function onProgress) {
    this.onProgress = onProgress;
  }

  public Function getOnComplete() {
    return onComplete;
  }

  public void setOnComplete(Function onComplete) {
    this.onComplete = onComplete;
  }

  public SimpleNumber getDelay() {
    return delay;
  }

  public void setDelay(SimpleNumber delay) {
    this.delay = delay;
  }

  public Boolean getLoop() {
    return loop;
  }

  public void setLoop(Boolean loop) {
    this.loop = loop;
  }

}
