package starter.stepdefenition.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {
    @Given("I go to main page")
    public void iGoToMainPage() {
        System.out.println("I go to main page");
    }

    @When("I enter null keyword")
    public void iEnterNullKeyword() {
        System.out.println("I enter null keyword");
    }

    @Then("I will get last history in search box")
    public void iWillGetLastHistoryInSearchBox() {
        System.out.println("I will get last history in search box");
    }

    @And("I can see last history")
    public void iCanSeeLastHistory() {
        System.out.println("I can see last history");
    }

    @When("I enter invalid keyword")
    public void iEnterInvalidKeyword() {
        System.out.println("I enter invalid keyword");
    }

    @Then("I will get suitable job")
    public void iWillGetSuitableJob() {
        System.out.println("I will get suitable job");
    }

    @When("I enter valid keyword in search box")
    public void iEnterValidKeywordInSearchBox() {
        System.out.println("I enter valid keyword in search box");
    }
}
