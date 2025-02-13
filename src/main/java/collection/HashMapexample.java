package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Map is an interface
public class HashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("firstname", "Mujahid");
		map.put("lastname", "Shaik");
		map.put("Age", "30");
		 for (String key : map.keySet())
			 
		 {
			 System.out.println("The "+key+ " is "+map.get(key));
			 
		 }		 
		 Map<String,List<String>> map1= new HashMap<String,List<String>>();
		 List<String> listofemails = new ArrayList<String>();
		 listofemails.add("sandmujju@gmail.com");
		 listofemails.add("abc@xyz.com");
		 listofemails.add("cbgx@sdf.com");
		 
		 map1.put("emailadresses", listofemails);
		 for(String key1:map1.keySet())
		 {
			System.out.println(map1.get(key1)); 
		 }
		 
		
	}

}
