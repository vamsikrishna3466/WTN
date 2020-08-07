package com.wipro.arrays;

public class Exercise3 {
	public static void main(String[] args) {
		int []array=new int[] {23,34,1,566,76,654,233};
		int len=array.length;
		int key=Integer.parseInt(args[0]);
		for(int i=0;i<len;i++)
		{
			if(array[i]==key)
			{
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}

}
