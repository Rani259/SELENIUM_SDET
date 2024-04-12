package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.letskodeit.com/" );
        driver.manage().window().maximize();

        //we use explicit only for single\specified web element throw wait
        WebElement radioBtn = driver.findElement( By.id( "bmwradio" ) );

        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds( 20 ) );
        wait.until( ExpectedConditions.elementToBeClickable( radioBtn ) ).click(); //vvvvvv imp


    }
}
