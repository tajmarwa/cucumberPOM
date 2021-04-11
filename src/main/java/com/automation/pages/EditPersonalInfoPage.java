package com.automation.pages;

import com.automation.data.UserDataBean;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.CommonUtils.sendKeysTo;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class EditPersonalInfoPage {
    public EditPersonalInfoPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='navigation_page' and contains(text(),'Your personal information')]")
    private WebElement editProfilePage;

    @FindBy(id = "firstname")
    private WebElement enterUserName;

    @FindBy(id = "old_passwd")
    private WebElement oldPasswd;

    @FindBy(name = "submitIdentity")
    private WebElement submitIdentity;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement successMsg;

    public void verifyUserIsOnEditProfile() {
        waitForVisible(editProfilePage);
        assertPresent(editProfilePage);
    }

    public void updateUserName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String text = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        sendKeysTo(enterUserName, text);
    }

    public void enterPassword(String password) {
        sendKeysTo(oldPasswd, password);
    }

    public void submitProfile() {
        clickOnElement(submitIdentity);
    }

    public void verifySuccessMsg() {
        waitForVisible(successMsg);
        assertPresent(successMsg);
    }

}
