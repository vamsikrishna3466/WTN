package com.wipro.wrapperclasses;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args)
	{
		Scanner scannerobject=new Scanner(System.in);
		int value=scannerobject.nextInt();
		String str="";
		String s="";
		while(value>0)
		{
			str=str.concat(value%2+"");
			value=value/2;
		}
		StringBuilder sb=new StringBuilder(str);
		str=new String(sb.reverse());
		for(int i=str.length();i<8;i++)
		{
			s=s.concat("0");
		}
		System.out.println(s.concat(str));
		scannerobject.close();
	}

}
