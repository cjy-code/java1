package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args ) {
		
//		ArrayList<String> set = new ArrayList<String>();
		HashSet<String> hash = new HashSet<String>();
		
		/*set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		*/
		
	
		hash.add("이순신");
		hash.add("김유신");
		hash.add("강감찬");
		hash.add("이순신");
		
		Iterator ir = hash.iterator();
		
		
		while(ir.hasNext()) {
			String str = (String) ir.next();
			System.out.println(str);
		}
		
		
		
//		System.out.println(set);
//	    System.out.println(hash);
	
	}

}
