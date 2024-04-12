package upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadFileExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(  "webdriver.chrome.driver", "C:\\Users\\gedam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/upload" );
        driver.manage().window().maximize();


       WebElement fileUploadElement = driver.findElement( By.id( "file-upload" ) );
       fileUploadElement.sendKeys( "C:\\Users\\gedam\\Desktop\\IntroToJava (1).pdf" );
       Thread.sleep( 4000 );

       WebElement uploadBtn = driver.findElement(By.id( "file-submit" ));
       uploadBtn.click();

       WebElement fileUploadSuccessMassage = driver.findElement( By.xpath( "//h3[text()='File Uploaded!']" ) );

       if (fileUploadSuccessMassage.getText().equalsIgnoreCase( "File Uploaded!" )){
           System.out.println("File Successfully Added");
       }else {
           System.out.println("File Isn't Successfully Uploaded");
           driver.close();
       }




    }
}
