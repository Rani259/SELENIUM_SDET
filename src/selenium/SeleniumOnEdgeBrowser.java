package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumOnEdgeBrowser {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty( "webdriver.edge.driver", "C:\\Users\\gedam\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
        WebDriver driver = new EdgeDriver();
        driver.get( "https://www.selenium.dev/downloads/" );

       driver.manage().window().maximize();

       Thread.sleep( 40000 );

        driver.manage().window().minimize();

        Thread.sleep( 40000 );

      /*  String title = driver.getTitle();
        System.out.println(title);*/
//        System.out.println(driver.getPageSource());
        /*System.out.println(driver.getCurrentUrl());*/
        driver.close();
    }
}
