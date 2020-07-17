//MAY 29 2020
//TOPICS: XPATH,LOCATORS
package Sc1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpath_and_locators {

    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Scenarrio\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://webapps-qa.homedepot.com/RetailApplicantManagement/#/candidates");
        // driver.get("www.google.com");
        // driver.findElement(By.xpath("//*[@name='j_username']")).sendKeys("qat2407");
        driver.findElement(By.name("j_username")).sendKeys("qat2407");
        driver.findElement(By.xpath("(//input)[7]")).sendKeys("qa02test");
        //(//input)[7]  Xapath using idex
        ////*[text()='Location '] By text
        ////*[contains(@id,'mainUserLocat')]  ---contains
        //*[contains(text(),'Location')]
        //*[text()='Location ']/following::input[@id='mainUserLocation']
        ////*[text()='(Store: AIS ID) (Other Location: LAN ID)' ]/following::input
        //ancestor   //*[text()='(Store: AIS ID) (Other Location: LAN ID)' ]/ancestor::div[2]  to find parent and grandparent of the curent node
        //*[@on-select-page='jobs.goToPage(page)']//child::li  to find child elements
        //*[text()='Job Maintenance']//following-sibling::*
        //*[contains(text(),'Job Maintenance')]/parent::*  ------parent of current node , can be written as //*[contains(text(),'Job Maintenance')]/..
        //*[@class='ng-scope']//self::*---same node,  can be written as //*[contains(text(),'Job Maintenance')]/.
        //*[@class='ng-scope']//descendant::*---child of current node
        //*[text()='Requisition Number']/preceding::input[1]
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(3000);

        //driver.findElement(By.xpath("//input[@id='mainUserLocation']")).clear();
       // driver.findElement(By.xpath("//input[@id='mainUserLocation']")).click();
        // driver.findElement(By.id("mainUserLocation")).click();
       // driver.findElement(By.xpath("//input[@id='mainUserLocation']")).sendKeys("0401");
        WebElement locationtextbox =driver.findElement(By.xpath("//input[@id='mainUserLocation']"));
        locationtextbox.clear();
        locationtextbox.click();
        locationtextbox.sendKeys("0401");

      //  JavascriptExecutor js = (JavascriptExecutor)driver;
     //   js.executeScript("arguments[0].click();", button);

    }


}
