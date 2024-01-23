package saucedemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingIn {

  @Managed
  WebDriver driver;

  @Steps
  LoginActions login;
  HomePage home;

  @Test
  public void userCanLoginWithStandardCredentials() {
    login.with(Credential.STANDARD_USER);
    Serenity.reportThat("The home page should include the correct text",
        () -> Assertions.assertThat(home.getHeading()).isEqualToIgnoringCase("Products"));
  }
}
