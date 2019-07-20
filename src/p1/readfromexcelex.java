package p1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readfromexcelex {

	public static void main(String[] args) {
		
String x=readFromExcel("E:\\Selenium\\Test_Data.xls","Sheet1",1,1);
System.out.println(x);
	}
	
	public static String readFromExcel(String filepath,String sheetname,int row,int col)
	{
		String sdata;
		try
		{
			File src = new File(filepath);
			FileInputStream fis=new FileInputStream(src);
			HSSFWorkbook wb =new HSSFWorkbook(fis);
			HSSFSheet sh1=wb.getSheet(sheetname);
			sdata=sh1.getRow(row).getCell(col).getStringCellValue();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			sdata=null;
		}
		
		return sdata;
	}
}

