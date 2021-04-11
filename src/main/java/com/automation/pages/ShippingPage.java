package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.WebElementUtils.*;
import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;
import static com.automation.utils.WebElementUtils.waitForElementToBeClickable;

public class ShippingPage {
    public ShippingPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(xpath = "//label[@for='cgv']")
    private WebElement serviceTerms;

    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement checkBox;

    @FindBy(xpath = "//button[@class = 'button btn btn-default standard-checkout button-medium']")
    private WebElement checkOutButton;

    public void verifyServiceTermsOnshippingPage(){
        //switchToForm();
        waitForVisible(serviceTerms);
        assertPresent(serviceTerms);
        //switchToDefaultContent();
    }

    public void clickOncheckBox(){
        //switchToForm();
        //waitForVisible(checkBox);
        clickOnElement(checkBox);
        //switchToDefaultContent();
    }

    public void clickOnProceedToCheckOutbutton(){
        clickOnElement(checkOutButton);
    }


















}
