package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.substring(1,s.length()-1));
		sc.close();
	}

}
