package com.wipro.collections.map;
import java.util.*;
class TreeMapDemo
{
	TreeMap<String,String> TM1;
	TreeMapDemo(TreeMap<String,String> TM1)
	{
		this.TM1=TM1;
	}
	void saveCountryCapital(String CountryName,String capital)
	{
		TM1.put(CountryName, capital);
	}
	String getCapital(String CountryName)
	{
		return TM1.get(CountryName);
	}
	String getCountry(String capital)
	{
		Set<?> s=TM1.entrySet();
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
	TreeMap<String,String> swapping()
	{
		TreeMap<String,String> TM2=new TreeMap<>();
		Set hashmapset=TM1.entrySet();
		Iterator iteratorobject=hashmapset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)iteratorobject.next();
			TM2.put(map.getValue(), map.getKey());
		}
		return TM2;
	}
	ArrayList<String> ArrayListCreation()
	{
		ArrayList<String> arraylistobject=new ArrayList<>();
		Set hashmapset=TM1.entrySet();
		Iterator iteratorobject=hashmapset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)iteratorobject.next();
			arraylistobject.add(map.getKey());
		}
		return arraylistobject;
	}
}
public class Ex5 {

	public static void main(String[] args) 
	{
		TreeMap<String,String> treemapobject=new TreeMap<String,String>();
		TreeMapDemo treemapdemoobject=new TreeMapDemo(treemapobject);
		treemapdemoobject.saveCountryCapital("India","Delhi");
		treemapdemoobject.saveCountryCapital("japan","Tokyo");
		treemapdemoobject.saveCountryCapital("USA","Washington");
		System.out.println(treemapdemoobject.getCapital("japan"));
		System.out.println(treemapdemoobject.getCountry("Delhi"));
		Map<String,String> secondmap=treemapdemoobject.swapping();
		Set secondmapset=secondmap.entrySet();
		Iterator it=secondmapset.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)it.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
		List<String> countryobject=treemapdemoobject.ArrayListCreation();
		Iterator arraylistiteratorobject=countryobject.iterator();
		while(arraylistiteratorobject.hasNext())
		{
			System.out.println(arraylistiteratorobject.next());
		}
	
	}

}
