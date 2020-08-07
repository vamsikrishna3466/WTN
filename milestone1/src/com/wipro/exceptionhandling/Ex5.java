package com.wipro.exceptionhandling;
class InvalidAge extends Exception
{
	InvalidAge(String message)
	{
		super(message);
	}
	
}
public class Ex5 {
public void validateAge(int age) throws InvalidAge
{
	if(age>=18&&age<=60)
	{
		System.out.println("Valid age");
	}
	else
	{
		throw new InvalidAge("age should be in range of 18 and 60");
	}
}
	public static void main(String[] args) 
	{
		try
		{
	String name=args[0];
	int age=Integer.parseInt(args[1]);
	Ex5 ex5object=new Ex5();
	ex5object.validateAge(age);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
