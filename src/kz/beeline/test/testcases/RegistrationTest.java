package kz.beeline.test.testcases;

import kz.beeline.test.interfaces.TestBase;
import kz.beeline.test.pages.HomePage;
import kz.beeline.test.pages.LoginMobilePasswordPage;
import kz.beeline.test.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static kz.beeline.test.utilities.URLConst.*;

public class RegistrationTest extends TestBase {


    @Test
    public void test(){
        Assert.assertEquals(driver.getCurrentUrl(), HOME_PAGE_EXPECTED_URL);
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(),LOGIN_PAGE_EXPECTED_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickForgotPassword();
        Assert.assertEquals(driver.getCurrentUrl(),LOGIN_MOBILE_PASSWORD_PAGE_EXPECTED_URL);
        LoginMobilePasswordPage mobilePasswordPage = new LoginMobilePasswordPage(driver);
        //todo: here should impl data driven fmwk
        mobilePasswordPage.setLoginNumber("87086441271");
        mobilePasswordPage.clickSendingPasswordBtn();
    }
}
