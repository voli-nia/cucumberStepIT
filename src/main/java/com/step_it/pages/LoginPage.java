package com.step_it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css="#user-name")
    WebElement usernameInput;

    @FindBy(css="#password")
    WebElement passwordInput;

    @FindBy(css="#login-button")
    WebElement loginButton;

    @FindBy(css=".login_logo")
    WebElement logo;

    public void login(String username, String password) {

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }
}
