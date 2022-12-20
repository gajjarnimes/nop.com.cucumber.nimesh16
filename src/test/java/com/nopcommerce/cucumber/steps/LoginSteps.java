package com.nopcommerce.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I am unable to login with invalid credentials$")
    public void iAmUnableToLoginWithInvalidCredentials() {

    }

    @Then("^I should login successfully with valid credentials$")
    public void iShouldLoginSuccessfullyWithValidCredentials() {
        Assert.assertTrue("Logout link is not displayed",new HomePage().isLogOutLinkDisplay());
    }

    @And("^I click on logout link$")
    public void iClickOnLogoutLink() {

    }

    @Then("^I should logOut successFully and i should see login link$")
    public void iShouldLogOutSuccessFullyAndIShouldSeeLoginLink() {

    }

}
