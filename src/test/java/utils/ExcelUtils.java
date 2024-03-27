package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static String projectPath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		getRowCount();
		//getCellDataString();
		//getCellDataNumber();
	}

	public static void getRowCount() {
		// TODO Auto-generated method stub

		try {
			workbook = new XSSFWorkbook(projectPath + "/excel/Demo.xlsx");
			sheet = workbook.getSheet("Sheet1");

			int rowcOunt = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count in Excel is " + rowcOunt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getCellDataString(int rowNumber, int columnNumber) {

		
		try {
			
			String value = sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
			System.out.println(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void getCellDataNumber(int rowNumber, int columnNumber) {

		try {
			
			double value = sheet.getRow(rowNumber).getCell(columnNumber).getNumericCellValue();
			System.out.println(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
