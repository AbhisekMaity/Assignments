package com.Assignments;
/*
 * Q.4   Create a student class having the following attributes
              1. Student No. (Data type int)
              2. Student Name. (Data type String)
              3. Student Mail Id. (Data type String)
              4. Student Address. (Data type String)
         This class should have 2 methods
              1. void fees (Int Student No.)
              2. void display (Int Student number)

•	After the class, you need to create an array of Student having 5 Students
           assign different fees to each Student and also print the details of each
           Student with the array only.


•	Now create a static method in the main class which will accept Student 
            number and Student fees as parameter and if the fees are less than 2000
            then fees will increase by 10% of their current fees to that Student.

•	Call the display method to print the updated details.

 */
public class Student {
   int No;
   String Name;
   String MailId;
   String Address;
   int Fees;
    Student(int No,String MailId,String Address,String Name,int Fees){
    	this.No=No;
    	this.Name=Name;
    	this.MailId=MailId;
    	this.Address=Address;
    	this.Fees=Fees;
    }
   public void fees(int No) {
	   this.No=No;
   }
   public void display(int No) {
	   this.No=No;
	   System.out.println("Name: "+Name+" Number: "+No+" MailId: " +MailId+" Address: "+Address+" Fees: " +Fees);
	   
   }
 
}
