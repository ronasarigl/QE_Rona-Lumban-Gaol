package starter.Stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Project.GetUser;

public class GetUserStep {

    @Steps
    GetUser getUser;

    @Given("I set url get all user")
    public void iSetUrlGetAllUser() {
        getUser.setUrlGetAllUser();
    }

    @When("I send request get all user")
    public void iSendRequestGetAllUser() {
        getUser.requestGetAllUser();
    }

    @Given("I set url get a single user")
    public void iSetUrlGetASingleUser() {
        getUser.setUrlGetSingleUser();
    }

    @When("I send request get a single user")
    public void iSendRequestGetASingleUser() {
        getUser.requestGetSingleUser();
    }

}
