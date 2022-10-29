package starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetUser {

    private String url, url2;

    public void setUrlGetAllUser(){
        url = "https://fakestoreapi.com/users";
    }

    public void requestGetAllUser(){
        given().when().get(url);
    }

    public void setUrlGetSingleUser(){
        url2 = "https://fakestoreapi.com/users/1";
    }
    public void requestGetSingleUser(){
        given().when().get(url2);
    }

}
