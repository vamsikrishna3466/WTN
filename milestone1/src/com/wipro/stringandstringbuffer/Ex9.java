package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String a,b;
		a=s.next();
		b=s.next();
		int l1=a.length();
		int l2=b.length();
		int mini;
		if(l1>l2) 
			mini=l2;
		else
			mini=l1;
		String c="";
		for(int i=0;i<mini;i++)
			c=c+a.charAt(i)+b.charAt(i);
		if(mini==l1)
		{
		c=c+b.substring(mini,l2);
		}
		else
		{
			c=c+a.substring(mini,l1);
		}
		System.out.println(c);
		s.close();
		
	}

}
