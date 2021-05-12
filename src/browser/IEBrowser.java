package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowser {
    //Main Method
    public static void main(String[] args) {

        String baseUrl = "https://www.x-cart.com/";
        WebDriver driver;//Declare a driver
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");//System setProperty (key,driver path)
        driver = new InternetExplorerDriver();//creat an object for url
        driver.manage().window().maximize();//maximise the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Wait till 10 seconds
        driver.get(baseUrl);//Open the browser with url
        String title = driver.getTitle();//Get the title
        System.out.println(title);//Print statement

        //driver.close();//Driver close


    }
}
