package com.wipro.classesandobjects;
class Calculator
{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}
public class Exercise2 {

	public static void main(String[] args) 
	{
		if(args.length<=3)
		{
			System.out.println("enter four value");
		}
		else
		{
		int num1;
		int num2;
		double num3;
		int num4;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		num3=Double.parseDouble(args[2]);
		num4=Integer.parseInt(args[3]);
	System.out.println("power of num1 and num2 is "+Calculator.powerInt(num1,num2));
	System.out.println("power of num1 and num2 is "+Calculator.powerDouble(num3,num4));
		}
		}
}
