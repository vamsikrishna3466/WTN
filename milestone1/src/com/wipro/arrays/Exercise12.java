package com.wipro.arrays;

public class Exercise12 {

	public static void main(String[] args) {
	int []array1=new int[] {1,2,3};
	int []array2=new int[] {4,5,6};
	int []output=new int[2];
	output[0]=array1[1];
	output[1]=array2[1];
	for(int i=0;i<2;i++)
	{
		System.out.print(output[i]+" ");
	}
	}
}
