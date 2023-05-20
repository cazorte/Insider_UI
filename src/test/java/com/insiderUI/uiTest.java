package com.insiderUI;


import com.insiderUI.pages.CareerPage;
import com.insiderUI.pages.FormPage;
import com.insiderUI.pages.MainPage;
import com.utils.TestBase;
import org.testng.annotations.Test;

public class uiTest extends TestBase {

    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();
    FormPage formPage = new FormPage();


    @Test
    public void e2eTest() {

        mainPage.validateTitle();

        mainPage.goToCareerPageAndValidate();

        careerPage.validateLifeAtInsiderSection();

        careerPage.clickSeeAllTeam();

        careerPage.selectQA();

        careerPage.selectSeeAllQA();

        careerPage.selectLocationFilter();

        careerPage.validateIstanbulOption();

        careerPage.validatePositions();

        careerPage.validateDepartment();

        careerPage.validateLocations();

        careerPage.validateApplyNowButton();

        careerPage.clickFirstJob();

        formPage.validateTitle();




    }








}
