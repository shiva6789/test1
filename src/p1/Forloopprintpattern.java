package p1;

public class Forloopprintpattern {

	public static void main(String[] args) {
				int number =9;
				int i,j;
				
				for( i=1;i<=number;i++)
				{
					for (j=1;j<=i;j++)
					{
						System.out.print(j);
					}
					System.out.println("");
				}
	}
}