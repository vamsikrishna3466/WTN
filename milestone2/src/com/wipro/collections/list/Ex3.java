package com.wipro.collections.list;
import java.util.*;
public class Ex3 {
	void printAll(List<String> arraylistobject)
	{
		Iterator<String> iteratorobject=arraylistobject.iterator();
		while(iteratorobject.hasNext())
		{
			System.out.println(iteratorobject.next());
		}
	}
	public static void main(String[] args) {
		List<String> arraylistobject=new ArrayList<>();
		arraylistobject.add("hii my name is vamsi krishna");
		arraylistobject.add("I am intersted in learning new things ");
		arraylistobject.add("I donot know when to give up");
		arraylistobject.add("I can do any thing , I am thop ");
		Ex3 ex3object=new Ex3();
		ex3object.printAll(arraylistobject);
	}

}
