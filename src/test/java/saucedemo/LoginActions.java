package saucedemo;

import net.serenitybdd.core.steps.UIInteractions;

public class LoginActions extends UIInteractions {

  public void with(Credential credential) {
    openUrl("https://www.saucedemo.com");
    find("[data-test='username']").sendKeys(credential.getUsername());
    find("[data-test='password']").sendKeys(credential.getPassword());
    find("[data-test='login-button']").click();
  }
}
