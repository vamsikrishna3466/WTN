package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		if(s1.charAt(0)=='x')
		{
			s1=s1.substring(1);
		}
		if(s1.charAt(s1.length()-1)=='x')
		{
			s1=s1.substring(0,s1.length()-1);
		}
		System.out.println(s1);
		s.close();
	}

}
