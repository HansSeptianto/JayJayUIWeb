package com.hans.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By menuButton = By.id("react-burger-menu-btn");
    By aboutMenuButton = By.id("about_sidebar_link");
    By pageSubtitle = By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[1]/div/div[3]/p");
    By logoutButton = By.id("logout_sidebar_link");
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void clickMenuButton() {
        driver.findElement(menuButton).click();
    }

    public void clickAboutMenuButton() {
        driver.findElement(aboutMenuButton).click();
    }

    public void validateOnAboutPage() {
        assertEquals("https://saucelabs.com/", driver.getCurrentUrl());
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public void clickTheAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }
}
