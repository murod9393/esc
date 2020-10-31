package lesson26;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelDemo {

	
		
		 //C:\\Users\\Murod\\Desktop\\TestData.xlsx           src\\test\\java\\lesson26\\TestData.xlsx
		
		static String path = "C:\\Users\\Murod\\Desktop\\TestData.xlsx";
		static String sheetName = "Sheet1";
		
		public static void main(String[] args) {
			
			ExcelUtility.setExcelFile(path, sheetName);
			
			
			
		}
	

}
