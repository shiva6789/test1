//package p1;
//
//public class Arrayex {
//
//	public static void main(String[] args) {
//		int [] arr =new int[5];
//		int sumAge =0;
//		int [] arr1 = {10,20,30,40};
//		int[] empAge = {20,31,45,55,66,32,45,35,60};
//		//System.out.println(arr1.length);
//		//System.out.println(arr1[0]);
//		for(int i=0;i<empAge.length;i++)
//		{
//			sumAge=sumAge+empAge[i];
//		}
//		int avgAge =sumAge/empAge.length;
//		System.out.println(avgAge);
//		}
//		}
//				

package p1;

public class Arrayex {

	public static void main(String[] args) {
		int [] arr =new int[5];
		int sumAge =0;
		int oddCounter =0;
		int evenCounter =0;
		int [] arr1 = {10,20,30,40};
		int[] empAge = {20,31,45,55,66,32,45,35,60};
		int arrLength =empAge.length;
		
		for(int i=0;i<arrLength;i++)
		{
			
			if(empAge[i]%2==0)
			{
				evenCounter++;
			}
			else
			{
				oddCounter++;
			}
			}
		}
		
		System.out.println("even count is "+evenCounter);
		System.out.println("odd count is "+oddCounter);
}