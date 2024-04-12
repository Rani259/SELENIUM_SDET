package actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropExample {

    public static void main(String[] args) {


        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://selenium08.blogspot.com/2020/01/drag-drop.html" );
        driver.manage().window().maximize();


        WebElement srcElement = driver.findElement( By.id("draggable"));          //src= source ele
        WebElement descElement = driver.findElement(By.id( "droppable" ));       //desc=destination element


        Actions actions = new Actions(driver);
        actions.dragAndDrop(srcElement, descElement)
                .pause( Duration.ofSeconds( 5 ))
                .perform();



    }
}
