package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AppPage {
	
	WebDriver driver= null;
	
	By textBox= By.xpath("//textarea[@class='gLFyf']");
	
	
	public AppPage(WebDriver driver) 
	{
		this.driver= driver;
		
	}
	
	public void enterText(String text) 
	{
		driver.findElement(textBox).sendKeys(text);
	}
	public void clickEnter() 
	{
		driver.findElement(textBox).sendKeys(Keys.RETURN);
	}
}