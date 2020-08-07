package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scannerobject=new Scanner(System.in);
		String value;
		value=scannerobject.nextLine();
		int len=value.length();
		for(int i=0;i<len/2;i++)
		{
			if(value.charAt(i)!=value.charAt(len-i-1))
			{
				System.out.println("Not Palindrome");
				return;
			}
		}
		System.out.println("palindrome");
		scannerobject.close();
		
	}

}
