package com.wipro.collections.list;
import java.util.*;

class EmployeeDemo
{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	EmployeeDemo(int empId,String empName,String email,String gender,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}	
	void getEmployeeDetails()
	{
		System.out.println("Employee Id is "+empId+"\n"+"Employee Name is "+empName+"\n"
			+"employee email is "+email+"\n"+"employee gender is "+gender+"\n"+
				"employee salary is "+salary);
	}

}
public class Ex7 {

	public static void main(String[] args) 
	{
		Vector<EmployeeDemo> vectorobject=new Vector<>();
		EmployeeDemo employeeobjectone=new EmployeeDemo(12,"vamsi","vamsikrishna3466@gmail.com","male",1000000.34f);
		EmployeeDemo employeeobjecttwo=new EmployeeDemo(155,"lasya","lasyabuddy3466@gmail.com","female",2300000.34f);
		vectorobject.add(employeeobjectone);
		vectorobject.add(employeeobjecttwo);
		System.out.println("using iterator");
		Iterator<EmployeeDemo> iteratorobject=vectorobject.iterator();
		while(iteratorobject.hasNext())
		{
		iteratorobject.next().getEmployeeDetails();	
		}
		System.out.println("using  enumeration");
		Enumeration employeeobjects=(vectorobject).elements();
		while(employeeobjects.hasMoreElements())
		{
			EmployeeDemo employeeobject=(EmployeeDemo)employeeobjects.nextElement();
			employeeobject.getEmployeeDetails();
		}
		
		
		


	}

}
