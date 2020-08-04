package com.wipro.collections.map;
import java.util.*;
class HashMapDemo
{
	HashMap<String,String> M1;
	HashMapDemo(HashMap<String,String> M1)
	{
		this.M1=M1;
	}
	void saveCountryCapital(String CountryName,String capital)
	{
		M1.put(CountryName, capital);
	}
	String getCapital(String CountryName)
	{
		return M1.get(CountryName);
	}
	String getCountry(String capital)
	{
		Set<?> s=M1.entrySet();
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
	HashMap<String,String> swapping()
	{
		HashMap<String,String> M2=new HashMap<>();
		Set hashmapset=M1.entrySet();
		Iterator iteratorobject=hashmapset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)iteratorobject.next();
			M2.put(map.getValue(), map.getKey());
		}
		return M2;
	}
	ArrayList<String> ArrayListCreation()
	{
		ArrayList<String> arraylistobject=new ArrayList<>();
		Set hashmapset=M1.entrySet();
		Iterator iteratorobject=hashmapset.iterator();
		while(iteratorobject.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)iteratorobject.next();
			arraylistobject.add(map.getKey());
		}
		return arraylistobject;
	}
}
public class Ex1 {

	public static void main(String[] args) {
		HashMap<String,String> hashmapobject=new HashMap<String,String>();
		HashMapDemo hashmapdemoobject=new HashMapDemo(hashmapobject);
		hashmapdemoobject.saveCountryCapital("India","Delhi");
		hashmapdemoobject.saveCountryCapital("japan","Tokyo");
		System.out.println(hashmapdemoobject.getCapital("japan"));
		System.out.println(hashmapdemoobject.getCountry("Delhi"));
		Map<String,String> secondmap=hashmapdemoobject.swapping();
		Set secondmapset=secondmap.entrySet();
		Iterator it=secondmapset.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String> map=(Map.Entry<String, String>)it.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
		List<String> countryobject=hashmapdemoobject.ArrayListCreation();
		Iterator arraylistiteratorobject=countryobject.iterator();
		while(arraylistiteratorobject.hasNext())
		{
			System.out.println(arraylistiteratorobject.next());
		}
		

	}

}
