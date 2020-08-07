package com.wipro.flowcontrolstatements;

public class Exercise7 {

	public static void main(String[] args) {
	char alphabet='v';
	System.out.println((int)('a'));
	System.out.println((int)('z'));
	System.out.println((int)('A'));
	if(alphabet>='a'&&alphabet<='z')
	{
		System.out.println(alphabet+"->"+(char)(alphabet-32));
	}
	else
	{
		System.out.println(alphabet+"->"+(char)(alphabet+32));
		
	}
		
	}

}
