package com.wipro.flowcontrolstatements;
public class Exercise1A {
	public static void main(String []arg)
	{
	int number=Integer.parseInt(arg[0]);
	String value="The number ";
	if(number==0)
	{
		System.out.println(value+" is zero");
	}
	else if(number>0)
	{
		System.out.println(value+number+" is posistive");
	}
	else
	{
		System.out.println(value+number+" is negative");
	}
	
	}

}
