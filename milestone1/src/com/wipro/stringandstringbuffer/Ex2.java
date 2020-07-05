package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex2 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);;
		try
		{
		String s1=s.next();
		String []st=s1.split(",");
		if(st[0].charAt(st[0].length()-1)==st[1].charAt(0))
		{
			System.out.println((st[0].substring(0,st[0].length())).toLowerCase()+(st[1].substring(1,st[1].length())).toLowerCase());
		}
		else
		{
			System.out.println(st[0].toLowerCase()+" "+st[1].toLowerCase());
		}
		}
		catch(Exception a)
		{
			System.out.println(a);
	}
		finally
		{
		s.close();
		}
	}

}
