package com.wipro.collections.set;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) 
	{
		Set<String> treesetobject=new TreeSet<>();
		treesetobject.add("vamsi");
		treesetobject.add("krishna");
		treesetobject.add("abcd");
		Set<String> reverseset=((TreeSet<String>) treesetobject).descendingSet();
		Iterator iteratorobject=reverseset.iterator();
		while(iteratorobject.hasNext())
		{
			System.out.println(iteratorobject.next());
		}
		System.out.println("checking whether abc is present in tree set or not "+treesetobject.contains("abc"));
	}

}
