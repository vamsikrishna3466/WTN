package com.wipro.flowcontrolstatements;

public class Exercise1B {
public static void main(String []args)
{
	int firstnumber;
	int secondnumber;
	firstnumber=Integer.parseInt(args[0]);
	secondnumber=Integer.parseInt(args[1]);
	if(firstnumber%10==secondnumber%10)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");	
	}
}
}
