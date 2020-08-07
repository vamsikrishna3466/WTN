package com.wipro.exceptionhandling;

import java.util.Scanner;

class ValidNumbers extends Exception
{
	ValidNumbers(String message)
	{
		super(message);
	}
}
class Student
{
	String name;
	int marks1;
	int marks2;
	int marks3;
	Student(String name,int marks1,int marks2,int marks3)
	{
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	void calcualteAverage() throws ValidNumbers
	{
		if(marks1<0||marks2<0||marks3<0||marks1>100||marks2>100||marks3>100)
		{
			throw new ValidNumbers("In Valid Number");
		}
		else
		{
		System.out.println("The average for "+name+" is "+(marks1+marks2+marks3)/3);	
		}
	}
}
public class Ex3 {

	public static void main(String[] args)
	{
		String name;
		int marks1;
		int marks2;
		int marks3;
		System.out.println("Enter the Student1 details");
		Scanner scannerobject=new Scanner(System.in);
		try
		{
			name=scannerobject.next();
			marks1=Integer.parseInt(scannerobject.next());
			marks2=Integer.parseInt(scannerobject.next());
			marks3=Integer.parseInt(scannerobject.next());
			Student s1=new Student(name,marks1,marks2,marks3);
			s1.calcualteAverage();
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
		try
		{
			name=scannerobject.next();
			marks1=Integer.parseInt(scannerobject.next());
			marks2=Integer.parseInt(scannerobject.next());
			marks3=Integer.parseInt(scannerobject.next());
			Student s2=new Student(name,marks1,marks2,marks3);
			s2.calcualteAverage();
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
		finally
		{
			scannerobject.close();
		}
		
		
	}

}
