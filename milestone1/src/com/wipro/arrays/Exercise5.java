package com.wipro.arrays;

public class Exercise5 {

	public static void main(String[] args) {
		int []array=new int[] {1,56,788,456,22,33,137};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			if(max1<array[i])
			{
				max1=array[i];
			}
			if(max2<array[i]&&max1!=array[i])
			{
				max2=array[i];
			}
			if(min1>array[i])
			{
				min1=array[i];
			}
			if(min2>array[i]&&min1!=array[i])
			{
				min2=array[i];
			}
		}
		System.out.println("first maximum is "+max1);
		System.out.println("second maximum is "+max2);
		System.out.println("first minimum is "+min1);
		System.out.println("second minimum is "+min2);
		
		
	

	}

}
