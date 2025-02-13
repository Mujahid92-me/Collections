package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
//Reflection can be used to get info of a class, like method names, number of methods, we can even get information of private methods inside a
//class using reflection
//whenever a method is called the automatically method info is stored in Method class
//get return types by using getreturntype
public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		Class clazz = t.getClass();
		;
		System.out.println(clazz.getSimpleName());
		clazz.getDeclaredMethods();
		Method[] arrayOfMethods = clazz.getDeclaredMethods();
		System.out.println(arrayOfMethods.length);
		System.out.println(clazz.getMethods().length);//innclude methods inherited from parent class
		
		Constructor[] con = clazz.getDeclaredConstructors();
		
		for (Constructor cons:con)
		{
				System.out.println("constructor name  "+cons.getName());
		}
		
		
		for(Method m:arrayOfMethods)
		{
			System.out.println(m.getName()+m.getReturnType());
			System.out.println(m.getParameters());
			Parameter[] par = m.getParameters();
			for(Parameter params:par)
			{
				System.out.println(params.getName());
			}
			
			
		}
		
	}

}
