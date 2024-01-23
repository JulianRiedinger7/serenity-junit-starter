package saucedemo;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;

public class PurchaseActions extends UIInteractions {

  public void addToCart(int productNumber) {
    List<WebElementFacade> addToCartBtns = findAll(".inventory_item button");
    addToCartBtns.get(productNumber - 1).click();
  }

  public void goToCart() {
    find("#shopping_cart_container").click();
  }
}
