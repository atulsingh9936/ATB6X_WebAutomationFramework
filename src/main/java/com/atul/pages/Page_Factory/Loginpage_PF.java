package com.atul.pages.Page_Factory;

import com.atul.Base.CommonToAllPages;
import com.atul.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Loginpage_PF extends CommonToAllPages {


    WebDriver driver;
    public Loginpage_PF (WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    // page locators

    @FindBy(id="login-username")
    private WebElement username;

    @FindBy(id="login-password")
    private  WebElement Password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;

    //page actions
    public String loginToVWOInvalidCreds() throws IOException {
        enterInput(username, PropertyReader.readkey("invalid_username"));
        enterInput(Password,PropertyReader.readkey("invalid_password"));
        clickElement(signButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    return error_message.getText();
    }
}
