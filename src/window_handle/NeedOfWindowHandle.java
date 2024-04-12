package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeedOfWindowHandle {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.letskodeit.com/practice" );
        driver.manage().window().maximize();
        Thread.sleep( 3000 );

        driver.findElement( By.id( "openwindow" ) ).click();
        System.out.println(driver.getTitle());

        Thread.sleep( 3000 );


        driver.quit();                //for all browser including parent and child browser are closed by quit method
    }
}
