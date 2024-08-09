package com.atul.Base;

import com.atul.driver.DriverManager;
import com.atul.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static com.atul.driver.DriverManager.getDriver;

public class CommonToAllPages {

    // if you want to call something before every page object class call, put your code here
    // open file, open database connection you can write down

    public CommonToAllPages() {
    }

    public void openVwoLoginUrl(String url){

        // driver.get
        try {
            switch (url) {
                case "qa":
                    getDriver().get(PropertyReader.readkey("qa_url"));
                    break;
                case "preprod":
                    getDriver().get(PropertyReader.readkey("uat_url"));
                    break;
                default:
                    getDriver().get(PropertyReader.readkey("url"));
                    break;


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public  void clickElement(WebElement by){
        by.click();

    }
    public  void clickElement(By by){
        getDriver().findElement(by).click();
    }

    public void enterInput(By by , String key){
        getDriver().findElement(by).sendKeys(key);
    }
    public void enterInput(WebElement element, String key){
        element.sendKeys(key);
    }

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By key) {
        return getDriver().findElement(key);
    }

    public WebElement getElement(WebElement element) {
        return element;
    }

    // waits


}
