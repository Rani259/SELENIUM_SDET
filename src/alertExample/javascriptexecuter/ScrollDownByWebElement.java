package alertExample.javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByWebElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://mail.rediff.com/cgi-bin/login.cgi" );
        driver.manage().window().maximize();

        Thread.sleep( 3000 );

        WebElement element = driver.findElement( By.xpath( "//a[text()='Disclaimer']" ) );

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;                         //Down-casting
        javascriptExecutor.executeScript( "arguments[0].scrollIntoView();", element );        //no need to pixel here i.e horizontal or vertical //it is java script = arguments[0].scrollIntoView();

        Thread.sleep( 3000 );

        driver.close();
    }
}
