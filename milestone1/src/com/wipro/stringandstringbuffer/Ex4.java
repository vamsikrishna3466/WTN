package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		if((len&1)==1)
		{
			System.out.println("null");
		}
		else
		{
			System.out.println(s.substring(0,(len/2)));
		}
		sc.close();
	}

}
