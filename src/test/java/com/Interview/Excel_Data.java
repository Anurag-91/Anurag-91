package com.Interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Data {

	
	@Test
	public void testdata() throws Exception {
		
		File file=new File("C:\\Users\\Anurag chaudhari\\eclipse-workspace\\M_Project_1\\TestData\\Test_1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data=wb.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		String data1=wb.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		
		
	}
}


