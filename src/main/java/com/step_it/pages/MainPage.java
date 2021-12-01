package com.step_it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(css = ".header_secondary_container .title")
    private WebElement pageTitle;

    @FindBy(css = ".shopping_cart_badge")
    private List<WebElement> cartCount;


    public boolean isTitleDisplayed() {
        return pageTitle.isDisplayed();
    }

    public int getProductCountInCart() {
        if (cartCount.isEmpty())
            return 0;
        return Integer.parseInt(cartCount.get(0).getText());
    }
}
