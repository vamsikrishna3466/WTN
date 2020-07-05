package com.wipro.arrays;

public class Exercise13 {

	public static void main(String[] args) {
		if(args.length<=3)
		{
			System.out.println("Please enter 4 integer numbers");
		}
		else
		{
			int p=0;
			int [][]array=new int[2][2];
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					array[i][j]=Integer.parseInt(args[p++]);
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The reverse of an array is :");
			for(int i=1;i>=0;i--)
			{
				for(int j=1;j>=0;j--)
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			

		}
	}

}
