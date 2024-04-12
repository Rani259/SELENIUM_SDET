package iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeExample {
    public static void main(String[] args) {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://demoqa.com/frames" );
        driver.manage().window().maximize();

        List<WebElement> allList = driver.findElements( By.tagName( "iframe" ) );
        System.out.println(allList.size());                 //To find iframe

        //how to handle iframe
        //IframeWith By Index
       /* driver.switchTo().frame( 3);*/

        //Iframe with By name/**/
        /*driver.switchTo().frame( "frame1" );*/

        //Iframe with WebElement
        driver.switchTo().frame( driver.findElement(By.xpath( "//iframe[@id='frame1']" )) );


        WebElement element = driver.findElement( By.xpath( "//h1[text()='This is a sample page']" ) );
        System.out.println(element.getText());

        driver.switchTo().parentFrame();

        WebElement frameElement = driver.findElement(By.xpath( "//h1[text()='Frames']" ));
        System.out.println(frameElement.getText());

        driver.close();


    }
}
