package com.insiderUI.pages;

import com.utils.BrowserUtils;
import com.utils.ConfigReader;
import com.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='mega-menu-1']/*[.='More']")
    public WebElement more;

    @FindBy(xpath = "//*[.='Careers']")
    public WebElement careers;



    public void validateTitle() {
       // System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Assert.assertEquals(Driver.getDriver().getTitle(), "#1 Leader in Individualized, Cross-Channel CX — Insider");

    }

    public void goToCareerPageAndValidate(){

        BrowserUtils.waitForClickability(more, 10);
        more.click();

        BrowserUtils.waitForClickability(careers, 10);
        careers.click();

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(), "Insider Careers");

    }




}
