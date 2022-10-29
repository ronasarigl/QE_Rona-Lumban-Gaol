package starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeleteProduct {

    private String url;

    public void setUrlDeleteProduct(){
        url = "https://fakestoreapi.com/products/6";
    }

    public void requestDeleteProduct(){
        given().when().get(url);
    }
}
