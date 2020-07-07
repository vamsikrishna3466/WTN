package com.wipro.javaio;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Ex3 {
	public static void main(String[] args) throws Exception
	{
		try(FileReader fr=new FileReader("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\javaio\\"+args[0]);
				BufferedReader br=new BufferedReader(fr);
				FileWriter fw=new FileWriter("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\javaio\\"+args[1])
				)
		{
			SortedMap<String,Integer> hm=new TreeMap<>();
			while(true)
			{
				String s=br.readLine();
				if(s==null)
					break;
				String []obj=s.split(" ");
				for(String so:obj)
				{
					if(hm.containsKey(so))
						hm.put(so,hm.get(so)+1);
					else
						hm.put(so,1);
				}
		}
			for(Map.Entry<String, Integer> entry:hm.entrySet())
			{
				fw.write(entry.getKey()+" : "+entry.getValue()+"\n");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		
		
			}

}
