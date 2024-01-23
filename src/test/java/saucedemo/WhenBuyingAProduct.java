package saucedemo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenBuyingAProduct {

  @Managed
  WebDriver driver;

  @Steps
  LoginActions login;
  PurchaseActions purchase;
  CartActions cart;
  CheckoutActions checkout;
  CompletePage complete;
  HomePage home;

  @Test
  public void userShouldBeAbleToPurchaseAProduct() {
    login.with(Credential.STANDARD_USER);
    purchase.addToCart(1);

    Serenity.reportThat("The cart badge should include the correct number",
        () -> Assertions.assertThat(home.getCartBadge()).isEqualTo("1"));

    purchase.goToCart();
    cart.proceedCheckout();
    checkout.fillInformation("julian", "perez", "8000");
    checkout.finish();

    Serenity.reportThat("The completion page should include the correct title",
        () -> Assertions.assertThat(complete.getHeading()).isEqualToIgnoringCase("Thank you for your order!"));
  }
}
