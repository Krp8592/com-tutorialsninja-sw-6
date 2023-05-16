package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountRegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    public AccountRegisterPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement LastNameField;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passwordConfirmField;
    //
    By subscribeRadios = By.xpath("//fieldset[3]//input");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;

    By loginBtn = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public String getRegisterAccountText() {
        log.info("Get Register Account Text " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String fName) {
        log.info("Enter First name " + firstNameField.toString());
        sendTextToElement(firstNameField, fName);
    }

    public void enterLastName(String lName) {
        log.info("Enter last name " + LastNameField.toString());
        sendTextToElement(LastNameField, lName);
    }

    public void enterEmail(String email) {
        log.info("Enter Email  " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String telephone) {
        log.info("Enter telephone  " + telephoneField.toString());
        sendTextToElement(telephoneField, telephone);
    }

    public void enterPassword(String password) {
        log.info("Enter password  " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String cPassword) {
        log.info("Enter Confirm password  " + passwordField.toString());
        sendTextToElement(passwordConfirmField, cPassword);
    }

    public void selectSubscription(String option) throws InterruptedException {
        log.info("select Subscription  " + subscribeRadios.toString());
        Thread.sleep(1000);
        List<WebElement> radioButtons = getListOfElements(subscribeRadios);
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnPrivacyPolicyCheckBox() {
        log.info("click On Privacy Policy CheckBox  " + subscribeRadios.toString());
        clickOnElement(privacyPolicyCheckBox);
    }

    public void clickOnContinueButton() {
        log.info("click On Continue Button  " + continueBtn.toString());
        clickOnElement(continueBtn);
    }

}
