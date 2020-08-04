package com.wipro.collections.set;
import java.util.*;
class HashSetDemo
{
	HashSet<String> H1;
	HashSetDemo(HashSet<String> H1)
	{
		this.H1=H1;
	}
	void saveCountryNames(String CountryName)
	{
		H1.add(CountryName);
	}
	String getCountry(String CountryName)
	{
		if(H1.contains(CountryName))
			return CountryName;
		else
			return null;
	}
}
public class Ex1 {

	public static void main(String[] args)
	{
		HashSet<String> hashsetobject=new HashSet<>();
		HashSetDemo hashsetdemoobject=new HashSetDemo(hashsetobject);
		hashsetdemoobject.saveCountryNames("India");
		hashsetdemoobject.saveCountryNames("USA");
		if(hashsetdemoobject.getCountry("US")==null)
		{
			System.out.println("country is not present");
		}
		else
		{
			System.out.println("country is present");
		}
	}

}
