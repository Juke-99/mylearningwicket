package com.dreamseeker;

import org.apache.wicket.markup.html.basic.Label;

public class Page3 extends BasePage {
  public Page3() {
    add(new Label("label3", "This is subclass Page3"));
  }
}
