package com.step_it.steps;

import com.step_it.pages.ProductPage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductSteps {
    private ProductPage productPage;

    public void checkPageIsDisplayed() {
        productPage.waitUntilPageIsDisplayed();
    }

    public void addProductToCart(String product) {
        productPage.addProductToCart(product);
    }
}
