package collection;

import java.util.ArrayList;
import java.util.Iterator;
//List can be added with duplicate values
//list values are preserved , preserved in the sequence of their addition
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		System.out.println(list);
		list.add(10);
		list.add("Mujahid");
		list.add(10.2);
		list.add("Mujahid");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list.size());
		
		for (Object var:list)//Object is used as it is a super class of all class since we do not know type of each element in list
		{
			System.out.println(var);
		}
		
		Iterator ite= list.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());//next method returns object in that
		}
		
		
	}

}
