package com.luma.sw4.testsuite;

import com.luma.sw4.pages.Women;
import com.luma.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    Women women =new Women();
    @Test
    public void verifyTheSortByProductNameFilter() {
        // * Mouse Hover on Women Menu
        women.mouseHoverOnWomen();
        //* Mouse Hover on Tops
        women.mouseHoverOnTop();
        //* Click on Jackets
        women.clickOnJacket();
        //* Select Sort By filter “Product Name”
        women.selectSortByProductName();
        // * Verify the products name display in alphabetical order
        Assert.assertEquals(women.getProductList1(), women.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceFilter(){
        women.mouseHoverOnWomen();
        //* Mouse Hover on Tops
        women.mouseHoverOnTop();
        //* Click on Jackets
        women.clickOnJacket();
        // Select Sort By filter “Price”
        women.selectSortPrice();
        // Verify the products price display inLow to High
        Assert.assertEquals(women.getPriceList1(), women.getPriceList2());
    }
}


