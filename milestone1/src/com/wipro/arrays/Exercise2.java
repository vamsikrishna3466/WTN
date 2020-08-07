package com.wipro.arrays;

public class Exercise2 {

	public static void main(String[] args) {
		int array[]=new int[] {23,34,56,1,87,445};
		int maxvalue=array[0];
		int minvalue=array[0];
		int len=array.length;
		for(int i=1;i<len;i++)
		{
			if(maxvalue<array[i])
				maxvalue=array[i];
			if(minvalue>array[i])
				minvalue=array[i];
		}
		System.out.println("The maximum value  in the array is "+maxvalue);
		System.out.println("The minimum value  in the array is "+minvalue);
	}

}
