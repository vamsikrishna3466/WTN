package com.wipro.collections.list;

import java.util.*;

public class Ex6 
{
	public static void main(String[] args) {
		List<String> vectorobject=new Vector<>();
		vectorobject.add("Januvary");
		vectorobject.add("February");
		vectorobject.add("March");
		vectorobject.add("April");
		vectorobject.add("May");
		vectorobject.add("June");
		vectorobject.add("July");
		vectorobject.add("August");
		vectorobject.add("September");
		vectorobject.add("October");
		vectorobject.add("November");
		vectorobject.add("December");
		Iterator<String> iteratorobject=vectorobject.iterator();
		while(iteratorobject.hasNext())
		{
			System.out.println(iteratorobject.next());
		}
		}


}
