package com.insiderUI.pages;

import com.utils.BrowserUtils;
import com.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.List;

public class CareerPage {

    public CareerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//section[@data-id='a8e7b90']")
    public WebElement lifeAtInsiderSection;

    ////*[.='See all teams']
    @FindBy(xpath = "//*[.='See all teams']")
    public WebElement seeAllTeam;

    //  wt-cli-accept-all-btn
    @FindBy(xpath = "//a[@id='wt-cli-accept-all-btn']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//a[.='Quality Assurance']")
    public WebElement qa;



    public void validateLifeAtInsiderSection() {

        BrowserUtils.waitForVisibility(lifeAtInsiderSection, 10);

        BrowserUtils.scrollToElement(lifeAtInsiderSection);

        BrowserUtils.verifyElementDisplayed(lifeAtInsiderSection);


    }

    public void clickSeeAllTeam(){

        BrowserUtils.waitForClickability(acceptCookies,10);
        acceptCookies.click();

        BrowserUtils.waitForClickability(seeAllTeam,10);

        BrowserUtils.clickWithJS(seeAllTeam);
    }

    public void selectQA(){

        BrowserUtils.waitForClickability(qa,10);

        BrowserUtils.clickWithJS(qa);
    }




}
