package utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    public static BrowserDriver driver;
    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
