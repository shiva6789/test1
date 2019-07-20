package p1;

public class Sbi implements Bank  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sbi obj =new Sbi ();
obj.withdraw(500);

	}
	
	int balance =1000;
	
@Override 
public void withdraw(int amount) {
	
	balance =balance-amount;
	System.out.println("remaining balance is "+balance);
}
	@Override 
	public void deposit(int amount) {
		
		balance =balance+amount;
		System.out.println("remaining balance "+balance);
}
}
