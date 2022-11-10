package com.Assignments;

public class StringQuestion1 {
  public static void main(String[] args) {
	  //Problem Statement 1:
	String str = "Welcome to Java World";
	System.out.println(str.charAt(4));  // fifth position character will printed 
	System.out.println(str.compareTo("Welcome"));  // here the output is 14 
	System.out.println(str.concat("- Let us learn"));
	System.out.println(str.indexOf("a")); // first occurence of char a
	System.out.println(str.replace('a', 'e'));  // Welcome to Jeve World ==> use replace method 
	System.out.println(str.substring(4,11)); // substring method 
	System.out.println(str.toLowerCase());  // display lower case 
	
	// Problem Statement 2: using string buffer 
	StringBuffer br =  new StringBuffer("This is StringBuffer");  // assign a string with the help of sb
	br.append("- This is a sample program");  // add new string to the existing string
	System.out.println(br);  
	br.insert(21, "Object");   // at string at position 
	System.out.println(br);
	System.out.println(br.replace(14, 20, "Builder"));
	System.out.println(br.reverse());  // reverse the entire string 
	
	// Problem Statement 3: 

	  String s="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
	  String strarr[]=s.split("\\\\");  // here we split the string
	  for(int i=0;i<strarr.length;i++) {
	  }
	  System.out.println("Drive: " +strarr[0]+"\\");
	  System.out.println("Folders: "+strarr[1]+"||"+strarr[2]+"||"+strarr[3]);
	  System.out.println("File: "+strarr[4]);
	
}
}




















