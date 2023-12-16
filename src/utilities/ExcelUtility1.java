package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility1 {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell celldata_email,celldata_password;
	
	public XSSFSheet setworkbook() throws IOException {
		
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+("\\src\\testData\\Data.xlsx"));
		 workbook =new XSSFWorkbook(fs);
		 sheet= workbook.getSheetAt(0);
			return sheet;
	
	}
			
	


public XSSFCell Get_email(int rownum , int colnum) throws IOException {
	sheet = setworkbook();
	celldata_email=sheet.getRow(rownum).getCell(colnum);
	return celldata_email;
}

public XSSFCell Get_password (int rownum , int colnum) throws IOException {
	sheet = setworkbook();
	celldata_password= sheet.getRow(rownum).getCell(colnum);
	return celldata_password;
}


XSSFSheet sheet1;
XSSFCell celldata_name, celldata_mail, celldata_pass;

public XSSFSheet setworkbook1() throws IOException {
	
	FileInputStream fs1=new FileInputStream(System.getProperty("user.dir")+("\\src\\testData\\Data.xlsx"));
		
	 workbook =new XSSFWorkbook(fs1);
	 sheet1 = workbook.getSheetAt(1);
		return sheet1;
}


public XSSFCell Get_name(int rownum , int colnum) throws IOException {
	sheet1 = setworkbook1();
	celldata_name = sheet1.getRow(rownum).getCell(colnum);
	return celldata_name;
}


public XSSFCell Get_mail(int rownum , int colnum) throws IOException {
	sheet1=setworkbook1();
	celldata_mail = sheet1.getRow(rownum).getCell(colnum);
	return celldata_mail;
}
public XSSFCell Get_pass(int rownum , int colnum) throws IOException {
sheet1=setworkbook1();
celldata_pass = sheet1.getRow(rownum).getCell(colnum);
return celldata_pass;
}
}
