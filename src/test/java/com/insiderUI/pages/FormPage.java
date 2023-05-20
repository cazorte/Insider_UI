package com.insiderUI.pages;

import com.utils.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FormPage {

    public FormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void validateTitle(){

        System.out.println("Actual Title is = " + Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(), "Insider Open Positions | Insider");

    }


}
