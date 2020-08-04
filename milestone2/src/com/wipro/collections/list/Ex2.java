package com.wipro.collections.list;

import java.util.*;

class Employee
{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	Employee(int empId,String empName,String email,String gender,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
	}
	void GetEmployeeDetails()
	{
		System.out.println("Employee Id is "+empId+"\n"+"Employee Name is "+empName+"\n"
			+"employee email is "+email+"\n"+"employee gender is "+gender+"\n"+
				"employee salary is "+salary);
	}
}
class EmployeeDB
{
	ArrayList list;
	EmployeeDB(ArrayList list)
	{
		this.list=list;
	}
	boolean addEmployee(Employee e)
	{
		list.add(e);
		return true;
	}
	boolean deleteEmployee(int empId)
	{
		boolean check=false;
		Iterator<Employee> iteratorobject=list.iterator();
		while(iteratorobject.hasNext())
		{
			if(iteratorobject.next().empId==empId)
			{
				iteratorobject.remove();
				check=true;
				break;
			}
		}
		return check;
	}
	String showPaySlip(int empId)
	{
		Employee employeeobject;
		String stringobject="employee is not there";
		Iterator<Employee> iteratorobject=list.iterator();
		while(iteratorobject.hasNext())
		{
			employeeobject=iteratorobject.next();
			if(employeeobject.empId==empId)
			{
			stringobject="The employee salaray is "+employeeobject.salary;
			break;
			}
		}
		return stringobject;
	}
}
public class Ex2 
{
public static void main(String []arg)
{
	Employee employeeobjectone=new Employee(12,"vamsi","vamsikrishna3466@gmail.com","male",1000000.34f);
	Employee employeeobjecttwo=new Employee(155,"lasya","lasyabuddy3466@gmail.com","female",2300000.34f);
	ArrayList<Employee> arraylistobject=new ArrayList<>();
	EmployeeDB employeedbobject=new EmployeeDB(arraylistobject);
	employeedbobject.addEmployee(employeeobjectone);
	System.out.println(employeedbobject.showPaySlip(12));
	if(employeedbobject.deleteEmployee(12))
	{
		System.out.println("The employee is deleted suceesfully");
	}
	else
	{
		System.out.println("employee is not present");
	}
	System.out.println(employeedbobject.showPaySlip(12));
	employeedbobject.addEmployee(employeeobjecttwo);
	System.out.println(employeedbobject.showPaySlip(155));	
}
}
