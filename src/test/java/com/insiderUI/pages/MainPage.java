package com.insiderUI.pages;

import com.utils.ConfigReader;
import com.utils.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void validateTitle() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        Assert.assertEquals(Driver.getDriver().getTitle(), "#1 Leader in Individualized, Cross-Channel CX — Insider");

    }




}
