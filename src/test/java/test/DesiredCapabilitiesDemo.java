package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {
    public static void main(String[] args) {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        
        //We dont need to use desired capabilities for newer versions of selenium. Instead we can use ChromeOptions class for chrome Driver
        
        ChromeOptions options = new ChromeOptions();
        options.setCapability("ignoreProtectedModeSettings", true);

        driver = new ChromeDriver(options);

        driver.get("https://google.com/");
        driver.manage().window().maximize();
        
        // You can continue your automation flow from here
    }
}
