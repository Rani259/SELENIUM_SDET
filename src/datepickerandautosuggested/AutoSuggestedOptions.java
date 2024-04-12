package datepickerandautosuggested;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestedOptions {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.google.com/" );
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 20 ) );

        WebElement textBox = driver.findElement(By.name( "q" ));
        textBox.sendKeys("Car ");

        List<WebElement> allOption =driver.findElements(By.xpath( "//ul[@jsname='bw4e9b']//child::span/b" ));
        for (WebElement e : allOption){
            if (e.getText().equalsIgnoreCase( "loan emi calculator" )){
                e.click();
                break;
            }

            System.out.println(e.getText());
        }
        Thread.sleep( 400000 );
        driver.close();
    }
}
