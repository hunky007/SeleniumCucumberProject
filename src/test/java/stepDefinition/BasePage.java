package stepDefinition;

import cucumber.api.java.en.Given;

import static pages.HomePage.*;

public class BasePage {

    @Given("I am on Home page")
    public void i_am_on_Home_page() throws InterruptedException {
        goToCreateAccountPage();
    }

}
