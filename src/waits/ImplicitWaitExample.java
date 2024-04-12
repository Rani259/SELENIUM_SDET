package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {

    public static void main(String[] args) {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.letskodeit.com/" );
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 30 ) );  //implicitWait also known as global wait

    }
}
