package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BrowserDriver {
    public static WebDriver driver;
    public static FirefoxOptions options;

    public BrowserDriver(){
        options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/geckodriver.exe");
        this.driver = new FirefoxDriver();
        driver.get("https://magento.softwaretestingboard.com/");
    };
    public void close(){
        this.driver.close();
    }
}
