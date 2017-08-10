/*
	HASH_MAP:
				It will arrange the data in ascending order by default.
				Only one null value is acceptable.
				Can have duplicate value.

*/

import java.util.*;


class HashM
{
	public static void main(String args[])
	{
		// This is how we declare hash map
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();					// HashMap<key,value>
		
		hm.put(12,"Aman");											// Syntax: object.put(key,data/value);	
		hm.put(3,"Akhil");											// key is used to identify the data	(they cannot be same)
		hm.put(5,"Aman");											//here  key is Integer value(it can also be of different data types)
		
		/*
		
		//using Iterator
		
		Set s=a.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry)it.next();
			
			System.out.println("Key is: " + m.getKey() + "and Value is: " + m.getValue());
			
		}
		
		*/
		
			//using for-each loop
			
			for(Map.Entry m:hm.entrySet())
			{
				System.out.println("Key is: " + m.getKey() + "and Value is: " + m.getValue());
			}
		
		
		/*
			//remove a record
			
			
		*/
	}
}