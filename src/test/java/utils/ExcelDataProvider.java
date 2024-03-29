package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AppPage;

public class ExcelDataProvider {
	WebDriver driver= null;
	@BeforeTest
	public void browserSetup() {
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();

				/*
				 * Other Browsers WebDriverManager.firefoxdriver().setup();
				 * WebDriverManager.operadriver().setup(); WebDriverManager.phantomjs().setup();
				 * WebDriverManager.edgedriver().setup(); WebDriverManager.iedriver().setup();
				 */

				driver  = new ChromeDriver();
	}
	
	@Test(dataProvider="test1data")
	public void test1(String username, String password) {
		
		System.out.println(username+ " | "+password);
		AppPage appPage = new AppPage(driver);
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		appPage.enterText(username +" "+ password);
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		// TODO Auto-generated method stub
				String projectPath = System.getProperty("user.dir");
				
				Object data[][]=testData(projectPath + "/excel/Demo.xlsx", "Sheet1");
				return data;				
				
	}
	
	public Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel= new ExcelUtils(excelPath, sheetName);
		
		int rowCount= excel.getRowCount();
		int colCount=excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData= excel.getCellDataString(i, j);
			//	System.out.print(cellData+" | ");
				data[i-1][j]= cellData;
			}
			System.out.println();
		}
		return data;
	}

}
