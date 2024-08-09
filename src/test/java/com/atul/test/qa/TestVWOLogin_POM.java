package com.atul.test.qa;
import com.atul.pages.PageObjectModel.LoginPage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestVWOLogin_POM {

 @Test
 public void testloginnegativeVWO(){
  WebDriver driver = new EdgeDriver();
  LoginPage_POM Loginpagepom = new LoginPage_POM(driver);
  String error_msg_text= Loginpagepom.logintoVWOInvalidCreds("admin@gmail.com","admin");
  // Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
 // Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
  driver.quit();



 }
 @Test
 public void testloginnegativeVWO2(){
  WebDriver driver = new EdgeDriver();
  LoginPage_POM Loginpagepom = new LoginPage_POM(driver);
  String error_msg_text= Loginpagepom.logintoVWOInvalidCreds("atul.singh2189@gmail.com","admin");
  // Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
  // Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
  driver.quit();



 }
}




