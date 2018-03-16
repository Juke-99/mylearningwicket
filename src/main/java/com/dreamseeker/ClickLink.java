package com.dreamseeker;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

public class ClickLink extends WebPage {
  private int count = 0;

  public ClickLink() {
    /*add(new Link("link") {
      @Override public void onClick() {
        count++;
      }
    });*/

    add(new Link("anotherLink") {
      @Override public void onClick() {
        AfterClickPage clickPage = new AfterClickPage();
        setResponsePage(clickPage);
      }
    });

    //add(new Label("count", new PropertyModel(this, "count")));
  }
}
