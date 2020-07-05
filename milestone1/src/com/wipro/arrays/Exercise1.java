package com.wipro.arrays;

public class Exercise1 {
	public static void main(String args[]) {
	int []elements=new int[] {1,2,3,4,5};
	int len=elements.length;
	int sum=0;
	for(int i=0;i<len;i++)
	{
		sum=sum+elements[i];
	}
	System.out.println("The sum of elements in array is "+sum);
	System.out.println("The average of elements in the array is "+(sum/len));
	}

}
