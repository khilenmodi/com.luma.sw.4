package com.luma.sw4.testbase;


import com.luma.sw4.propertyreader.PropertyReader;
import com.luma.sw4.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

        String browser = PropertyReader.getInstance().getProperty("browser");

        @BeforeMethod
    public void setUp(){
            selectBrowser(browser);
        }

        @AfterMethod
    public void tearDown(){
            closeBrowser();
        }

}
