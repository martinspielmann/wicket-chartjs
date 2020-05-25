package de.martinspielmann.wicket.chartjs.core.internal;

public abstract class ScriptableOption implements ScriptAware {

  private static final long serialVersionUID = 1L;

  private final String script;

  public ScriptableOption(String script) {
    this.script = script;
  }

  @Override
  public String getScript() {
    return script;
  }
}
