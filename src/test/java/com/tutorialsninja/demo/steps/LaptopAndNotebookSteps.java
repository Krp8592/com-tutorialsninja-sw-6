package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class LaptopAndNotebookSteps {
    @And("^I select sort by on option for \"([^\"]*)\"$")
    public void iSelectSortByOnOptionFor(String option)  {
        new LaptopsAndNotebooksPage().selectSortByOption(option);
    }

    @Then("^I verify Products displayed according to price low to high$")
    public void iVerifyProductsDisplayedAccordingToPriceLowToHigh() {
        List<Double> originalProductsPrice = new LaptopsAndNotebooksPage().getProductsPriceList();
        ArrayList<Double> afterSortByPrice = new LaptopsAndNotebooksPage().getProductsPriceList();
        Assert.assertEquals(originalProductsPrice, afterSortByPrice);
    }

    @Then("^I verify text on product page$")
    public void iVerifyTextOnProductPage() {
        Assert.assertEquals(new ProductPage().getProductText(), "MacBook", "MacBook Product not display");
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^I click on link in message$")
    public void iClickOnLinkInMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("^I verify text on new page \"([^\"]*)\"$")
    public void iVerifyTextOnNewPage(String expText)  {
        Assert.assertTrue(new ShoppingCartPage().getShoppingCartText().contains(expText));
    }

    @Then("^I verify product name on new page \"([^\"]*)\"$")
    public void iVerifyProductNameOnNewPage(String expText)  {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), expText, "Product name not matched");
    }

    @And("^I change the quantity \"([^\"]*)\"$")
    public void iChangeTheQuantity(String qty)  {
        new ShoppingCartPage().changeQuantity(qty);
    }

    @And("^I click on quantity update button$")
    public void iClickOnQuantityUpdateButton() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @Then("^I verify modified success message \"([^\"]*)\"$")
    public void iVerifyModifiedSuccessMessage(String expMsg)  {
        Assert.assertTrue(new ShoppingCartPage().getSuccessModifiedMessage().contains(expMsg));
    }

    @Then("^I verify cart total \"([^\"]*)\"$")
    public void iVerifyCartTotal(String extTotal)  {
        Assert.assertEquals(new ShoppingCartPage().getTotal(), extTotal, "Total not matched");

    }

    @And("^I mouse hover and click on Laptop and notebooks menu menu$")
    public void iMouseHoverAndClickOnLaptopAndNotebooksMenuMenu() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }
}
