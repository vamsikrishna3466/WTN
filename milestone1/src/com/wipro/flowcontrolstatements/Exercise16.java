package com.wipro.flowcontrolstatements;

public class Exercise16 {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Enter the integer number");
		}
		else
		{
			int number=Integer.parseInt(args[0]);
				int reversenumber=0;
				while(number>0)
				{
					reversenumber=reversenumber*10+(number%10);
				number/=10;
				}
					System.out.println(reversenumber);
		}
				
		}
	}


