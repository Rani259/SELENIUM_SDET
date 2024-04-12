package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();     //up casting in java//web driver=parent interface,chromedriver=child interface
        driver.get( "https://mail.rediff.com/cgi-bin/login.cgi" );
        driver.manage().window().maximize();

        //by id locator
      /* WebElement element = driver.findElement( By.id( "login1" ) );       //by an abstract clas
       element.sendKeys( "Rani@gmail.com" );*/

        //by class name locator
        /*WebElement element = driver.findElement(By.className( "signinbtn" ) );
        element.click();*/

        // by name locator
        /*WebElement element = driver.findElement(By.name( "login" ) );
        element.sendKeys( "Rani@gmail.com" );*/

        //by linkText()
        /*WebElement element = driver.findElement(By.linkText( " Forgot Password") );
        element.click();
*/
       //by partial link text
        /*WebElement element = driver.findElement(By.partialLinkText( " Forgot Password") );
        element.click();*/

        //by tagName
       /* List<WebElement> allLists = driver.findElements( By.tagName( "input" ) );
        System.out.println(allLists.size());*/

        //by CSS selector by id
      /*  WebElement element = driver.findElement(By.cssSelector( "input[id='login1']" ) );      //for fetch the ele inspect+cntr+f+input[id='login1']
        element.sendKeys( "Rani@gmail.com" );*/

        //2nd way css selector
        /*WebElement element = driver.findElement(By.cssSelector( "inputlogin1" ) );      //for fetch the ele inspect+cntrol+f1+input#login1
        element.sendKeys( "Rani@gmail.com" );*/

        //by css selector by class attribute
        /*WebElement element = driver.findElement(By.cssSelector( "input[class='signinbtn']" ) );
        element.click();*/

        //2nd way
        WebElement element = driver.findElement(By.cssSelector( "input.signinbtn" ) );
        element.click();
        Thread.sleep( 4000 );
        driver.close();

    }
}
