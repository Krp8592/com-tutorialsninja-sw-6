package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import com.tutorialsninja.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class DesktopSteps extends Utility {
    @When("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency) throws InterruptedException {
        new HomePage().selectCurrency(currency);
    }

    @And("^I select sort by option \"([^\"]*)\"$")
    public void iSelectSortByOption(String option) throws InterruptedException {
        new DesktopPage().selectSortByOption(option);
    }

    @Then("^I verify Products sorted in reverse alphabetical order$")
    public void iVerifyProductsSortedInReverseAlphabeticalOrder() {
        ArrayList<String> originalProductsName = new DesktopPage().getProductsNameList();
        ArrayList<String> afterSortByZToAProductsName = new DesktopPage().getProductsNameList();
        Assert.assertEquals(originalProductsName, afterSortByZToAProductsName, "Product not sorted into Z to A order");
    }

    @And("^I select product by name \"([^\"]*)\"$")
    public void iSelectProductByName(String name)  {
        new DesktopPage().selectProductByName(name);
    }

    @Then("^I verify product text \"([^\"]*)\"$")
    public void iVerifyProductText(String expText)  {
        Assert.assertEquals(new ProductPage().getProductText(), expText, "HP LP3065 Product not display");

    }

    @And("^I select delivery date \"([^\"]*)\" month \"([^\"]*)\" year \"([^\"]*)\"$")
    public void iSelectDeliveryDateMonthYear(String day, String month, String year)  {
        new ProductPage().selectDeliveryDate(day, month, year);
    }

    @And("^I enter quantity \"([^\"]*)\"$")
    public void iEnterQuantity(String qty)  {
        new ProductPage().enterQuantity(qty);
    }

    @And("^I click on continue button on product page$")
    public void iClickOnContinueButtonOnProductPage() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("^I verify success message \"([^\"]*)\"$")
    public void iVerifySuccessMessage(String expMsg)  {
        Assert.assertTrue(new ProductPage().getProductAddedSuccessMessage().contains(expMsg),
                "Product not added to cart");
    }

    @And("^I click on shopping cart link displayed in the message$")
    public void iClickOnShoppingCartLinkDisplayedInTheMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("^I verify the total cart text \"([^\"]*)\"$")
    public void iVerifyTheTotalCartText(String expText)  {
        Assert.assertEquals(new ShoppingCartPage().getTotal(), "£74.73", "Total not matched");

    }

    @Then("^I verify the product name text \"([^\"]*)\"$")
    public void iVerifyTheProductNameText(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getProductName(), "HP LP3065", "Product name not matched");

    }

    @Then("^I verify the delivery date text \"([^\"]*)\"$")
    public void iVerifyTheDeliveryDateText(String arg0)  {
        Assert.assertTrue(new ShoppingCartPage().getDeliveryDate().contains("2023-11-30"), "Delivery date not matched");
    }

    @Then("^I verify the model text \"([^\"]*)\"$")
    public void iVerifyTheModelText(String arg0)  {
        Assert.assertEquals(new ShoppingCartPage().getModel(), "Product 21", "Model not matched");
    }
}
