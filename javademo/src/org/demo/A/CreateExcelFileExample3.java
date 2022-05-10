package org.demo.A;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;

public class CreateExcelFileExample3 {
	// declare file name to be create
	String filename = "C:\\Projects\\demo\\Balance.xls";
	// creating an instance of HSSFWorkbook class
	HSSFWorkbook workbook = new HSSFWorkbook();
	// invoking creatSheet() method and passing the name of the sheet to be created
	HSSFSheet sheet = workbook.createSheet("January");
	FileOutputStream fileOut;

	public void name(String Sn, String CustomerName, String Account) {

		try {
			// creating the 0th row using the createRow() method
			HSSFRow rowhead = sheet.createRow((short) 0);
			// creating cell by using the createCell() method and setting the values to the
			// cell by using the setCellValue() method
			rowhead.createCell(0).setCellValue("S.No.");
			rowhead.createCell(1).setCellValue("Customer Name");
			rowhead.createCell(2).setCellValue("Account Number");
			// creating the 1st row
			HSSFRow row = sheet.createRow((short) 1);
			// inserting data in the first row
			row.createCell(0).setCellValue(Sn);
			row.createCell(1).setCellValue(CustomerName);
			row.createCell(2).setCellValue(Account);
			fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			// closing the Stream
			fileOut.close();
			// closing the workbook
			workbook.close();
			// prints the message on the console
			System.out.println("Excel file has been generated successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Excel() throws IOException {
//		String filename = "C:\\temp\\selfie\\Balance.xls";

		FileInputStream fis = new FileInputStream(filename);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("January");
		HSSFRow row = sheet.getRow(0);
		int colNum = row.getLastCellNum();
		System.out.println("Total Number of Columns in the excel is : " + colNum);
		int rowNum = sheet.getLastRowNum() + 1;
		System.out.println("Total Number of Rows in the excel is : " + rowNum);
	}

	public static void main(String[] args) throws IOException {
//		 new CreateExcelFileExample3().name("1","shashwat","1234");
		new CreateExcelFileExample3().Excel();
	}
}
