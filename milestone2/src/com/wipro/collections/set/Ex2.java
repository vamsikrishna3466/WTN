package com.wipro.collections.set;
import java.util.*;
public class Ex2 {

	public static void main(String[] args)
	{
		Set<String> hashsetobject=new HashSet<>();
		hashsetobject.add("vamsi");
		hashsetobject.add("krishna");
		Iterator iteratorobject=hashsetobject.iterator();
		while(iteratorobject.hasNext())
		{
			System.out.println(iteratorobject.next());
		}
	}

}
