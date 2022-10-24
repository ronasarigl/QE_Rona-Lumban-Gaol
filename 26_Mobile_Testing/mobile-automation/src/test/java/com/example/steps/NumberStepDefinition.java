package com.example.steps;

import com.example.app.pages.NumberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NumberStepDefinition {

    NumberPage numberpage = new NumberPage();
    @Given("I am on the calculator page")
    public void iAmOnTheCalculatorPage() {
        numberpage.calculatorHeaderDisplayed();
    }

    @When("I click one number")
    public void iClickOneNumber() {
        numberpage.clickNumberOne();
    }

    @Then("the number can displayed in the screen")
    public void theNumberCanDisplayedInTheScreen() {
        numberpage.numDisplayed();
    }
}
