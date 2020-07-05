package com.wipro.flowcontrolstatements;

public class Exercise13 {

	public static void main(String[] args) {
		int temporary[]=new int[100];
		for(int i=3;i<=99;i=i+2)
		{
			temporary[i]=1;
		}
		temporary[2]=1;
		for(int number=3;number<=99;number++)
		{
			
			if(number%2!=0&&temporary[number]!=0)
			{
				for(int j=number*number;j<=99;j=j+number)
				{
					temporary[j]=0;
				}
			}
		}
		
		System.out.println("The prime numbers between 10 and 99 is:");
		for(int i=10;i<=99;i++)
		{
			if(temporary[i]==1)
			{
			System.out.print(i+"\t");
			}
		}
		
		
	}

}
