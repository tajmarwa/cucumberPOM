package com.automation.steps;

import com.automation.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homepage = new HomePage();


    @Given("^User is on Homepage of the application$")
    public void userIsOnHomepage() {
        homepage.verifyUserOnHomepage();
    }

    @When("^User search for \"([^\"]*)\" from the home page$")
    public void userSearchHomepage(String text) {
        homepage.searchItem(text);
    }

    @When("^User navigates to login page$")
    public void verifyUserIsonLoginPage() {
        homepage.navigateToLoginPage();
    }

    @Then("^Verify successful login$")
    public void verifySuccessfulUserlogin() {
        homepage.verifyUserNameAfterLogin();
    }

    @Then("^Verify registered user on homepage$")
    public void verifyRegisteredUserOnHomepage() {
        homepage.verifyUserAfterRegistration();
    }

    @When("^User selects \"([^\"]*)\" from homepage$")
    public void user_selects_from_homepage(String itemName) {
        homepage.selectItemFromHOmePage(itemName);
    }

    @When("^User is on search result page$")
    public void userSearchResult() {
        homepage.verifySearchResult();
    }

    @When("^User click on My personal information$")
    public void user_clicks_my_personal_info() {
        homepage.clicksMyPersonalInfo();
    }

    @Then("^User go to order history page from homepage$")
    public void verifyOrderConfirmationDetails() {
        homepage.clickOnHeader();
    }

}
