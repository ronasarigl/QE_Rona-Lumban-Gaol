package starter.stepdefenition.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Account.GenerateToken;

public class GenerateTokenSteps {

    @Steps
    GenerateToken generateToken;
    @Given("I set valid username and valid password")
    public void iSetValidUsernameAndValidPassword() {
        generateToken.setValidUsernameAndValidPassword();
    }

    @When("I request generate token")
    public void iRequestGenerateToken() {
        generateToken.requestGenerateToken();
    }

    @Then("I will get 200")
    public void iWillGet200(){
        generateToken.validateStatusCode();
    }

    @And("get Success message")
    public void getSuccessMessage() {
        generateToken.validateSuccessMessage();
    }

    @Given("I set null username and valid password")
    public void iSetNullUsernameAndValidPassword() {
        generateToken.setNullUsernameAndValidPassword();
    }

    @And("get Bad Request message")
    public void getBadRequestMessage() {
        generateToken.validateBadRequestMessage();
    }

    @Given("I set null username and invalid password")
    public void iSetNullUsernameAndInvalidPassword() {
        generateToken.setNullUsernameAndInvalidPassword();
    }

    @Given("I set valid username and null password")
    public void iSetValidUsernameAndNullPassword() {
        generateToken.setValidUsernameAndNullPassword();
    }

    @Given("I set invalid username and null password")
    public void iSetInvalidUsernameAndNullPassword() {
        generateToken.setInvalidUsernameAndNullPassword();
    }

    @Given("I set invalid username and invalid password")
    public void iSetInvalidUsernameAndInvalidPassword() {
        generateToken.setInvalidUsernameAndInvalidPassword();
    }

    @Given("I set invalid username and valid password")
    public void iSetInvalidUsernameAndValidPassword() {
        generateToken.setInvalidUsernameAndValidPassword();
    }

    @Then("I will get 400")
    public void iWillGet400(){
        generateToken.validateCode();
    }

}
