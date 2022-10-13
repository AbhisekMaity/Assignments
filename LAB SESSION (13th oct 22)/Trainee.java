package com.Assignments;

public class Trainee extends Employee {
	
	long employeeId;	
	String employeeName;	
	String employeeAddress;	
	Long employeePhone;
	double basicSalary;
	public Trainee(long Id, String name, String address, long phone,double salary) {
		super(Id, name, address, phone);
		super.basicSalary=salary;

		
	}

}
