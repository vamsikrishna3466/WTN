package com.wipro.inheritance;

public class Employee extends Person {

	private double annualSalary;
	private int year;
	private String naturalInsuranceNumber;
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNaturalInsuranceNumber() {
		return naturalInsuranceNumber;
	}
	public void setNaturalInsuranceNumber(String naturalInsuranceNumber) {
		this.naturalInsuranceNumber = naturalInsuranceNumber;
	}
	

}
