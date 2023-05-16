package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    public ComponentsPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2")
    WebElement componentsText;

    public String getComponentsText() {
        log.info("Get component Text  " + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}
