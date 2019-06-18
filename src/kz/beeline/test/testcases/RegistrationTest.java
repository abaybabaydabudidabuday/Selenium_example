package kz.beeline.test.testcases;

import kz.beeline.test.dataproviders.TestDataProvider;
import kz.beeline.test.interfaces.TestBase;
import kz.beeline.test.pages.HomePage;
import kz.beeline.test.pages.LoginMobilePasswordPage;
import kz.beeline.test.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static kz.beeline.test.utilities.URLConst.*;
@Listeners(kz.beeline.test.listeners.TestListenerImpl.class)
public class RegistrationTest extends TestBase {


    @Test(priority = 1,dataProvider = "LoginDataProvider", dataProviderClass = TestDataProvider.class)
    public void test(String number, String password){
        System.out.println(number);


        HomePage homePage = new HomePage(driver);
        homePage.verifyPage();
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyPage();
        loginPage.clickForgotPassword();


        LoginMobilePasswordPage mobilePasswordPage = new LoginMobilePasswordPage(driver);
        //todo: here should impl data driven fmwk
        mobilePasswordPage.setLoginNumber(number);
        mobilePasswordPage.clickSendingPasswordBtn();
        homePage.goToHomePage();

    }
}
