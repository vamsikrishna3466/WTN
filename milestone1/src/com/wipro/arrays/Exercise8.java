package com.wipro.arrays;

public class Exercise8 {
	public static void main(String[] args) {
		int []array=new int[] {1,6,4,7,9};
		int len=array.length;
		int flag=0;
		int s2=0;
		int s1=0;
		for(int i=0;i<len;i++)
		{
			s1+=array[i];
			if(array[i]==6)
			{
				flag=1;
			}
				if(flag==1)
			{
				s2=s2+array[i];
				if(array[i]==7)
				{
					s1=s1-s2;
					flag=0;
				}
			}
		 }
		System.out.println(s1);
	}

}
