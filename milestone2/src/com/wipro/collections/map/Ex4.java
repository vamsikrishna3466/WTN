package com.wipro.collections.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class ContactList
{
	Map<String,Long> hashmapobject=new HashMap<String,Long>();
	void saveContact(String name,Long mobile)
	{
		hashmapobject.put(name,mobile);
	}
	boolean checkName(String name)
	{
		return hashmapobject.containsKey(name);
	}
	boolean checkMobile(Long mobile)
	{
		return hashmapobject.containsValue(mobile);
	}
	void print()
	{
		Set hashmapset=hashmapobject.entrySet();
		Iterator iteratorobject=hashmapset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,Long> map=(Map.Entry<String,Long>)iteratorobject.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}

public class Ex4
{
	public static void main(String[] args) 
	{
	ContactList contactlistobject=new ContactList();
	contactlistobject.saveContact("Vamsi Krishna",7675966931l);
	contactlistobject.saveContact("Narasimharo",9966239639l);
	System.out.println("checking  name vamsikrishna is there or not "+contactlistobject.checkName("Vamsi Krishna"));
	System.out.println("checking  name krishna is there or not "+contactlistobject.checkName("Krishna"));
	System.out.println("checking  mobile number  is there or not "+contactlistobject.checkMobile(865359635l));
	contactlistobject.print();
	}
}
