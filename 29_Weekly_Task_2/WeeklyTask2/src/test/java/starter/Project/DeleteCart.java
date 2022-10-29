package starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeleteCart {

    private String url;

    public void setUrlDeleteCart(){
        url = "https://fakestoreapi.com/carts/6";
    }

    public void requestWithDeleteUrl(){
        given().when().get(url);
    }
}
