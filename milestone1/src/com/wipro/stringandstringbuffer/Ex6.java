package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	if(s1.length()>s2.length())
		System.out.println(s2+s1+s2);
	else
		System.out.println(s1+s2+s1);
	s.close();
	}

}
