package p1;

public class Gradingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark =80;
		String grade ="";
		mark =mark/10;
		switch (mark)
		{case 9:
			grade ="O";
			break;
		case 8:
			grade ="E";
			break;
		case 7:
			grade ="A";
			break;
		case 6:
			grade ="B";
			break;
		case 5:
			grade ="C";
			break;
		default:
			grade ="F";
			break;
			
		}
		System.out.println("grade is " +grade);
			
		}
		
		
}

