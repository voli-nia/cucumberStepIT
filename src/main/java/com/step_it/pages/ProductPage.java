package com.step_it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(css = ".inventory_item_description")
    private List<WebElement>productNames;

    private By addRemoveBtn = By.tagName("button");
    private By productDescription = By.cssSelector(".inventory_item_name");


    public void waitUntilPageIsDisplayed() {
        getPageLoader().isListVisible(productNames, 10);
    }

    public void addProductToCart(String productName) {
        getProduct(productName).findElement(addRemoveBtn).click();
    }

    private WebElement getProduct(String productName) {
        for (WebElement product :productNames) {
            WebElement description = product.findElement(productDescription);
            if (productName.equalsIgnoreCase(description.getText())) {
                return product;
            }
        }
        throw new NoSuchElementException("Couldn't find the element" + productName);
    }
}
