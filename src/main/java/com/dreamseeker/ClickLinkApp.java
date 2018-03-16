package com.dreamseeker;

import org.apache.wicket.protocol.http.WebApplication;

public class ClickLinkApp extends WebApplication {

  @Override
  public void init() {
    super.init();
  }

  @Override
  public Class<? extends org.apache.wicket.Page> getHomePage() {
    return ClickLink.class;
  }
}
