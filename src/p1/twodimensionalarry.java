package p1;

public class twodimensionalarry {

	public static void main(String[] args) {
		// 1 way of declaration
		
		int [] [] arr =new int[5] [3];
		
		//1 st way of declaration (declare+initialize)
		int[][] empDeptAge = {{20,31,45},{55,66,32},{45,35,60}};
		System.out.println(empDeptAge[0].length);
		
		for (int i=0;i<empDeptAge.length;i++)
		{
			for (int j=0;j<empDeptAge[i].length;j++)
{
	System.out.println(empDeptAge [i][j]);
}
		}
	}

}
