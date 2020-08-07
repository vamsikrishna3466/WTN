package com.wipro.wrapperclasses;
class Employee implements Cloneable
{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	Employee cloneObject() throws CloneNotSupportedException
	{
		return (Employee)super.clone();
	}
	@Override
	public String toString()
	{
		return "name of Employee "+name+"\n"+"salary of employee "+salary;
	}
}
public class Ex4 {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee employeeobjecttwo;
		Employee employeeobjectone=new Employee("vamsi",23000);
		System.out.println("Before Cloning"+"\n"+"----------------");
		System.out.println(employeeobjectone.toString());
		employeeobjecttwo=employeeobjectone.cloneObject();
		employeeobjectone.name="krishna";
		employeeobjectone.salary=50000;
		System.out.println("After cloning");
		System.out.println("first employee details"+"\n--------------\n"+employeeobjectone.toString());
		System.out.println("Second employee details"+"\n--------------\n"+employeeobjecttwo.toString());
	}

}
