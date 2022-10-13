package com.Assignments;



/*Q.2... Write a java class to develop an employee class object & 
initialized the emp name & emp Id for 5 Emp. now write another 
class having name and from this class you have to create 5 employee 
objects but you are not allowed to use new keyword.*/

class Employees {// Employee class
	static int empId;
	static String name;

	// Employee class method
	static void show(int id, String n) {
		empId = id;
		name = n;
		System.out.println(empId + " " + name);
	}

}



