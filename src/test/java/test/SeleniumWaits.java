package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AppPage;

public class SeleniumWaits {
	
	
	@Test
	public void test1() {
		WebDriver driver = null;
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		/*
		 * Other Browsers WebDriverManager.firefoxdriver().setup();
		 * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
		 * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
		 */
		driver = new ChromeDriver();

		AppPage appPage = new AppPage(driver);
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Explicit Wait
		//WebDriverWait wait= new WebDriverWait(driver, 20);
		//WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='gLFyf']")));
		
		appPage.enterText("Mr.Ukv");
		appPage.clickEnter();
	}

}
