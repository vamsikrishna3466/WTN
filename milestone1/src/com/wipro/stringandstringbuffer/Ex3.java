package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String s1="";
		for(int i=1;i<=n;i++)
		{
			s1=s1.concat(Character.toString(s.charAt(0)));
			s1=s1.concat(Character.toString(s.charAt(1)));
		}
		System.out.println(s1);
		sc.close();
	}

}
