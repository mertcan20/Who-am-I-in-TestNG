package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalLoginPage {

     public RentalLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="formBasicEmail")
    public WebElement username;
    @FindBy(id="formBasicPassword")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;
}
