package com.nopcommerce.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class RegisterSteps {
    @When("^I click on Register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals("Register page not displayed",  "Register",
                new RegisterPage().getRegisterText());
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^Verify the firstName error message$")
    public void verifyTheFirstNameErrorMessage() {
        Assert.assertEquals("First name is required.","First name is required.",
                new RegisterPage().getValidationErrorMessageForField("FirstName"));
    }

    @And("^Verify the lastName error message$")
    public void verifyTheLastNameErrorMessage() {
        Assert.assertEquals("Last name is required.","Last name is required.",
                new RegisterPage().getValidationErrorMessageForField("LastName") );

    }

    @And("^Verify the email error message$")
    public void verifyTheEmailErrorMessage() {
        Assert.assertEquals("Email is required.","Email is required.",
                new RegisterPage().getValidationErrorMessageForField("Email"));
    }

    @And("^Verify the password error message$")
    public void verifyThePasswordErrorMessage() {
        Assert.assertEquals("Password is required.","Password is required.",
                new RegisterPage().getValidationErrorMessageForField("Password"));
    }

    @And("^Verify the confirmPassword error message$")
    public void verifyTheConfirmPasswordErrorMessage() {
        Assert.assertEquals("Password is required.","ConfirmPassword is required.",
                new RegisterPage().getValidationErrorMessageForField("ConfirmPassword"));
    }

    @And("^I click on female radio button$")
    public void iClickOnFemaleRadioButton() {
        new RegisterPage().selectGender("Female");
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);

    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastName)  {
        new RegisterPage().enterLastName(lastName);
    }

    @And("^I select date of birth \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day, String month, String year)  {
        new RegisterPage().selectDateOfBirth(day,month,year);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new RegisterPage().enterPassword(password);

    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confPassword)  {
        new RegisterPage().enterConfirmPassword(confPassword);

    }

    @Then("^I should see message Your registration completed$")
    public void iShouldSeeMessageYourRegistrationCompleted() {
        Assert.assertEquals("Registration not successful","Your registration completed",
                new RegisterPage().getYourRegCompletedText());
    }

}
