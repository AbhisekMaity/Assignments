package com.Assignments;

public class StringQuestion2 {
  public static void main(String[] args) {
	String str = "java_exercises";
     
			if(str.matches("^[a-z]+_[a-z]+$")){   // this is predefined String method 
				System.out.println("Found a match");
			
		}
		else 
		{
				System.out.println("Not found");
			}
//	int count =0;
//	for(int i=0;i<str.length();i++) {
//		if(str.charAt(i)=='_' && str.charAt(i+1)=='e'){
//			count++;
//			break;
//		}
//		
//		
//	}
//	if(count==0) {
//		System.out.println("Not found");
//	}
//	else {
//		System.out.println("Match Found");
//	}
	}
}
