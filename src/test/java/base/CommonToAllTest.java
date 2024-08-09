package base;

import com.atul.driver.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {
    //  To call the start the webdriver
    // down the driver
    // start webdriver start

    @BeforeTest
    public void setup(){
        DriverManager.init();
    }
    @AfterTest
    public void teardown(){
        DriverManager.down();
    }
}
