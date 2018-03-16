package com.dreamseeker;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;

public class BasePage extends WebPage {
  private static int currentPageNumber = 1;

  public BasePage() {
    add(new Link<Void>("arr_left") {
      @Override public void onClick() {
        if(currentPageNumber == 3) {
          currentPageNumber = 2;
        }

        setResponsePage(getCurrentPageNumber(currentPageNumber));

        if(currentPageNumber > 1) {
          currentPageNumber--;
        }
      }
    });

    add(new BookmarkablePageLink<Void>("page1", Page1.class));
    add(new BookmarkablePageLink<Void>("page2", Page2.class));
    add(new BookmarkablePageLink<Void>("page3", Page3.class));

    add(new Link<Void>("arr_right") {
      @Override public void onClick() {
        if(currentPageNumber == 1) {
          currentPageNumber = 2;
        }

        setResponsePage(getCurrentPageNumber(currentPageNumber));

        if(currentPageNumber < 3) {
          currentPageNumber++;
        }
      }
    });

    add(new Label("footer", "This is in the footer"));
  }

  public Class getCurrentPageNumber(int currentPageNumber) {
    switch(currentPageNumber) {
      case 1:
      return Page1.class;

      case 2:
      return Page2.class;

      case 3:
      return Page3.class;

      default:
      return null;
    }
  }
}
