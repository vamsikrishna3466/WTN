package com.wipro.exceptionhandling;
public class MathOperation {

	public static void main(String []args)throws Exception
	{
		int len=args.length;
		int []array=new int[len];
		int sum=0;
		int average;
		for(int index=0;index<len;index++)
		{
			array[index]=Integer.parseInt(args[index]);
		}
		for(int index=0;index<len;index++)
		{
			sum=sum+array[index];
		}
		average=sum/len;
		System.out.println("sum of elements "+sum);
		System.out.println("average of elements "+average);
	}

}
