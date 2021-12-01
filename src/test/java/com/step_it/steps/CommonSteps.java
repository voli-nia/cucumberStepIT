package com.step_it.steps;

import com.step_it.pages.LoginPage;
import com.step_it.pages.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
@AllArgsConstructor
public class CommonSteps {
    private LoginPage loginPage;
    private MainPage mainPage;

    public void checkLoginPageIsOpen() {
        log.info("Check login page is open");
        assertThat(loginPage.isLogoDisplayed()).as("Login page isn't opened").isTrue();

    }

    public void checkUserLoggedIn() {
        log.info("Check user is logged in");
        assertThat(mainPage.isTitleDisplayed()).as("Main page isn't opened").isTrue();
    }

    public void checkCartEmpty() {
        log.info("Check cart is empty");
        checkCartCounter(0, "The counter is not empty");

    }

    private void checkCartCounter(int counter, String assertionMessage) {
        assertThat(mainPage.getProductCountInCart()).as(assertionMessage).isEqualTo(counter);
    }

    public void checkCartCounterUpdated(int increment) {
        log.info("Check cart counter is updated");
        checkCartCounter(increment, "The counter was not updated");

    }
}
