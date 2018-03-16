package com.dreamseeker;

import org.apache.wicket.markup.html.basic.Label;

public class Page2 extends BasePage {
  public Page2() {
    add(new Label("label2", "This is subclass Page2"));
  }
}
