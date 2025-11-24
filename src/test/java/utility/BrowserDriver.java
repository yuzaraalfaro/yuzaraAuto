package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homePage;


public class BrowserDriver {

        private static WebDriver driver;


        public BrowserDriver(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://qalab.bensg.com/store/pe/");
        }

        public static WebDriver getDriver() {
            return driver;
        }
        public static void close() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }


}