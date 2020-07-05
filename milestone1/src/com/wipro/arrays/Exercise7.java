package com.wipro.arrays;

import java.util.Arrays;

public class Exercise7 {

	public static void main(String[] args) {
		int []array1=new int[] {4,5,4,7,8,45,3,7,8,87,8};
		int len1=array1.length;
		int []array2=new int[len1];
		int h=0;
		for(int i=0;i<len1;i++)
		{
			if(array1[i]!=Integer.MIN_VALUE)
			{
				array2[h++]=array1[i];
			for(int j=i+1;j<len1;j++)
			{
				if(array1[i]==array1[j])
				{
					array1[j]=Integer.MIN_VALUE;
				}
			}
			}
		}
			array1=Arrays.copyOf(array2, h);
			for(int i1=0;i1<h;i1++)
			{
				System.out.print(array1[i1]+" ");
			}
		}
	}

