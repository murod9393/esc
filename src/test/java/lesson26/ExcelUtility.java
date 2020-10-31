package lesson26;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static XSSFWorkbook excelWorkBook;
	private static XSSFSheet excelSheet;
	
	
	public static void setExcelFile(String path, String sheetname) {
		
		try {
			FileInputStream fis = new FileInputStream(path);
			excelWorkBook = new XSSFWorkbook(fis);
			excelSheet = excelWorkBook.getSheet(sheetname);
		}catch(Exception e){
			e.getMessage();
		}
	} 
	
	public static String[][] getTestData(String tableName){
		String[][] testData = null;
		XSSFCell[] boundryCells = findCells(tableName);
		XSSFCell startCell = boundryCells[0];
		XSSFCell endCell = boundryCells[1];
		int startRow = startCell.getRowIndex()+1;
		int endRow = endCell.getRowIndex()-1;
		int startCol = startCell.getColumnIndex()+1;
		int endCol = endCell.getColumnIndex()-1;
		
		testData = new String[endRow-startRow+1][endCol-startCol+1];
		for(int i=startRow; i<endRow+1; i++) {
			for(int j=startCol; j<endCol; j++ ) {
				testData[i-startRow][j-startCol] = excelSheet.getRow(i).getCell(j).getStringCellValue(); 
			}
		}
		
		
		
		
		return testData;
	} 

	public static XSSFCell[] findCells(String tableName) {
		XSSFCell[] cells = new XSSFCell[2];
		String position = "starting";
		for(Row row: excelSheet) {
			for(Cell cell : row) {
				if(tableName.equals(cell.getStringCellValue())) {
					if(position.equalsIgnoreCase("starting")) {
						cells[0] = (XSSFCell) cell;
						position = "ending";
					}else {
						cells[1] = (XSSFCell) cell;
					}
				}
			}
		}
		
		return cells;
	} 
	
	
	
	
	
	
	
}
