package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOfSelenium {

    public static void main(String[] args) {

       System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();     //up casting in java//web driver=parent interface,chromedriver=child interface
        driver.get( "https://chromedriver.chromium.org/home" );

        driver.close();

    }
}
