package com.wipro.arrays;

public class Exercise10 {

	public static void main(String[] args) {
		int []array=new int[] {2,2,2};
		int len=array.length;
		int []odd=new int[len];
		int []even=new int[len];
		int oindex=0;
		int eindex=0;
		int p;
		for(int i=0;i<len;i++)
		{
			p=array[i]&1;
			if(p==1)
			{
				odd[oindex++]=array[i];
			}
			else
			{
				even[eindex++]=array[i];
			}
		}
		int pl=0;
		for(int i=0;i<eindex;i++)
		{
			array[pl++]=even[i];
		}
		for(int i=0;i<oindex;i++)
		{
			array[pl++]=odd[i];
		}
		for(int i=0;i<pl;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		
	}

}
