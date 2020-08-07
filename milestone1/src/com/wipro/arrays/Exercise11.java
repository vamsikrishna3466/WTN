package com.wipro.arrays;

public class Exercise11 {

	public static void main(String[] args) {
		int []array=new int[] {1,1,1};
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			if(array[i]!=1&&array[i]!=4)
			{
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}

}
