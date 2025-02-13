package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//set is not oredered, does not accept duplicate values
//

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet<String> set = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		
		set.add("Mujahid");
		set.add("Soniya");
		set.add("Nouman");
		set.add("Mujahid");
		
		
		System.out.println(set);
		
		for(String value:set)
		{
			System.out.println(value);
		}
		
		Iterator<String> ite= set.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());//next method returns object in that
		}
		

	}

}
