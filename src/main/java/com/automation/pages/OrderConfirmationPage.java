package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static com.automation.utils.AssertionUtils.assertEquals;
import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class OrderConfirmationPage {
    String actualOrderNumber = "";
    public OrderConfirmationPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='box']")
    private WebElement orderRefNumber;

    @FindBy(xpath = "//h1[text()='Order history']")
    private WebElement orderPage;

    @FindBy(xpath = "//table[@id='order-list']//tr[@class='first_item ']//td[1]//a")
    private WebElement orderPlaced;

    public void getOrderReferenceNumber() {
        waitForVisible(orderRefNumber);
        assertPresent(orderRefNumber);
        actualOrderNumber = orderRefNumber.getText();
    }

    public void verifyOrderPage() {
        waitForVisible(orderPage);
        assertPresent(orderPage);
    }

    public void verifyOrderPlaced() {
        waitForVisible(orderPlaced);
        assertPresent(orderPlaced);
        String expectedOrderNumber = orderPlaced.getText();
        Assert.assertTrue(actualOrderNumber.contains(expectedOrderNumber));
    }
}
