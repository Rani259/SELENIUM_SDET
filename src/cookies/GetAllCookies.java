package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.Set;

public class GetAllCookies {

    public static void main(String[] args) {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.tcs.com/" );
        driver.manage().window().maximize();

     /*   System.out.println("Before Adding Cookies ");
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c :allCookies){
            System.out.println(c);
        }*/

        Cookie cok = new Cookie( "Company" ,"Smile Buddy");
        driver.manage().addCookie( cok );

        System.out.println("######$$$$$$$$$$$$%%%%%%%%%%%%%%%%%%%%%%%%%%%%%$#######");
        System.out.println("After Adding Cookies");
        Set<Cookie> allCookies2 = driver.manage().getCookies();
        for (Cookie c :allCookies2){
            System.out.println(c);
        }

 /*       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Get The Cookie By Name");
        System.out.println(driver.manage().getCookieNamed("Company"));*/

        System.out.println("***************************************************");
       /* System.out.println("Delete cookie");
        driver.manage().deleteCookie(cok );*/

        Set<Cookie> allCookies3 = driver.manage().getCookies();
        for (Cookie c :allCookies3){
            System.out.println(c);
        }

       /* System.out.println("***************************************************");
        System.out.println("Delete cookie by name");
        driver.manage().deleteCookie(cok );*/

        System.out.println("Delete All Cookies");
        driver.manage().deleteAllCookies();

        Set<Cookie> allCookies4 = driver.manage().getCookies();
        for (Cookie c :allCookies4){
            System.out.println(c);
        }


        driver.close();


    }
}
