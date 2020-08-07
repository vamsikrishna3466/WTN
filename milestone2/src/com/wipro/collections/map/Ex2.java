package com.wipro.collections.map;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		Map<String,String> hashmapobject=new HashMap<String,String>();
		hashmapobject.put("India","Delhi");
		hashmapobject.put("USA","Washington");
		Scanner scannerobject=new Scanner(System.in);
		String key,value;
		System.out.println("Enter the key to check");
		key=scannerobject.next();
		if(hashmapobject.containsKey(key))
		System.out.println("Key is present");
		else
		System.out.println("Key is not present");
		
		System.out.println("Enter the value to check");
		value=scannerobject.next();
		if(hashmapobject.containsValue(value))
			System.out.println("Value is present");
			else
			System.out.println("Value is not present");
		Set setobject=hashmapobject.entrySet();
		Iterator iteratorobject=setobject.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String, String> map=(Map.Entry<String, String>)iteratorobject.next();
			System.out.println(map.getKey()+"  "+map.getValue());
		}
	}

}
