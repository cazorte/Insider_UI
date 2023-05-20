package com.insiderUI;


import com.insiderUI.pages.CareerPage;
import com.insiderUI.pages.Career_QA;
import com.insiderUI.pages.FormPage;
import com.insiderUI.pages.MainPage;
import com.utils.TestBase;
import org.testng.annotations.Test;

public class uiTest extends TestBase {

    MainPage mainPage = new MainPage();
    CareerPage careerPage = new CareerPage();
    Career_QA career_qa = new Career_QA();
    FormPage formPage = new FormPage();


    @Test
    public void e2eTest() {

        mainPage.validateTitle();

        mainPage.goToCareerPageAndValidate();

        careerPage.validateLifeAtInsiderSection();

        careerPage.clickSeeAllTeam();

        careerPage.selectQA();

        career_qa.selectSeeAllQA();

        career_qa.selectLocationFilter();

        career_qa.validateIstanbulOption();

        career_qa.validatePositions();

        career_qa.validateDepartment();

        career_qa.validateLocations();

        career_qa.validateApplyNowButton();

        career_qa.clickFirstJob();

        formPage.validateTitle();




    }








}
