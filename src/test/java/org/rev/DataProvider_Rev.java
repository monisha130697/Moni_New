package org.rev;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Rev {
		@Test (dataProvider = "getdata")
		public void test1(String data1,String data2) {
			System.out.println(data1);
			System.out.println(data2);
			
		}
		@DataProvider (name="getdata")
		public Object[][] dpMeth() throws IOException{
		
			File fl=new File("C:\\Users\\DURGALAKSHMI\\eclipse-workspace\\SeleniumProject2\\"
					+ "TestNG_Revision\\src\\test\\resources\\TestData\\ex.xlsx");
			FileInputStream fis=new FileInputStream(fl);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet("Sheet1");
			int rcount=sh.getPhysicalNumberOfRows();
			int ccount=sh.getRow(0).getPhysicalNumberOfCells();
			Object[][] data=new Object[rcount - 1][ccount];

	        for (int i = 1; i < rcount; i++) {
	            Row row = sh.getRow(i);
	            for (int j = 0; j < ccount; j++) {
	                Cell cell = row.getCell(j);
	                data[i - 1][j] = cell.toString();
	            }
	        }
			return data;
		}

}