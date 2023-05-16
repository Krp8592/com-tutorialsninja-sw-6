package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());

    public AccountLoginPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    public String getReturningCustomerText() {
        log.info("Get returning customer text : " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);

    }

    public String getNewCustomerText() {
        log.info("Get returning customer text : " + returningCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        log.info("Enter email : " + emailAddressField.toString());
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password : " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Click on login button : " + loginBtn.toString());
        clickOnElement(loginBtn);
    }
}
