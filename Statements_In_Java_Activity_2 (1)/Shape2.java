

package com.cognizant.shapes;

public class Shape2 {
 int noOfSides;
  public int  calculateShapeArea(int noOfSides,int sideLength) {
  	this.noOfSides=noOfSides;
  	return sideLength;
  }
  public static void main(String[] args) {
  	
  	Shape2 sph = new Shape2();
  	
  	Circle2 cir=new Circle2();
  	Triangle2 tir = new Triangle2();
  	Squre2 sqr = new Squre2();
   int n=4;
  	switch(n) {
  	  
  	case 1:{
  	  	tir.setValue(sph.calculateShapeArea(3,12));
        System.out.println("The area of Triangle is " + tir.calculateArea());
        break;
  		}
  	case 2:{
  		sqr.setValue(sph.calculateShapeArea(4,15));
        System.out.println("The area of Squre is " + sqr.calculateArea());
        break;
  	   }
  	case 3:{
  		sph.calculateShapeArea(5,15);
        System.out.println("No shapes present");
        break;
  	   }
  	default:{
  		System.out.println("Please Enter valid input ");
  		break;
  	}
  	
  	}
  	
  	
  
		
	}
}
