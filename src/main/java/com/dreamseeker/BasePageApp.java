package com.dreamseeker;

import org.apache.wicket.protocol.http.WebApplication;

public class BasePageApp extends WebApplication {

  @Override
  public void init() {
    super.init();
  }

  @Override
  public Class<? extends org.apache.wicket.Page> getHomePage() {
    return BasePage.class;
  }
}
