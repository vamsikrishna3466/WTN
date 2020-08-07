package com.wipro.collections.list;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		List<String> linkedlistobject=new LinkedList<>();
		linkedlistobject.add("Januvary");
		linkedlistobject.add("February");
		linkedlistobject.add("March");
		linkedlistobject.add("April");
		linkedlistobject.add("May");
		linkedlistobject.add("June");
		linkedlistobject.add("July");
		linkedlistobject.add("August");
		linkedlistobject.add("September");
		linkedlistobject.add("October");
		linkedlistobject.add("November");
		linkedlistobject.add("December");
		Iterator<String> iteratorobject=linkedlistobject.iterator();
		while(iteratorobject.hasNext())
		{
			System.out.println(iteratorobject.next());
		}
		}

	}


