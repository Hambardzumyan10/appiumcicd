package com.qa.stepdef;

import com.qa.pages.BasePage;
import io.cucumber.java.en.Given;

public class LoginStepDef
{



    @Given("^I'm on the login page \"([^\"]*)\"$")
    public void iMOnTheLoginPage(String str) throws InterruptedException {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        new BasePage().Listsearch();
        // Write code here that turns the phrase above into concrete actions
    }
}
