package utils;

public class ExcelutilsDemo {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		// TODO Auto-generated method stub
		ExcelUtils excel= new ExcelUtils(projectPath+ "/excel/Demo.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);

	}

}
