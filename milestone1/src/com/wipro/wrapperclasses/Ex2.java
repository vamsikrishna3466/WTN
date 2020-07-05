package com.wipro.wrapperclasses;

public class Ex2 {

	public static void main(String[] args)
	{
			try
			{
				int value=Integer.parseInt(args[0]);
				System.out.println("Given Number :"+value);
				String str="";
				int number=value;
				while(value>0)
				{
					str=str.concat(String.valueOf(value%2));
					value=value/2;
				}
				StringBuffer sb=new StringBuffer(str);
				System.out.println("Binary equivalent :"+sb.reverse());
				System.out.println(String.format("Octal equivalent: %o", number));
				System.out.printf(String.format("HexaDecimal equivalent: %x", number));
			}
			catch(Exception object)
			{
				System.out.println(object);
			}
	}

}
