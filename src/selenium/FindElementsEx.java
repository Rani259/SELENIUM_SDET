package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsEx {

    public static void main(String[] args) {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();     //up casting in java//web driver=parent interface,chromedriver=child interface
        driver.get( "https://mail.rediff.com/cgi-bin/login.cgi" );
        driver.manage().window().maximize();

        //whenever we have to find more than one web ele we use fine elements.

        List<WebElement> allLists = driver.findElements( By.tagName("input") );

        System.out.println(allLists.size());          // o/p will get in numbers

        for (WebElement e : allLists){
            System.out.println(e);
        }
        driver.close();
    }
}
