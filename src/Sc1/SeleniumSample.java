package Sc1;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Scenarrio\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys();
        WebElement button = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement save = driver.findElement(By.xpath("//*[@id='save']"));


        if (button.isDisplayed()) {

        } else { // some code}

            // wl not come to else due to no suc element found exception
            try {
                button.click();
            } catch (NoSuchElementException e) {
                save.click();
            }
        }
    }
}
