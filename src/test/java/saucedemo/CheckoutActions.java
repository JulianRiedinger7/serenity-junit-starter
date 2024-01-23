package saucedemo;

import net.serenitybdd.core.steps.UIInteractions;

public class CheckoutActions extends UIInteractions {
  public void fillInformation(String firstName, String lastName, String postalCode) {
    find("[data-test='firstName']").sendKeys(firstName);
    find("[data-test='lastName']").sendKeys(lastName);
    find("[data-test='postalCode']").sendKeys(postalCode);
    find("[data-test='continue']").click();
  }

  public void finish() {
    find("[data-test='finish']").click();
  }
}
