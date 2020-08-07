package com.wipro.flowcontrolstatements;

public class Exercise6 {
	public static void main(String[] args) {
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.equals("Female"))
		{
			if(age>=1&&age<=58)
			{
				System.out.println("The percentage of interest is "+8.2+"%");
			}
			else
			{
				System.out.println("The percentage of interest is "+9.2+"%");
			}
		}
		else
		{
			if(age>=1&&age<=58)
			{
				System.out.println("The percentage of interest is "+8.4+"%");
			}
			else
			{
				System.out.println("The percentage of interest is "+10.5+"%");
			}
			
		}
	}

}
