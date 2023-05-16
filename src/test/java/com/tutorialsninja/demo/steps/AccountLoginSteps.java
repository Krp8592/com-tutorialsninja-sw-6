package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountLoginPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AccountLoginSteps {
    @When("^I click on my account tab$")
    public void iClickOnMyAccountTab() throws InterruptedException {
        new HomePage().clickOnMyQAccountTab();
    }

    @And("^I select my account option from the dropdown \"([^\"]*)\"$")
    public void iSelectMyAccountOptionFromTheDropdown(String options)  {
       new HomePage().selectMyAccountOptions(options);
    }

    @Then("^I verify text on login page \"([^\"]*)\"$")
    public void iVerifyTextOnLoginPage(String expectedText)  {
        Assert.assertEquals(expectedText, new AccountLoginPage().getReturningCustomerText());
    }

    @When("^click on my account tab$")
    public void clickOnMyAccountTab() throws InterruptedException {
        new HomePage().clickOnMyQAccountTab();
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email)  {
       new AccountLoginPage().enterEmailAddress(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
       new AccountLoginPage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new AccountLoginPage().clickOnLoginButton();
    }

    @And("^I select my account option \"([^\"]*)\"$")
    public void iSelectMyAccountOption(String logOut) throws InterruptedException {
       new HomePage().selectMyAccountOptions(logOut);
    }

    @Then("^I verify \"([^\"]*)\" text message$")
    public void iVerifyTextMessage(String expectedText)  {
       Assert.assertEquals(expectedText, new MyAccountPage().getAccountLogoutText());
    }
}
