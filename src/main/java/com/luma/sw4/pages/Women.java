package com.luma.sw4.pages;

import com.luma.sw4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Women extends Utility {
    By Women =By.xpath("//a[@id='ui-id-4']");
    By Top =By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]");
    By Jacket = By.xpath("//a[@id='ui-id-11']");
    By sortBy = By.xpath("//div[2]//div[3]//select[1]");
    By Price =By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By productFilter = By.xpath("//div[2]//div[3]//select[1]");
    By nameList1 = By.xpath("//strong[@class = 'product name product-item-name']");
    By nameList2 = By.xpath("//strong[@class = 'product name product-item-name']");
    By priceList1 = By.xpath("//span[@class='price-container price-final_price tax weee']");
    By priceList2 = By.xpath("//span[@class='price-container price-final_price tax weee']");
    public void mouseHoverOnWomen(){
        mouseHoverToElement(Women);
    }
    public void mouseHoverOnTop(){
        mouseHoverToElement(Top);
    }
    public void clickOnJacket(){
        clickOnElement(Jacket);
    }
    // Select Sort By filter “Product Name” alphabetical order
    public void selectSortByProductName(){
        selectByValueFromDropDown(sortBy,"name");
    }
    public void selectSortPrice(){
        selectByValueFromDropDown(Price,"price");
    }
    public ArrayList<String> getProductList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(nameList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public void selectProductNameFilter(String filterName) {
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> getProductList2() {
        List<WebElement> afterFilterProductList = driver.findElements(nameList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

        return afterFilterProductList1;
    }


    public ArrayList<String> getPriceList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(priceList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getPriceList2() {
        List<WebElement> afterFilterProductList = driver.findElements(priceList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        return afterFilterProductList1;
    }

}

