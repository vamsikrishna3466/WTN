package com.wipro.inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employeeobject=new Employee();
		System.out.println("Employee details");
		System.out.println("----------------");
		employeeobject.setName("vamsi");
		employeeobject.setAnnualSalary(100000000.76);
		employeeobject.setNaturalInsuranceNumber("12345678");
		employeeobject.setYear(2021);
		System.out.println("Name of employee "+employeeobject.getName()+"\n"+"Annual salary is "+(employeeobject.getAnnualSalary())+"\n"+"starting year "+employeeobject.getYear()+"\n"+"National insurance number "+employeeobject.getNaturalInsuranceNumber());
	}

}
