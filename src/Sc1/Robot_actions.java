package Sc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Robot_actions {

    public static void main(String args[]) throws AWTException

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\learning\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://webapps-qa.homedepot.com/RetailApplicantManagement/#/candidates");
//        Robot robot =new Robot();
//        robot.keyPress(KeyEvent.VK_Q);
//        robot.keyRelease(KeyEvent.VK_Q);
//        robot.keyPress(KeyEvent.VK_A);
//        robot.keyRelease(KeyEvent.VK_A);
//        robot.keyPress(KeyEvent.VK_T);
//        robot.keyRelease(KeyEvent.VK_T);
       // robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
       // robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
//        robot.mouseMove(40,200);

        Actions actions =new Actions(driver);
        WebElement username= driver.findElement(By.name("j_username"));
        WebElement password = driver.findElement(By.xpath("(//input)[7]"));
        WebElement submit =driver.findElement(By.xpath("//button[@id='submit']"));
        actions.sendKeys(username,"qat2407").build().perform();
        // actions.sendKeys(username,"qat2407").perform();
        //actions.click(password).perform();
        //actions.sendKeys(password,"qa02test").perform();

        Action act = (Action) actions.moveToElement(password).click().sendKeys("qa02test").build();
        act.perform();

        actions.moveToElement(submit);
        actions.click().perform();









    }
}
