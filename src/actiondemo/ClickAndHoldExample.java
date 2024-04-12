package actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ClickAndHoldExample {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://selenium08.blogspot.com/2020/01/click-and-hold.html" );

        driver.manage().window().maximize();
        WebElement elementA = driver.findElement( By.xpath(  "//li[text()='A']") );

        Actions actions = new Actions( driver );

        actions.clickAndHold(elementA)
                .pause( Duration.ofSeconds( 5 )  )
                .release(elementA)
                .pause( Duration.ofSeconds( 5 )  )
                .perform();           //for singal method
        Thread.sleep( 5000 );
        driver.close();

    }
}
