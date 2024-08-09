package com.atul.test.qa;
import base.CommonToAllTest;

import com.atul.pages.Page_Factory.Loginpage_PF;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.atul.driver.DriverManager.driver;

public class TestVWOLogin_PF_Driver_Manager extends CommonToAllTest {

 private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_Driver_Manager.class);

 @Test
 public void testloginnegativeVWO() throws IOException {

  logger.info("starting the test");

  Loginpage_PF Loginpage_pf = new Loginpage_PF(driver);
  logger.info("opening the url");
  Loginpage_pf.openVwoLoginUrl("com/atul/test/qa");
  String error_msg= Loginpage_pf.loginToVWOInvalidCreds();
  logger.info("verifying the result");
  Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
  driver.quit();



 }



}






