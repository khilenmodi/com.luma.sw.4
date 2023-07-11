package com.luma.sw4.pages;

import com.luma.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class Men extends Utility {
    By men =By.xpath("//span[contains(text(),'Men')]");
    By bottom =By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants =By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By CronusYogaPant =By.xpath("//img[@alt='Cronus Yoga Pant ']");
    By size32 = By.cssSelector("#option-label-size-143-item-175");
    By colourBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By AddToCart =By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    By message = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By ShoppingCartLink =By.xpath("//a[contains(text(),'shopping cart')]");
    By ShoppingCartMessage =By.xpath("//span[@class='base']");
    By ProductMessage =By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By SizeMessage = By.xpath("//dd[contains(text(),'32')]");
    By ColourMessage =By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHoverOnElementMen(){
        mouseHoverToElement(men);
    }

    public void mouseHoverOnElementBottom(){
        mouseHoverToElement(bottom);
    }
    public void clickOnElementPants(){
        clickOnElement(pants);
    }
    public void mouseHoverOnElementCronusYogaPant(){
        mouseHoverToElement(CronusYogaPant);
    }
    public void mouseHooverOnCronusYogaPantAndClickOnSize32() {
        mouseHoverToElement(CronusYogaPant);
        clickOnElement(size32);
    }
    public void mouseHooverOnCronusYogaPantAndClickColourBlack(){
        clickOnElement(colourBlack);
    }
    public void mouseHooverOnCronusYogaPantAndClickAddToCart(){
        clickOnElement(AddToCart);
    }
    public String getTextCronusYogaPantToYourShoppingCart() {
        return getTextFromElement(message);

    }
    public void clickOnShoppingCartLink(){
        clickOnElement(ShoppingCartLink);

    }
    public String getTextShoppingCartMessage() {
        return getTextFromElement(ShoppingCartMessage);

    }
    public String getTextProductName() {
        return getTextFromElement(ProductMessage);

    }
    public String getTextSizeMessage() {
        return getTextFromElement(SizeMessage);

    }
    public String getTextColorMessage() {
        return getTextFromElement(ColourMessage);

    }

}
