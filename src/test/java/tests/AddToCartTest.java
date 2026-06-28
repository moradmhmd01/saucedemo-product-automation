package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest{

    @Test
    public void verifyProductCanBeAddedToCart() {
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assertions.assertFalse(inventoryPage.isCartBadgeDisplayed(),"FINDING: Cart badge should not be visible before an item is added.");
        inventoryPage.addBackpackToCart();

        String actualBadgeCount = inventoryPage.getCartBadgeCount();
        String expectedBadgeCount = "1";

        Assertions.assertEquals(expectedBadgeCount, actualBadgeCount, "OUTCOME FAILURE: The shopping cart badge did not update correctly after adding an item.");

        System.out.println("Test Outcome: Success!");
        System.out.println("Findings: Verified that logging in with 'standard_user' and clicking 'Add to Cart' successfully increments the header cart badge count to 1.");
    }
}
