package p1;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
	HashSet<String> setvalue =new HashSet <String>();
	
	setvalue.add("Hello");
	setvalue.add("Hello1");
	setvalue.add("Hello");
	setvalue.add("null");
	setvalue.add("null");
	System.out.println(setvalue.size());
	//1st way
	Iterator <String> itr =setvalue.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	///2nd way
	
	for(String val : setvalue)
		
	{
		System.out.println(val);
	}
}
 }
	
	
			