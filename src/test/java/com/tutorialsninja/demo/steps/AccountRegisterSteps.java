package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountRegisterPage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import com.tutorialsninja.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class AccountRegisterSteps extends Utility{
    @Then("^I verify \"([^\"]*)\" text successfully$")
    public void iVerifyTextSuccessfully(String arg0) {
        new AccountRegisterPage().getRegisterAccountText();
    }

    @And("^I enter first name$")
    public void iEnterFirstName() {
        new AccountRegisterPage().enterFirstName("Prime" + getAlphaNumericString(4));
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        new AccountRegisterPage().enterLastName("Testing" + getAlphaNumericString(4));
    }

    @And("^I enter new email address$")
    public void iEnterNewEmailAddress() {
        new AccountRegisterPage().enterEmail("prime" + getAlphaNumericString(4) + "@gmail.com");
    }

    @And("^I enter telephone number \"([^\"]*)\"$")
    public void iEnterTelephoneNumber(String number) {
        new AccountRegisterPage().enterTelephone(number);
    }

    @And("^I enter password on register page \"([^\"]*)\"$")
    public void iEnterPasswordOnRegisterPage(String password) {
        new AccountRegisterPage().enterPassword(password);
    }

    @And("^I enter confirm password on register page \"([^\"]*)\"$")
    public void iEnterConfirmPasswordOnRegisterPage(String confirmPassword) {
        new AccountRegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("^I select subscription \"([^\"]*)\"$")
    public void iSelectSubscription(String option) throws InterruptedException {
        new AccountRegisterPage().selectSubscription(option);
    }

    @And("^I click on privacy check box$")
    public void iClickOnPrivacyCheckBox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @Then("^I verify account created message \"([^\"]*)\"$")
    public void iVerifyAccountCreatedMessage(String expMsg) {
        Assert.assertEquals(expMsg, new MyAccountPage().getYourAccountHasBeenCreatedText());
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() throws InterruptedException {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @Then("^I verify account logout text \"([^\"]*)\"$")
    public void iVerifyAccountLogoutText(String expMsg) {
        Assert.assertEquals(expMsg, new MyAccountPage().getAccountLogoutText());
    }

    @And("^I click on continue button after$")
    public void iClickOnContinueButtonAfter() throws InterruptedException {
        new MyAccountPage().clickOnContinueButton();
    }
}
