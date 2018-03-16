package com.dreamseeker;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.basic.Label;

public class Panels extends WebPage {
  //public static final String COMMENT_ID = "contentComponent";

  //private Component headerPanel;
  //private Component menuPanel;
  //private Component footerPanel;

  public Panels() {
    add(new HeaderPanel("headerPanel"));
    add(new MenuPanel("menuPanel"));
    add(new FooterPanel("footerPanel"));
  }
}
