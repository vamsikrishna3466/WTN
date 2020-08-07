package com.wipro.collections.list;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) 
	{
		List<String> arraylistobject=new ArrayList<>();
		arraylistobject.add("Januvary");
		arraylistobject.add("February");
		arraylistobject.add("March");
		arraylistobject.add("April");
		arraylistobject.add("May");
		arraylistobject.add("June");
		arraylistobject.add("July");
		arraylistobject.add("August");
		arraylistobject.add("September");
		arraylistobject.add("October");
		arraylistobject.add("November");
		arraylistobject.add("December");
		Iterator<String> iteratorobject=arraylistobject.iterator();
		while(iteratorobject.hasNext())
		{
			System.out.println(iteratorobject.next());
		}
		}

}
