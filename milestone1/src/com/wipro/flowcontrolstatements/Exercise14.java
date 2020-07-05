package com.wipro.flowcontrolstatements;

public class Exercise14 {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("enter the number");
		}
		else
		{
			int number=Integer.parseInt(args[0]);
			int sumofdigits=0;
			while(number>0)
			{
				sumofdigits=sumofdigits+(number%10);
				number/=10;
			}
			System.out.println(sumofdigits);
		}

	}

}
