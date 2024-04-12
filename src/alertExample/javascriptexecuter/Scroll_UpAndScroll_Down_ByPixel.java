package alertExample.javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UpAndScroll_Down_ByPixel {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://mail.rediff.com/cgi-bin/login.cgi" );
        driver.manage().window().maximize();

        Thread.sleep( 3000 );

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;         //javascriptExecutor we create reference variable//we have to perform Down-casting//this is interface that's why we cant create object
        javascriptExecutor.executeScript( "window.scrollBy(0,3000)");          //scroll down

        Thread.sleep( 5000 );
        javascriptExecutor.executeScript( "window.scrollBy(0,-3000)");

        Thread.sleep( 5000 );
        driver.close();



    }
}
