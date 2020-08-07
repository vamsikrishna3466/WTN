package com.wipro.flowcontrolstatements;

public class Exercise12 {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		if(number<=1)
		{
			System.out.println(number+" is not prime");
		}
		else
		{
			int checkpoint=(int)(Math.sqrt(number));
		for(int index=2;index<=checkpoint;index++)
		{
			if(number%index==0)
			{
				System.out.println(number+" is not prime");
				return;
			}
		}
		System.out.println(number+" is  prime");
		}
	}

}
