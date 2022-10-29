package starter.Stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Project.DeleteProduct;

public class DeleteProductStep {

    @Steps
    DeleteProduct deleteProduct;
    @Given("I set valid delete product url")
    public void iSetValidDeleteProductUrl() {
        deleteProduct.setUrlDeleteProduct();
    }

    @When("I send request delete a product")
    public void iSendRequestDeleteAProduct() {
        deleteProduct.requestDeleteProduct();
    }
}
