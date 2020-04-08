package com.qa.hrm.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.hrm.Base.BaseClass;

public class UtilTest extends BaseClass{

	public static String TEST_DATA_SHEETPATH="C:\\Users\\Shruthi\\eclipse-workspace\\HRM\\src\\main\\java\\com\\qa\\hrm\\Testdata\\TestData.xlsx";
	 static Workbook book;
	 static Sheet sheet;
	
	public UtilTest() throws IOException {
		super();
	}
public static Object[][] getTestData(String SheetName) throws InvalidFormatException, IOException{
	FileInputStream file= null;
	
	 file = new FileInputStream(TEST_DATA_SHEETPATH);
	book = WorkbookFactory.create(file);
	sheet = book.getSheet(SheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	for(int i=0; i<sheet.getLastRowNum();i++) {
		for(int j=0; j<sheet.getRow(0).getLastCellNum();j++) {
			data[i][j]= sheet.getRow(i+1).getCell(j).toString();

		}
	}
return data;
}
	
}
