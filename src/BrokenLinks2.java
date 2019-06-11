import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks2 {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String baseUrl =  "https://www.beeline.kz/";


        System.setProperty("webdriver.gecko.driver","/home/yerkhat96/Desktop/geckodriver");
        driver = new FirefoxDriver();

        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int					i = 0;


        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            try{
                driver.findElement(By.linkText(t)).click();
                if (driver.getTitle().equals(underConsTitle)) {
                    System.out.println("\"" + t + "\""
                            + " is under construction.");
                } else {
                    System.out.println("\"" + t + "\""
                            + " is working.");
                }
                driver.navigate().back();
            }catch (Exception e){
                System.out.println(t);
                e.printStackTrace();

            }

        }
        driver.quit();
    }
}