package com.wipro.flowcontrolstatements;

public class Exercise2 {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int check=number&1;
		String temp="The number ";
		if(check==1)
		{
			System.out.println(temp+number+" is odd");
		}
		else
		{
			System.out.println(temp+number+" is even");
		}
	}

}
