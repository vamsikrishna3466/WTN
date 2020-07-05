package com.wipro.exceptionhandling;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) 
	{
		int number;
		int posistion;
		System.out.println("Enter the number of elements in array");
		Scanner scannerobject=new Scanner(System.in);
		try
		{
		number=scannerobject.nextInt();
		int []array=new int[number];
		System.out.println("Enter the elements in the array");
		for(int index=0;index<number;index++)
		{
			array[index]=Integer.parseInt(scannerobject.next());
		}
		System.out.println("Enter the index element where you want to access");
		posistion=scannerobject.nextInt();
		System.out.println("THe array element at index "+posistion+" = "+array[posistion]);
		System.out.println("The array element successfully accessed");
		}
		catch(NumberFormatException object)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException object)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
	}
	

}
