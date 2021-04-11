package com.automation.steps;

import com.automation.pages.EditPersonalInfoPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditPersonalInfoSteps {
    EditPersonalInfoPage editperinfopage = new EditPersonalInfoPage();

    @Then("^Verify user on edit profile screen$")
    public void verify_user_on_login_page() throws InterruptedException {
        editperinfopage.verifyUserIsOnEditProfile();
    }

    @When("^User change the username then provide \"([^\"]*)\" and continue$")
    public void user_modify_profile_info(String password){
        editperinfopage.updateUserName();
        editperinfopage.enterPassword(password);
        editperinfopage.submitProfile();
    }

    @Then("^Verify success message$")
    public void verifySuccessMessage(){
        editperinfopage.verifySuccessMsg();
    }

}
