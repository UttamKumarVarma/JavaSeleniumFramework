package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static String projectPath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
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
		// getCellDataString();
		// getCellDataNumber();
	}

	public static int getRowCount() {
		// TODO Auto-generated method stub
		int rowCount = 0;
		try {
			workbook = new XSSFWorkbook(projectPath + "/excel/Demo.xlsx");
			sheet = workbook.getSheet("Sheet1");

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count in Excel is " + rowCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount() {
		// TODO Auto-generated method stub
		int colCount = 0;
		try {
			workbook = new XSSFWorkbook(projectPath + "/excel/Demo.xlsx");
			sheet = workbook.getSheet("Sheet1");

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Column Count in Excel is " + colCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return colCount;
	}

	public static String getCellDataString(int rowNumber, int columnNumber) {
		String value = null;
		try {

			value = sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
			//System.out.println(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public static double getCellDataNumber(int rowNumber, int columnNumber) {
		double value = 0;
		try {

			value = sheet.getRow(rowNumber).getCell(columnNumber).getNumericCellValue();
		//	System.out.println(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

}
