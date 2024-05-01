package com.hans.stepdef;

import com.hans.BaseTest;
import com.hans.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDefs extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
