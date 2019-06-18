package kz.beeline.test.interfaces;

import kz.beeline.test.utilities.JavaUtilResources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {

    protected WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.gecko.driver","/home/yerkhat96/Desktop/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", true);
        driver = new FirefoxDriver(options);
        driver.get(JavaUtilResources.getProperties("pageURL"));
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }



}
