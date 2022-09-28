package starter.stepdefenition.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("I go to login page");
    }

    @When("I click login button")
    public void iClickLoginButton() {
        System.out.println("I click login button");
    }

    @Then("I will get error  message data is required")
    public void iWillGetErrorMessageDataIsRequired() {
        System.out.println("I will get error  message data is required");
    }

    @And("I can't login")
    public void iCanTLogin() {
        System.out.println("I can't login");
    }

    @When("I input invalid password")
    public void iInputInvalidPassword() {
        System.out.println("I input invalid password");
    }

    @Then("I will get error  message email is required")
    public void iWillGetErrorMessageEmailIsRequired() {
        System.out.println("I will get error  message email is required");
    }

    @When("I input valid password")
    public void iInputValidPassword() {
        System.out.println("I input valid password");
    }

    @When("I input invalid email")
    public void iInputInvalidEmail() {
        System.out.println("I input invalid email");
    }

    @Then("I will get error  message password is required")
    public void iWillGetErrorMessagePasswordIsRequired() {
        System.out.println("I will get error  message password is required");
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        System.out.println("I input valid email");
    }
}
