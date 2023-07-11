package com.luma.sw4.pages;

import com.luma.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class Gear extends Utility {
    By gearMenu = By.xpath("//a[@id='ui-id-6']");
    By bags = By.xpath("//span[contains(text(),'Bags')]");
    By productDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By overnightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By qty = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By verifyText = By.xpath("//div[@class='message-success success message']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyProductInTheCart = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By qtyInTheCart = By.xpath("(//input[@class='input-text qty'])[1]");
    By TotalAmount = By.xpath("//span[@data-bind='text: getValue()'][normalize-space()='$135.00']");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");





    public void mouseHooverOnGearMenu() {
        mouseHoverToElement(gearMenu);

    }
    public void clickOnBags() {
        mouseHoverToElement(bags);
        //mouseHoverToElementAndClick(bags);
        clickOnElement(bags);
    }

    public void clickOnProductNameOvernightDuffle() {
        clickOnElement(productDuffle);

    }
    public String getTextOvernightDuffle() {
        return getTextFromElement(overnightDuffle);
    }

    public void changeQuantity() {
        driver.findElement(qty).clear();

        sendTextToElement(qty, "3");
    }

    public void clickAddToCart() {
        clickOnElement(addToCart);
    }

    public String getTextToVerifyText() {
        return getTextFromElement(verifyText);

    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String getTextToVerifyOvernightDuffleInTheCart() {
        return getTextFromElement(verifyProductInTheCart);
    }

    public String getTextToVerifyQuantityInTheCart() {
        return getTextFromElement(qtyInTheCart);
    }

    public String getTextToVerifyTotalAmountInTheCart() {
        return getTextFromElement(TotalAmount);
    }

    //Change Qty to ‘5’

    public void changeTheQuantity(){
        driver.findElement(qtyInTheCart).clear();
        sendTextToElement(qtyInTheCart,"5");
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);

    }

    // * Verify the product price ‘$225.00

    public String getTextToVerifyTotalAmountInTheCartAfterUpdatingQty() {
        return getTextFromElement(TotalAmount);
    }
}



