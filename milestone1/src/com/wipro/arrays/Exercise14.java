package com.wipro.arrays;

public class Exercise14 {

	public static void main(String[] args) {
		int len=args.length;
		if(len<9)
		{
			System.out.println("Please enter 9 integer numbers");
		}
		else
		{
			int [][]array=new int[3][3];
			int p=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					array[i][j]=Integer.parseInt(args[p++]);
				}
			}
			int maximum=Integer.MIN_VALUE;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(array[i][j]>maximum)
						maximum=array[i][j];
				}
			}
			System.out.println("The biggest number in the given array is "+maximum);
		}
	}

}
