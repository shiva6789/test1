package p1;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example ex1 =new Example();
		Example ex2 = new Example();
		Example ex3 = new Example();
	}

}



class Example
{
static int x=6;
int y =6;
public Example()

{
	x++;
	y++;
System.out.println("value of x is "+x);
		System.out.println("value of y is"+y);
}




}