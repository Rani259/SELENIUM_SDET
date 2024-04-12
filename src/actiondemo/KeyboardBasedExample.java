package actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class KeyboardBasedExample {

    public static void main(String[] args) {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.flipkart.com/" );
        driver.manage().window().maximize();

        WebElement textBoxElement = driver.findElement( By.name( "q" ));

        Actions actions = new Actions( driver );
        actions.moveToElement(textBoxElement)
                .click(textBoxElement)
                .keyDown( Keys.SHIFT)
                .pause( Duration.ofSeconds( 5 ))
                .sendKeys("Trausers")
                .pause( Duration.ofSeconds( 5 ))
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .pause( Duration.ofSeconds( 5 ))
                .build()
                .perform();

    }
}
