package com.luma.sw4.testsuite;

import com.luma.sw4.pages.Men;
import com.luma.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    Men men = new Men();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // * Mouse Hover on Men Menu
        Thread.sleep(2000);
        men.mouseHoverOnElementMen();
        // * Mouse Hover on Bottoms
        men.mouseHoverOnElementBottom();
        // * Click on Pants
        men.clickOnElementPants();

        //‘Cronus Yoga Pant’ and click on size32.
        men.mouseHoverOnElementCronusYogaPant();
        men.mouseHooverOnCronusYogaPantAndClickOnSize32();

        //* Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on colour
        Thread.sleep(2000);
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.
        men.mouseHooverOnCronusYogaPantAndClickColourBlack();

        // * Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        Thread.sleep(2000);
        men.mouseHooverOnCronusYogaPantAndClickAddToCart();
        // * Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = men.getTextCronusYogaPantToYourShoppingCart();
        Assert.assertEquals(actualMessage, expectedMessage);

        //* Click on ‘shopping cart’ Link into message
        men.clickOnShoppingCartLink();
        //* Verify the text ‘Shopping Cart.’
        String expectedShoppingCartMessage = "Shopping Cart";
        String actualShoppingCartMessage = men.getTextShoppingCartMessage();
        Assert.assertEquals(actualShoppingCartMessage, expectedShoppingCartMessage);
        //* Verify the product name ‘Cronus Yoga Pant’
        String expectedProductMessage = "Cronus Yoga Pant";
        String actualProductMessage = men.getTextProductName();
        Assert.assertEquals(actualProductMessage, expectedProductMessage);


        //* Verify the product size ‘32’
        String expectedSizeMessage = "32";
        String actualSizeMessage = men.getTextSizeMessage();
        Assert.assertEquals(actualSizeMessage, expectedSizeMessage);

        //* Verify the product colour ‘Black’
        String expectedColourMessage = "Black";
        String actualColourMessage = men.getTextColorMessage();
        Assert.assertEquals(actualColourMessage, expectedColourMessage);

    }


}
