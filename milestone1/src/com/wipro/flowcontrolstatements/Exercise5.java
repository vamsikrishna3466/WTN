package com.wipro.flowcontrolstatements;

public class Exercise5 {
 public static void main(String[] args) {
	char value='*';
	if(value>='1'&&value<='9')
	{
		System.out.println("Digit");
	}
	else if((value>='A'&&value<='Z')||(value>='a'&&value<='z'))
	{
		System.out.println("Alphabet");
	}
	else
	{
		System.out.println("Special Character");
	}
}
}
