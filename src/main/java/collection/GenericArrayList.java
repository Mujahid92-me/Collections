package collection;

import java.util.ArrayList;
import java.util.List;
//Arraylist generally can store different data types or object types like Integer,Boolean, but if we want to convert these 
//values to primitive data types then we might face type casting issues as we dont know which object type it is
// that is why we have generics in the belo fashion
public class GenericArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(99);
		
		int i = list.get(0);//we dont get type casting issues here as we know all are Integer types.
		
	}
}
