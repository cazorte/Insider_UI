package com.insiderUI.pages;

import com.utils.BrowserUtils;
import com.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Career_QA {

    public Career_QA() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

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
