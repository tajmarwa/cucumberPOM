package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class ShippingPage {
    public ShippingPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "iframe")
    private WebElement serviceTerms;

    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement checkBox;

    @FindBy(name = "processCarrier")
    private WebElement checkOutButton;

    public void verifyServiceTermsOnshippingPage(){
        waitForVisible(serviceTerms);
        assertPresent(serviceTerms);
    }

    public void clickOncheckBox(){
        clickOnElement(checkBox);
    }

    public void clickOnProceedToCheckOutbutton(){
        clickOnElement(checkOutButton);
    }


















}
