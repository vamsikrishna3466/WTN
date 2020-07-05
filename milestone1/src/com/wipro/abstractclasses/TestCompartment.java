package com.wipro.abstractclasses;
import java.util.concurrent.*;
import java.util.*;
abstract class Compartment
{
	abstract String notice();
}
class FirstClass extends Compartment
{
	@Override
	String notice() 
	{
	System.out.println("First class Booking");	
	return "FirstClass";
	}
}
class Ladies extends Compartment
{
	@Override
	String notice() 
	{
	System.out.println("Ladies Booking");	
	return "ladies";
	}
}

class General extends Compartment
{
	@Override
	String notice() 
	{
	System.out.println("Travelling in general");
	return "general";
	}
}
class Luggage extends Compartment
{
	@Override
	String notice() 
	{
	System.out.println("Luggage storage");	
	return "luggage";
	}
}

public class TestCompartment {

	public static void main(String[] args)
	{
		Compartment []compartmentobject=new Compartment[10];
		 ThreadLocalRandom random=ThreadLocalRandom.current();
		int randomvalue;
		for(int iteration=0;iteration<10;iteration++)
		{
			randomvalue=random.nextInt(1,5);
			if(randomvalue==1)
			{
				compartmentobject[iteration]=new FirstClass();
			}
			else if(randomvalue==2)
			{
				compartmentobject[iteration]=new Ladies();
			}
			else if(randomvalue==3)
			{
				compartmentobject[iteration]=new General();	
			}
			else
			{
				compartmentobject[iteration]=new Luggage();
			}
			System.out.println("notice is "+compartmentobject[iteration].notice());
		}
	}

}
