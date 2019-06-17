package kz.beeline.test.testcases;

import kz.beeline.test.interfaces.TestBase;
import kz.beeline.test.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {



    @Test
    public void test(){
        driver.get("https://www.beeline.kz/");
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.beeline.kz/almatinskaya-obl/login");
    }
}
