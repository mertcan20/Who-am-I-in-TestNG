package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_DashboardPage {

     public OrangeHRM_DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "oxd-userdropdown-name")
    public WebElement profile;
    @FindBy(linkText = "Logout")
    public WebElement logOut;

}
