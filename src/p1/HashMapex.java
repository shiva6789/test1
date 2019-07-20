package p1;
import java.util.HashMap;
public class HashMapex {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap =new HashMap<Integer,String>();
		HashMap<Integer, String> hMap1 =new HashMap<Integer,String>();
		hMap.put(1,"Ramesh");
		hMap.put(2,"Mahesh");
		hMap.put(1,"Ganesh");
		hMap.putIfAbsent(3,"abcd");		
		System.out.println(hMap);
		hMap1.putAll(hMap);
		hMap.remove(1);
		System.out.println(hMap);
		System.out.println(hMap.keySet());
		hMap.replace(2,"Mahesh","Mahesh1");
		System.out.println(hMap);
		
		

	}

}
