package kz.beeline.test.interfaces;

import kz.beeline.test.utilities.JavaUtilResources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class TestBase {

    protected WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty(JavaUtilResources.getProperties("nameDriver"),JavaUtilResources.getProperties("pathDriver") +JavaUtilResources.getProperties("exeDriver") );
        driver = new FirefoxDriver();
        driver.get(JavaUtilResources.getProperties("pageURL"));
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }



}
