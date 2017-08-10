// HASH_SET

import java.util.*;

public class HashSet
{
	public static void main(String... ar)
	{
		HashSet a=new HashSet();
		
		a.add("Arvind");
		a.add("Amit");
		a.add("Gaurav");
		
		/*
		for(Object o:ab)
		{
			System.out.println(o);
		}
		*/
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	
}