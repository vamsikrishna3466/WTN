package com.wipro.collections.list;
import java.util.*;
public class Ex4 {

	public static void main(String[] args)
	{
		List<Number> arraylistobject=new ArrayList<>();
		arraylistobject.add(1);
		arraylistobject.add(2133.33);
		arraylistobject.add(1111.32f);
		for(Number n:arraylistobject)
		{
			System.out.println(n);
		}
		
	}

}
