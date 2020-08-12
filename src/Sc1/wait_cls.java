package Sc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class wait_cls {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "C:\\Scenarrio\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        ////////////////////////implicit wait///////////////////
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("url");
        WebElement user = driver.findElement(By.name("j_username"));
        driver.findElement(By.xpath("(//input)[7]")).sendKeys("qt");
        //////////////////////explicit wait/////////////////////////
        WebDriverWait wt = new WebDriverWait(driver,60);
        WebElement username = wt.until(ExpectedConditions.elementToBeClickable(user));
        username.click();
        ///////////////////can be written in oneline////////////////////
        new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(user)).click();

        /////////////Fluent wait/////////////////////////
        FluentWait wt1 =new FluentWait(driver);
        wt1.withTimeout(60, TimeUnit.SECONDS).pollingEvery(10,TimeUnit.SECONDS);


     ////////////////////////////page load///////////////////
     driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

    }
}
