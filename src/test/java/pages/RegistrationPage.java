package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {

    public static String first_name = "firstname";

    public static String last_name = "lastname";

    public static String email_id = "email_address";

    public static String password = "password";

    public static String confirm_password = "password-confirmation";

    public static String create_button = "//div[@class=\"primary\"]/button/span";

    public static String success_message_on_signup_page = "//div[@class=\"page messages\"]//div[2]/div/div/div";

    public static String error_message_on_signup_page = "//main[@id='maincontent']/div/div[2]/div/div/div";

    public static String email_field_error = "email_address-error";

    public static String confirm_pwd_field_error = "password-confirmation-error";


    public static void enterFirstName() {
        driver.findElement(By.id(first_name)).sendKeys("Abhishek");
    }
    public static void enterLastName() {
        driver.findElement(By.id(last_name)).sendKeys("Sharma");
    }
    public static void enterEmail() {
        driver.findElement(By.id(email_id)).sendKeys("abhishek.kumar0892@gmail.com");
    }
    public static void enterPassword() {
        driver.findElement(By.id(password)).sendKeys("Testing@123");
    }
    public static void enterConfirmPassword() {
        driver.findElement(By.id(confirm_password)).sendKeys("Testing@123");
    }

    public static void clickCreateAccountButton() throws InterruptedException{
        driver.findElement(By.xpath(create_button)).click();
    }

    public static String getSuccessMessageAfterSignUp() throws InterruptedException{
        String successMessage = driver.findElement(By.xpath(success_message_on_signup_page)).getText();
        return successMessage;
    }

    public static void getErrorMessageOnSignUp() throws InterruptedException{
        String errorMessage = driver.findElement(By.xpath(error_message_on_signup_page)).getText();
    }

    public static String getEmailError() throws InterruptedException{
        String emailError = driver.findElement(By.id(email_field_error)).getText();
        return emailError;
    }
    public static String getConfirmPasswordError() throws InterruptedException{
        String confirmPasswordError = driver.findElement(By.id(confirm_pwd_field_error)).getText();
        return confirmPasswordError;
    }

}
