package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

        loginPage.openUrl();
        loginPage.scrollDown();
    }

    @When("I input invalid username")
    public void iInputInvalidUsername() {
        loginPage.inputInvalidUsername("Ronasari");
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputInvalidPassword("Ronasari123");
    }

    @And("I click Login Button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("Ronasari123!");
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("Ronasarigl");
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        loginPage.headerDisplayed();
    }

    @Then("I get warning error")
    public void iGetWarningError(){
        loginPage.warningErrorDisplayed();
    }
}

