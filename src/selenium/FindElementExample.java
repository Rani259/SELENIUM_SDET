package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();     //up casting in java//web driver=parent interface,chromedriver=child interface
        driver.get( "https://mail.rediff.com/cgi-bin/login.cgi" );
        driver.manage().window().maximize();

        WebElement element = driver.findElement( By.id("login1"));       //find ele is the method of web driver//written type is web ele
        element.sendKeys( "RaniGedam@gmail.com" );           //find unique data we use find ele

        Thread.sleep( 40000 );



        driver.close();


    }
}
