package com.wipro.collections.map;
import java.util.*;
class HashTableDemo
{
	Hashtable<String,String> HT;
	HashTableDemo(Hashtable<String,String> HT)
	{
		this.HT=HT;
	}
	void saveCountryCapital(String CountryName,String capital)
	{
		HT.put(CountryName, capital);
	}
	String getCapital(String CountryName)
	{
		return HT.get(CountryName);
	}
	String getCountry(String capital)
	{
		Set<?> s=HT.entrySet();
		String st="Country not found";
		Iterator<?> it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String,String>)it.next();
			if(map.getValue().equalsIgnoreCase(capital))
			{
				st=map.getKey();
				break;
			}
		}
		return st;
	}
	Hashtable<String,String> swapping()
	{
		Hashtable<String,String> HT2=new Hashtable<>();
		Set hashmapset=HT.entrySet();
		Iterator iteratorobject=hashmapset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)iteratorobject.next();
			HT2.put(map.getValue(), map.getKey());
		}
		return HT2;
	}
	ArrayList<String> ArrayListCreation()
	{
		ArrayList<String> arraylistobject=new ArrayList<>();
		Set hashtableset=HT.entrySet();
		Iterator iteratorobject=hashtableset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)iteratorobject.next();
			arraylistobject.add(map.getKey());
		}
		return arraylistobject;
	}
}
public class Ex6 {

	public static void main(String[] args) 
	{
		Hashtable<String,String> hashtableobject=new Hashtable<String,String>();
		HashTableDemo hashtabledemoobject=new HashTableDemo(hashtableobject);
		hashtabledemoobject.saveCountryCapital("India","Delhi");
		hashtabledemoobject.saveCountryCapital("japan","Tokyo");
		hashtabledemoobject.saveCountryCapital("USA","Washington");
		System.out.println(hashtabledemoobject.getCapital("japan"));
		System.out.println(hashtabledemoobject.getCountry("Delhi"));
		Map<String,String> secondmap=hashtabledemoobject.swapping();
		Set secondmapset=secondmap.entrySet();
		Iterator it=secondmapset.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)it.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
		List<String> countryobject=hashtabledemoobject.ArrayListCreation();
		Iterator arraylistiteratorobject=countryobject.iterator();
		while(arraylistiteratorobject.hasNext())
		{
			System.out.println(arraylistiteratorobject.next());
		}
	
	}

}
