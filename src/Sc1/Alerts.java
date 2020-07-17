package Sc1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String args[]) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\learning\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://webapps-qa.homedepot.com/RetailApplicantManagement/#/candidates");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
    }
}
