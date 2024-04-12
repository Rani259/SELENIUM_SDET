package window_handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Set;

public class HandleWindowExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.letskodeit.com/practice" );
        driver.manage().window().maximize();
        Thread.sleep( 5000 );

        driver.findElement( By.id( "openwindow" ) ).click();
        String parentWindowId = driver.getWindowHandle();         //getWindowHandle() written type is String
        System.out.println(parentWindowId);                       //it is written parentWindowID

        Set<String> allWindow = driver.getWindowHandles();         //set of String to switch one window to another//its written child and parent window I'd
        System.out.println(allWindow);                             // set wasn't accept duplicate data that's why getWindow handles written type is setOfString


        for(String s : allWindow){
          if (!s.contentEquals( parentWindowId )){
              driver.switchTo().window(s);
              System.out.println(driver.getTitle());
              Thread.sleep( 3000 );
              driver.findElement(By.xpath( "//a[text()='HOME']" )).click();        //click on home page
              Thread.sleep( 3000 );
              driver.close();
          }
        }
        driver.switchTo().newWindow( WindowType.TAB );            //for switch bet tabs
        driver.switchTo().window(  parentWindowId );               //jump  to parent window
        System.out.println("Parents Window Title" + driver.getTitle());
        Thread.sleep( 3000 );
        driver.quit();                                            //for closing parent window//imp
    }
}
