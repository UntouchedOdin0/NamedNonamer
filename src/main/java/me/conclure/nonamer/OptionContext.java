package me.conclure.nonamer;

import joptsimple.OptionSet;

public final class OptionContext {
  private final String token;

  private OptionContext(String token) {
    this.token = token;
  }

  static OptionContext from(OptionSet set) {
    try {
      String token = (String) set.valueOf("token");
      return new OptionContext(token);
    } catch (ClassCastException exception) {
      throw new RuntimeException(exception);
    }
  }

  public String token() {
    return this.token;
  }
}
