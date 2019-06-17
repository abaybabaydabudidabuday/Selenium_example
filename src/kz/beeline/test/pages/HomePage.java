package kz.beeline.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    @FindBy(className="menu-cabinet-box")
    private WebElement login;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLogin(){

        login.click();

    }

}
