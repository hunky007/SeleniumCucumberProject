package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {


    public static String create_account_link = "Create an Account";

    public static void goToCreateAccountPage() throws InterruptedException{
        driver.findElement(By.linkText(create_account_link)).click();
    }

}