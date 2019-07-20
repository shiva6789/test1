package p1;

import java.io.FileNotFoundException;

public class throwsex {

	public static void main(String[] args) {
		int z=0;
		try
		{
			validateFilePath("d:\\mef");
			int[] arr1={10,20,30,40};
			System.out.println(arr1[4]);
	int x= 10;
	int y =0;
	
		}
		catch (ArithmeticException e)
		{
			System.out.println("devide by zero exception cought "+e.getMessage());
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index exception caught"+e.getMessage());
		}
		catch(Exception e)
		{		
			System.out.println("Arry Index Exception caught"+e.getMessage());
		}
	System.out.println("value of z is"+z);
	System.out.println("hell0");
	}
	public static void validateFilePath (String filePath) throws FileNotFoundException
	{
	
		if(filePath.contains("c:"))
		{
			throw new FileNotFoundException ("Path must belongs to C drive");
		}
		
		}
	
}
