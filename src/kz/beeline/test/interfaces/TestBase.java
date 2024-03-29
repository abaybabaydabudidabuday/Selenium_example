package kz.beeline.test.interfaces;

import kz.beeline.test.utilities.BrowsersConst;
import kz.beeline.test.utilities.JavaUtilResources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public abstract class TestBase {

    protected WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void beforeTest(String browser){
        if(browser.equalsIgnoreCase(BrowsersConst.CHROME)){
            System.setProperty(JavaUtilResources.getProperties("nameChromeDriver"),
                    JavaUtilResources.getProperties("pathToDrivers")
                            + JavaUtilResources.getProperties("exeChromeDriver"));
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase(BrowsersConst.FIREFOX)){
            System.setProperty(JavaUtilResources.getProperties("nameFirefoxDriver"),
                    JavaUtilResources.getProperties("pathToDrivers")
                            + JavaUtilResources.getProperties("exeFirefoxDriver"));
            driver = new FirefoxDriver();
        }
        driver.get(JavaUtilResources.getProperties("pageURL"));
    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }



}




