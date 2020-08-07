package com.wipro.flowcontrolstatements;

public class Exercise3 {
	public static void main(String[] args) {
		int len=args.length;
		if(len==0)
		{
			System.out.println("No Values");
		}
		else
		{
			int index;
			for(index=0;index<len-1;index++)
			{
				System.out.print(args[index]+",");
			}
			System.out.print(args[index]);
		}
	}

}
