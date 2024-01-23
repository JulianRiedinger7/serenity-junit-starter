package saucedemo;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

  public String getHeading() {
    return find(".title").getText();
  }
}
