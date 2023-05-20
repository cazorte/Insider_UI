package com.insiderUI;


import com.insiderUI.pages.MainPage;
import com.utils.TestBase;
import org.testng.annotations.Test;

public class uiTest extends TestBase {

    MainPage mainPage = new MainPage();


    @Test
    public void e2eTest() {

        mainPage.validateTitle();



    }








}
