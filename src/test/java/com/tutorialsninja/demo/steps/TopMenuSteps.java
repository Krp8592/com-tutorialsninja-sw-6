package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I mouse hover and click on desktop menu$")
    public void iMouseHoverAndClickOnDesktopMenu() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("^I select from dropdown \"([^\"]*)\"$")
    public void iSelectFromDropdown(String menu) throws InterruptedException {
        new HomePage().selectMenu(menu);
    }

    @Then("^I verify navigation to \"([^\"]*)\" page$")
    public void iVerifyNavigationToPage(String expectedText) {
        Assert.assertEquals(expectedText, new DesktopPage().getDesktopsText());
    }

    @When("^I mouse hover and click on Laptop and notebooks menu$")
    public void iMouseHoverAndClickOnLaptopAndNotebooksMenu() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();

    }

    @When("^I mouse hover and click on components menu$")
    public void iMouseHoverAndClickOnComponentsMenu() throws InterruptedException {
        new HomePage().mouseHoverOnComponentLinkAndClick();

    }

    @Then("^I verify navigation to \"([^\"]*)\" L&N page$")
    public void iVerifyNavigationToLNPage(String expectedText) {
        Assert.assertEquals(expectedText, new LaptopsAndNotebooksPage().getLaptopsAndNotebooksText());
    }

    @Then("^I verify navigation to \"([^\"]*)\" Coms page$")
    public void iVerifyNavigationToComsPage(String expectedText) {
        Assert.assertEquals(expectedText, new ComponentsPage().getComponentsText());
    }

    @And("^I select from dropdown of L&N \"([^\"]*)\"$")
    public void iSelectFromDropdownOfLN(String menu) throws InterruptedException {
        new HomePage().selectMenu(menu);
    }

    @And("^I select from dropdown of coms \"([^\"]*)\"$")
    public void iSelectFromDropdownOfComs(String menu) throws InterruptedException {
        new HomePage().selectMenu(menu);
    }
}
