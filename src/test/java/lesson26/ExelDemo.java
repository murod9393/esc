package lesson26;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelDemo {

	public static void main(String[] args) {
		XSSFWorkbook excelWorkBook;
		XSSFSheet excelSheet;
		XSSFCell cell;
		
		//C:\\Users\\Murod\\Desktop\\TestData.xlsx
		
		String path = "src\\test\\java\\lesson26\\TestData.xlsx";
		String sheetName = "Sheet1";

		try {
			FileInputStream fis = new FileInputStream(path);
			excelWorkBook = new XSSFWorkbook(fis);
			excelSheet = excelWorkBook.getSheet(sheetName);
			cell = excelSheet.getRow(7).getCell(1);
			String cellData = cell.getStringCellValue();
			System.out.println("Cell Data: " + cellData);
			
			
			
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
