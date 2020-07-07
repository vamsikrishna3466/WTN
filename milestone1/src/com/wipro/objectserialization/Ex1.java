package com.wipro.objectserialization;

import java.io.*;
import java.util.Date;

class Employee implements Serializable
{
	String name;
	Date date;
	String department;
	double Salary;
	Employee()
	{
		
	}
	Employee(String name,Date date,String department,double salary)
	{
		this.name=name;
		this.date=date;
		this.department=department;
		this.Salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	
}

public class Ex1 {

	public static void main(String[] args)
	{
		Date d=new Date();
		Employee employeeobject=new Employee("Vamsi",d,"cse",100056.00);
		employeeobject.setDepartment("finance");
		try(FileOutputStream fos=new FileOutputStream("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\objectserialization\\data.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			oos.writeObject(employeeobject);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream("F:\\WTN git\\Milestoneone\\milestone1\\src\\com\\wipro\\objectserialization\\data.ser");
				ObjectInputStream ois=new ObjectInputStream(fis))
		{
			Employee employee=(Employee)ois.readObject();
			System.out.println("Employee details");
			System.out.println("----------------");
			System.out.println("Employee name "+employee.getName());
			System.out.println("Employee joining date "+employee.getDate());
			System.out.println("Employee department "+employee.getDepartment());
			System.out.println("Employee salary "+employee.getSalary());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
