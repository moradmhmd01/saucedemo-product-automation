package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    private WebDriver driver;

    private By addToCartBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private By shoppingCartBadge = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addBackpackToCart() {
        driver.findElement(addToCartBackpackButton).click();
    }
    public String getCartBadgeCount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCartBadge));
        return driver.findElement(shoppingCartBadge).getText();
    }
    public boolean isCartBadgeDisplayed() {
        return driver.findElements(shoppingCartBadge).size() > 0;
    }
}
