package starter.Stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Project.DeleteCart;

public class DeleteCartStep {
    @Steps
    DeleteCart deleteCart;
    @Given("I set url delete a cart")
    public void iSetUrlDeleteACart() {
        deleteCart.setUrlDeleteCart();
    }

    @When("I request delete a cart")
    public void iRequestDeleteACart() {
        deleteCart.requestWithDeleteUrl();
    }
}

