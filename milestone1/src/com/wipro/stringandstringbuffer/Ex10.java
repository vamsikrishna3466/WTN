package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s3="";
		String []s2=s1.split(",");
		int n=Integer.parseInt(s2[1]);
		for(int i=1;i<=n;i++)
		{
			s3=s3+s2[0].substring(n-1);
		}
		System.out.println(s3);
		s.close();
	}
}
