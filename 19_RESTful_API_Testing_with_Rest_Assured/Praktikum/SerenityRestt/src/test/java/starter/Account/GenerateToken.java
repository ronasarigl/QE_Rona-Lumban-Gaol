package starter.Account;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GenerateToken {

    private String url, username, password;

    public void setValidUsernameAndValidPassword(){
        password = "Ronasari123!";
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "ronsa";
    }

    public void requestGenerateToken(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(bodyGenerateToken().toJSONString());
        when().post(url);
    }

    private JSONObject bodyGenerateToken() {
        JSONObject body = new JSONObject();
        body.put("username", "ronsa");
        body.put("password", "Ronasari123!");
        return body;
    }

    public void validateStatusCode(){
        then().statusCode(200);
    }

    public void validateSuccessMessage(){
        then().body(equalTo("Success"));
    }

    public void setNullUsernameAndValidPassword(){
        password = "Ronasari123!";
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = " ";
    }

    public void validateCode(){ then().statusCode(400);

    }

    public void validateBadRequestMessage(){then().body(equalTo("{" + "\"code\":\"1200\"," +
            "\"message\":\"UserName and Password required.\"}"));

    }

    public void setNullUsernameAndInvalidPassword(){
        password = "Ronasari12";
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = " ";
    }

    public void setValidUsernameAndNullPassword(){
        password = " ";
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "ronsa";
    }

   public void setInvalidUsernameAndNullPassword(){
       password = " ";
       url = "https://demoqa.com/Account/v1/GenerateToken";
       username = "rona";
   }

    private JSONObject bodyGenerateTokenInvalidUsernameAndNullPassword() {
        JSONObject body = new JSONObject();
        body.put("username", " rona ");
        body.put("password", " ");
        return body;
    }

    public void setInvalidUsernameAndInvalidPassword(){
        password = "Ronasari12";
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "rona";
    }

    private JSONObject bodyGenerateTokenInvalidUsernameAndPassword() {
        JSONObject body = new JSONObject();
        body.put("username", "rona ");
        body.put("password", "Ronasari12");
        return body;
    }

    public void setInvalidUsernameAndValidPassword(){
        password = "Ronasari123!";
        url = "https://demoqa.com/Account/v1/GenerateToken";
        username = "rona";

    }

    private JSONObject bodyGenerateTokenB() {
        JSONObject body = new JSONObject();
        body.put("username", "rona");
        body.put("password", "Ronasari123!");
        return body;
    }

}
