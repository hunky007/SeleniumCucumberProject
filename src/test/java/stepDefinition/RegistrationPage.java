package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.*;

public class RegistrationPage {

    @Given("I have entered valid firstname lastname email password and confirmpassword")
    public void i_have_entered_valid_firstname_lastname_email_password_and_confirmpassword() throws InterruptedException {
        enterFirstName();
        enterLastName();
        enterEmail();
        enterPassword();
        enterConfirmPassword();
    }
    @When("I click on create account button")
    public void i_click_on_create_account_button() throws InterruptedException {
        clickCreateAccountButton();
    }
    @Then("Account should get created")
    public void account_should_get_created() throws InterruptedException {
        String registrationSuccessMsg = getSuccessMessageAfterSignUp();
        assertEquals(registrationSuccessMsg, "Thank you for registering with Main Website Store.");
    }

}