package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
Create the package ‘browserfactory’ and create the
class with the name ‘BaseTest’ inside the
‘browserfactory’ package. And write the browser setup
code inside the class ‘Base Test’.
 */
public class BaseTest {
    public static WebDriver driver;
    public static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public  void openBrowser(String baseUrl){
        //Launch the Chrome browser
        driver = new ChromeDriver();
        //Open the Url into browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        //Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser() {
        //close the browser
        driver.quit();
    }
}
