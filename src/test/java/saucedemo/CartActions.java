package saucedemo;

import net.serenitybdd.core.steps.UIInteractions;

public class CartActions extends UIInteractions {
  public void proceedCheckout() {
    find("[data-test='checkout']").click();
  }
}
