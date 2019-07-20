package automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelInteraction {

                public static void main(String[] args) {
                                // TODO Auto-generated method stub
                
                String x=readFromExcel("D:\\Selenium Driver\\Excelinteraction.xls","Sheet1",1,1);
                System.out.println("Data from Excel is: " +x);
                }
                
                public static String readFromExcel(String filePath, String sheetName, int i, int j )
                {
                                String sdata;
                                try{
                                                File src=new File(filePath);
                                                FileInputStream fis=new FileInputStream(src);
                                                HSSFWorkbook wb=new HSSFWorkbook(fis);
                                                HSSFSheet sh1= wb.getSheet(sheetName);
                                                sdata=sh1.getRow(row).getCell(col).getStringCellValue();
                                }
                                
                                catch (Exception e) {
                                                System.out.println(e.getMessage());
                                                sdata=null;
                                }
                                
                                return sdata;

                }

}
