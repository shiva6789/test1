package p1;

public class Pallindrum {

	public static void main(String[] args) {
		String test ="madam";
		boolean matches=true;
		
//		//1st way
//		SringBuffer sbf=new StringBuffer(test);
//		String testReverse =sbf.reverse().toString();
//		if(test.equals(testReverse))
//		{
//			System.out.println("string is pallindrum");
//		}
//		else 
//		{
//			System.out.println("not a pallindrum");
//		}
		
		//2nd way
		
		
		for(int i=0;i<test.length()/2;i++)
		{
			if(test.charAt(i)==test.charAt(test.length()-(i+1)))
{
	}
else
	{
	matches=false;
	break;
	
	}
	
		}
		
		if(matches==true)
		{
			System.out.println("string is pallindrum");
		}
		else
		{
			System.out.println("string is not pallindrum");
		}
		

	}

}
