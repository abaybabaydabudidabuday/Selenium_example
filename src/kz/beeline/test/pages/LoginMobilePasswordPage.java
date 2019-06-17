package kz.beeline.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMobilePasswordPage {

    private WebDriver driver;
    @FindBy(css="input#Login")
    private WebElement loginET;

    @FindBy(xpath = "//div[@class=\"form-cell\"]")
    private WebElement submitBtn;

    public LoginMobilePasswordPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setLoginNumber(String number){
        loginET.sendKeys(number);

    }

    public void clickSendingPasswordBtn(){
        submitBtn.click();
    }


}
