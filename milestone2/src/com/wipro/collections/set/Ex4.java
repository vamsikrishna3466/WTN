package com.wipro.collections.set;
import java.util.*;
class TreeSetDemo
{
	TreeSet<String> H1;
	TreeSetDemo(TreeSet<String> H1)
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
public class Ex4 {

	public static void main(String[] args)
	{
		
		TreeSet<String> treesetobject=new TreeSet<>();
		TreeSetDemo treesetdemoobject=new TreeSetDemo(treesetobject);
		treesetdemoobject.saveCountryNames("India");
		treesetdemoobject.saveCountryNames("USA");
		if(treesetdemoobject.getCountry("US")==null)
		{
			System.out.println("country is not present");
		}
		else
		{
			System.out.println("country is present");
		}
	}


	}


