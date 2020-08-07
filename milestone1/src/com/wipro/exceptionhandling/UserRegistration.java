package com.wipro.exceptionhandling;

import java.util.Scanner;

class InvalidCountryException extends Exception
{
	InvalidCountryException(String message)
	{
	super(message);
	}
}

public class UserRegistration {
	void registeruser(String name,String userCountry)throws InvalidCountryException
	{
		if(userCountry.equalsIgnoreCase("INDIA"))
			System.out.println("user registration done successfully");
		else
			throw new InvalidCountryException("User Outside India cannot be registered");
	}
	public static void main(String[] args)
	{
		Scanner scannerobject=new Scanner(System.in);
		String name=scannerobject.next();
		String country=scannerobject.next();
		UserRegistration userregistrationobject=new UserRegistration();
		try {
			userregistrationobject.registeruser(name,country);
		} catch (InvalidCountryException e) 
		{
			e.printStackTrace();
		}
	
	}

}
