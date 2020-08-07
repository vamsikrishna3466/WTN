package com.wipro.arrays;
import java.util.*;
public class Exercise6 {

	public static void main(String[] args) {
		int []array=new int[] {18,65,32,1,6,567,86,34567,23};
		Arrays.sort(array);
		System.out.println("After sorting,the Array is");
		for(int value:array)
		{
			System.out.print(value+" ");
		}
		System.out.println();
	}

}
