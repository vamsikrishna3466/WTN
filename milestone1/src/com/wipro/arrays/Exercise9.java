package com.wipro.arrays;

public class Exercise9 {

	public static void main(String[] args) {
int []array=new int[] {1,99,10};
int len=array.length;
int []array2=new int[len];
int h=0;

for(int i=0;i<len;i++)
{
	if(array[i]!=10)
	{
		array2[h++]=array[i];
	}	
}
for(int i=0;i<len;i++)
{
	if(i>=h)
	{
		array[i]=0;
	}
	array[i]=array2[i];
}
for(int i=0;i<len;i++)
{
	System.out.print(array[i]+" ");
}

	}

}
