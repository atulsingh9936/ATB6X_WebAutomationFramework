package com.atul.test.qa;
import com.atul.pages.Page_Factory.Loginpage_PF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestVWOLogin_PF {

 @Test
 public void testloginnegativeVWO() throws IOException {
  WebDriver driver = new EdgeDriver();
  driver.get("https://app.vwo.com");
  Loginpage_PF Loginpage_pf = new Loginpage_PF(driver);
 String error_msg= Loginpage_pf.loginToVWOInvalidCreds();
  Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
  driver.quit();



 }



}






