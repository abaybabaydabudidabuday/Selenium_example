import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Main {

    public static void main(String[]args){
        System.out.println("suka");
        System.setProperty("webdriver.gecko.driver","/home/yerkhat96/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://vk.com/";
        String expectedTitle = "Welcome! | VK";
        String actualTitle = "";


        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
//        driver.manage().timeouts().implicitlyWait(10000l,null);
        //        WebElement pagewrap = driver.findElement(By.xpath("//*[@id=\"page_wrap\"]"));

        WebElement loginET = driver.findElement(By.xpath("//*[@id=\"index_email\"]"));
        loginET.sendKeys("87086441271"); // todo: add here number
        WebElement passET = driver.findElement(By.xpath("//*[@id=\"index_pass\"]"));
        passET.sendKeys("eyueyu111"); // todo: add here password
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"index_login_button\"]"));
        loginBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        By messageXpath = By.xpath("//*[@id=\"l_msg\"]");
        WebElement sendMessageMenu = wait.until(ExpectedConditions.presenceOfElementLocated(messageXpath));
        sendMessageMenu.click();
        By searchXpath = By.xpath("//*[@id=\"im_dialogs_search\"]");
        WebElement searchPidors = wait.until(ExpectedConditions.presenceOfElementLocated(searchXpath));
        searchPidors.sendKeys("Vammi Ive");
        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By dialogCss = By.xpath("/html/body/div[11]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/ul/li[3]");
        WebElement pidor =  wait.until(ExpectedConditions.presenceOfElementLocated(dialogCss));
        pidor.click();

        By sendMessagexPath = By.xpath("//*[@id=\"im_editable0\"]");
        WebElement sendMessage =  wait.until(ExpectedConditions.presenceOfElementLocated(sendMessagexPath));
        sendMessage.sendKeys("Poidem nahui v magnum");
        WebElement sendBtn = driver.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/div[2]/div[3]/div/div/div/div/div[1]/div[3]/div[2]/div[4]/div[3]/div[4]/div[1]/button"));
        sendBtn.click();
        sendMessage.sendKeys("With Yerkhat's Lenovo love send by dabudi");
        sendBtn.click();










//
//        if(loginET.isSelected()){
//
//        }
        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
//        driver.close();
    }
}
