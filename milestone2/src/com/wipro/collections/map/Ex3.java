package com.wipro.collections.map;
import java.util.*;
class Properties
{
	Map<String,String> hashmapobject=new HashMap<String,String>();
	void saveState(String state,String captial)
	{
		hashmapobject.put(state, captial);
	}
	void print()
	{
		Set hashmapset=hashmapobject.entrySet();
		Iterator iteratorobject=hashmapset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)iteratorobject.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}
public class Ex3 {

	public static void main(String[] args) 
	{
		Properties propertiesobject=new Properties();
		propertiesobject.saveState("Andhra Pradhesh","Amaravati");
		propertiesobject.saveState("Telegana","Hyderabad");
		propertiesobject.print();
	}

}
