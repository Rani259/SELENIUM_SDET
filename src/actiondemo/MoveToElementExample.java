package actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElementExample {
    public static void main(String[] args) {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.flipkart.com/" );
        driver.manage().window().maximize();

        WebElement loginElement = driver.findElement( By.xpath("//span[text()='Login']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(loginElement)
                .pause( Duration.ofSeconds(30))
                .perform();

        driver.close();


    }
}
