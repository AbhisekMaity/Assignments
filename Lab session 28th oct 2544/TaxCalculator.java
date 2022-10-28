package com.cognizant.tax;

public class TaxCalculator {
	float basicSalary;
	boolean citizenship;
	float tax;
	int nettSalary;
	TaxCalculator(float basicSalary,boolean citizenship){  
		this.basicSalary=basicSalary;
		this.citizenship=citizenship;
	}
	public void calculateTax() {  // here we calculate the tax
		 tax = 30*basicSalary/100;
		 System.out.println("The Tax of the employee  for  the "+basicSalary+" is " +tax);
	}
	public void deductTax() {   // here we calculate the nettsalary which is basic - tax
		nettSalary=(int)(basicSalary-tax);
		System.out.println("The nett salary of the employee "+nettSalary);
	}
	public void validateSalary() {  
		if((basicSalary>100000) && (citizenship==true)) {
			System.out.println("The salary and citizenship eligibility : true");
			
		}
		else {
			System.out.println("The salary and citizenship eligibility : false");

		}
	}
}
