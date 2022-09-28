package starter.stepdefenition.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
    @Given("I go to main page and I click profile button")
    public void iGoToMainPageAndIClickProfileButton() {
        System.out.println("I go to main page and I click profile button");
    }

    @When("I click sign out")
    public void iClickSignOut() {
        System.out.println("I click sign out");
    }

    @Then("I will out from the page")
    public void iWillOutFromThePage() {
        System.out.println("I will out from the page");
    }

    @And("I can logiout")
    public void iCanLogiout() {
        System.out.println("I go to main page and I click profile button");
    }

    @When("I click sign out and don't click remember me")
    public void iClickSignOutAndDonTClickRememberMe() {
        System.out.println("I click sign out and don't click remember me");
    }

    @And("I can logout")
    public void iCanLogout() {
        System.out.println("I can logout");
    }

    @When("I click sign out and click remember me")
    public void iClickSignOutAndClickRememberMe() {
        System.out.println("I click sign out and click remember me");
    }
}
