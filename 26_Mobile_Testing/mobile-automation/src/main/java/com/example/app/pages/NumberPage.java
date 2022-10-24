package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class NumberPage extends BasePageObject {

    private By calculatorHeader = MobileBy.AccessibilityId("Calculator");
    private By numberOne = MobileBy.AccessibilityId("1");
    private By numberDisplayed = By.xpath("(//android.view.View[@content-desc=\"1\"])[1]");

    public void calculatorHeaderDisplayed(){
        //AndroidElement headerElm = driver.findElement(calculatorHeader);
        //headerElm.isDisplayed();
        isDisplayed(calculatorHeader);
    }

    public void clickNumberOne(){
        //AndroidElement numberElm = driver.findElement(numberOne);
        //numberElm.click();
        click(numberOne);
    }
    public void numDisplayed(){
        //AndroidElement numDisplayedElm = driver.findElement(numberDisplayed);
        //numDisplayedElm.isDisplayed();
        isDisplayed(numberDisplayed);
    }
}
