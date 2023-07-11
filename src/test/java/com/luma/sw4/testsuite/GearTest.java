package com.luma.sw4.testsuite;

import com.luma.sw4.pages.Gear;
import com.luma.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    Gear gear = new Gear();

    @Test

    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        gear.mouseHooverOnGearMenu();
        //Thread.sleep(1000);
        gear.clickOnBags();
        //Thread.sleep(1000);
        gear.clickOnProductNameOvernightDuffle();

        String expectedText = "Overnight Duffle";
        String actualText = gear.getTextOvernightDuffle();
        Assert.assertEquals(actualText, expectedText);

        gear.changeQuantity();
        gear.clickAddToCart();

        String expectedCartMessage = "You added Overnight Duffle to your shopping cart.";
        String actualCartMessage = gear.getTextToVerifyText();
        Assert.assertEquals(actualCartMessage, expectedCartMessage);

        gear.clickOnShoppingCart();

        String expectedOvernightDuffleMessage = "Overnight Duffle";
        String actualOvernightDuffleMessage = gear.getTextToVerifyOvernightDuffleInTheCart();
        Assert.assertEquals(actualOvernightDuffleMessage, expectedOvernightDuffleMessage);

        String expectedQuantityInTheCart = "";
        String actualQuantityInTheCart = gear.getTextToVerifyQuantityInTheCart();
        Assert.assertEquals(actualQuantityInTheCart, expectedQuantityInTheCart);


        String expectedTotalAmount = "$135.00";
        String actualTotalAmount = gear.getTextToVerifyTotalAmountInTheCart();
        Assert.assertEquals(actualTotalAmount, expectedTotalAmount);

        gear.changeTheQuantity();
        gear.clickOnUpdateShoppingCart();

        String expectedUpdatedTotalAmount = "$225.00";
        String actualUpdatedTotalAmount = gear.getTextToVerifyTotalAmountInTheCartAfterUpdatingQty();
        Assert.assertEquals(actualUpdatedTotalAmount, expectedUpdatedTotalAmount);
    }

}


