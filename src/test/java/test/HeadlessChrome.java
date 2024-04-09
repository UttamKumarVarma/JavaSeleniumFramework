package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AppPage;

public class HeadlessChrome {
    
    public static void main(String[] args) {

        WebDriver driver = null;

        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();

        /*
         * Other Browsers WebDriverManager.firefoxdriver().setup();
         * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
         * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
         */
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        driver = new ChromeDriver(options);

        AppPage appPage = new AppPage(driver);
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        appPage.enterText("Mr.Ukv");
    }

}
