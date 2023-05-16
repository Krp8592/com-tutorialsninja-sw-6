package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    public DesktopPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement desktopsText;

    By productsList = By.xpath("//h4/a");

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;


    public String getDesktopsText() {
        log.info("get Desktops Text  " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public ArrayList<String> getProductsNameList() {
        log.info("get Products Name List ");
        List<WebElement> products = getListOfElements(productsList);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    public void selectProductByName(String product) {
        List<WebElement> products = getListOfElements(productsList);
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }

    public void selectSortByOption(String option) throws InterruptedException {
        log.info("select Sort By Option  " + sortBy.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(sortBy, option);
    }
}
