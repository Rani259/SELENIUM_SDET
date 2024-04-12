package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumOnFirefox {

    public static void main(String[] args) {


        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        System.setProperty( "webdriver.gecko.driver", "C:\\Users\\gedam\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver( firefoxOptions );
        driver.get( "https://www.selenium.dev/downloads/" );
        driver.close();
    }
    }