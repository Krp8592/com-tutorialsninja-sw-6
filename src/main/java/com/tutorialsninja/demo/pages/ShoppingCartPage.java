package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    public ShoppingCartPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;

    public String getShoppingCartText() {
        log.info("get Shopping Cart Text  " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        log.info("get ProductName Text  " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getDeliveryDate() {
        log.info("get Delivery Date  " + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public String getModel() {
        log.info("get Model " + model.toString());
        return getTextFromElement(model);
    }

    public String getTotal() {
        log.info("get Total " + total.toString());
        return getTextFromElement(total);
    }

    public void changeQuantity(String qty) {
        log.info("Change Quantity " + qtyField.toString());
        sendTextToElement(qtyField, qty);
    }

    public void clickOnQtyUpdateButton() {
        log.info("click On Qty Update Button " + qtyUpdateBtn.toString());
        clickOnElement(qtyUpdateBtn);
    }

    public String getSuccessModifiedMessage() {
        log.info("get Success Modified Message " + successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }
}
