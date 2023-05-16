package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement accountCreatedText;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public String getAccountLogoutText() {
        log.info("get Account Logout Text  " + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }

    public String getYourAccountHasBeenCreatedText() {
        log.info("get Your Account Has Been Created Text  " + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }

    public void clickOnContinueButton() throws InterruptedException {
        log.info("Click on continue button " + continueBtn.toString());
        Thread.sleep(1000);
        clickOnElement(continueBtn);
    }
}
