package com.wipro.stringandstringbuffer;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String st=s.next();
	int i;
	for(i=0;i<st.length();i++)
	{
		if(st.charAt(i)=='*')
		{
			break;
		}
	}
	st=st.substring(0, i);
	System.out.println(st);
	s.close();
	}

}
