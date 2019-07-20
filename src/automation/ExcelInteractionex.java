package automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelInteractionex {

                public static void main(String[] args) {
                
                }
                
                public static void writeTOExcel(String filePath, String sheetName, ArrayList<String> a1) throws IOException
                {
                                File src=new File(filePath);
                                FileOutputStream fos=new FileOutputStream(src);
                                HSSFWorkbook wb=new HSSFWorkbook();
                                HSSFSheet sh1= wb.getSheet(sheetName);
                                for(int i=0;i<a1.size();i++)
                                {
                                                sh1.getRow(1).getCell(i).setCellValue(a1.get(i));
                                }
                                wb.write(fos);
                                fos.close();
                                
                                
/*ArrayList<String> x=readFromExcel("E:\\Java\\TestData.xls","Sheet1",1,1);
for(int i=0;i<x.size();i++)
{
                System.out.println(x.get(i));
}
*/           }
                
                
                
                public static ArrayList<String>  readFromExcel(String filePath,String sheetName) 
                {
                                String sdata;
                                ArrayList<String> aList=new ArrayList<String>();
                                try {

                                                File src=new File(filePath);
                                                FileInputStream fis=new FileInputStream(src);
                                                HSSFWorkbook wb=new HSSFWorkbook(fis);
                                                HSSFSheet sh1= wb.getSheet(sheetName);
                                                int iCol=0;
                                                int noOfColumn=sh1.getRow(0).getPhysicalNumberOfCells();
                                                for(int i=0;i<noOfColumn;i++)
                                                {
                                                                sdata=sh1.getRow(0).getCell(i).getStringCellValue();
                                                                aList.add(sdata);
                                                }
                                                fis.close();
                                                
                                }
                                catch (Exception e) {
                                                System.out.println(e.getMessage());
                                                sdata=null;
                                }
                                return aList;
                }

}
