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

    @FindBy(xpath = "//a[.='See all QA jobs']")
    public WebElement seeAllQA;

    @FindBy(xpath = "//select[@name='filter-by-location']")
    public WebElement filterLocation;

    @FindBy(xpath = "//span[@title='Istanbul, Turkey']")
    public WebElement istanbul;

    // list of position  //div[@id='jobs-list']//p[@class='position-title font-weight-bold']
    @FindBy(xpath = "//div[@id='jobs-list']//p[@class='position-title font-weight-bold']")
    public List<WebElement> positionsList;

    // list of department //div[@id='jobs-list']//span[.='Quality Assurance']
    @FindBy(xpath = "//div[@id='jobs-list']//span[.='Quality Assurance']")
    public List<WebElement> departmentsList;

    @FindBy(xpath = "//div[@id='jobs-list']//div[@class='position-location text-large']")
    public List<WebElement> locationsList;

    @FindBy(xpath = "//a[.='Apply Now']")
    public List<WebElement> applyNow;

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

    public void selectSeeAllQA(){
        BrowserUtils.waitForClickability(seeAllQA,10);

        BrowserUtils.clickWithJS(seeAllQA);

    }

    public void selectLocationFilter(){
        BrowserUtils.waitForClickability(filterLocation,10);

        Select select = new Select(filterLocation);

        select.selectByVisibleText("Istanbul, Turkey");

    }

    public void validateIstanbulOption(){

        BrowserUtils.verifyElementDisplayed(istanbul);
    }

    public void validatePositions(){

        BrowserUtils.waitFor(3);
        BrowserUtils.scrollToElement(positionsList.get(0));

        BrowserUtils.isListContain(positionsList,"Quality Assurance");
    }

    public void validateDepartment(){

        BrowserUtils.isListContain(departmentsList,"Quality Assurance");

    }

    public void validateLocations(){

        BrowserUtils.isListContain(locationsList, "Istanbul, Turkey");
    }

    public void validateApplyNowButton(){

        BrowserUtils.isListContain(applyNow, "Apply Now");

        applyNow.forEach(ele -> BrowserUtils.hover(ele));

    }

    public void clickFirstJob(){

        BrowserUtils.hover(applyNow.get(0));

        applyNow.get(0).click();
    }


}
