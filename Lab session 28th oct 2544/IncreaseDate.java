package com.Assignments;
import java.time.*;
public class IncreaseDate {
   public static void main(String[] args)
    {
     LocalDate today = LocalDate.now(); 
     System.out.println("\nCurrent Date: "+today);   // it will print current date 
     System.out.println("10 days after today will be "+today.plusDays(10)+"\n");
   }
}
