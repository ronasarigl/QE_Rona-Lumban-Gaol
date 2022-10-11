package starter.page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends PageObject {

    private By fieldUsername(){
        return By.id("userName");
    }

    private By fieldPassword(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

    private By headerProduct(){
        return By.xpath("//div[@class = 'main-header']");
    }

    private By errorMessage(){
        return By.xpath("//p[@class = 'mb-1']");
    }

    private By warningError(){
        return By.xpath("//input[@class = 'mr-sm-2 is-invalid form-control']");
    }

    public void headerDisplayed() {
        $(headerProduct()).isDisplayed();
    }

    public void openUrl(){
        openAt("/login");
    }

    public void inputUsername(String username){
        $(fieldUsername()).type(username);
    }

    public void inputInvalidUsername(String username){
        $(fieldUsername()).type(username);
    }

    public void inputPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void inputInvalidPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void clickLoginButton(){
        $(loginButton()).click();
    }

    public void errorMessageDisplayed(){
        $(errorMessage()).isDisplayed();
    }

    public void warningErrorDisplayed(){
        $(warningError()).isDisplayed();
    }

    public void scrollDown(){
        $("//body").sendKeys(Keys.END);
    }
}
