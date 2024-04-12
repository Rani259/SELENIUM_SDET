package actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ContextClickDemo {
    public static void main(String[] args) {


        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://swisnl.github.io/jQuery-contextMenu/demo.html" );
        driver.manage().window().maximize();

        WebElement rightClickElement = driver.findElement( By.xpath( "//span[text()='right click me']" ) );

        Actions actions = new Actions( driver );
        actions.contextClick(rightClickElement)
                .pause( Duration.ofSeconds( 3 ))
                .perform();
        driver.close();


    }
}
