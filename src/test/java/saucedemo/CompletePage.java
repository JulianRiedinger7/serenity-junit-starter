package saucedemo;

import net.serenitybdd.core.pages.PageObject;

public class CompletePage extends PageObject {
  public String getHeading() {
    return find(".complete-header").getText();
  }
}
