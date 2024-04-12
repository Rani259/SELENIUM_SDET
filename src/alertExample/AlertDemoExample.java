package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoExample {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.letskodeit.com/practice" );
        driver.manage().window().maximize();

        WebElement alertBtn = driver.findElement( By.id( "alertbtn" ));
        WebElement confirmBtn = driver.findElement(By.id( "confirmbtn" ));
        WebElement textBoxElement = driver.findElement(By.id( "name" ));

        textBoxElement.sendKeys( "This is alert button" );    //if u want to send text into Textbox

        alertBtn.click();

        Thread.sleep( 3000 );


        Alert alert = driver.switchTo().alert();       //imp for interview all alert ,alert is interface
        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep( 3000 );

        driver.close();


    }
}
