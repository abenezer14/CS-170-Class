/**
 * File: Circle.java
 *
 * This file defines a Circle class which can be used to calculate the
 * circumference and area of a circle.
 */
 
// Name:Abenezer Bekele
// Date:1/28/2019
// Course: CS170
// Program: Circle.java

class Circle {

   public static final double DEFAULT_RADIUS= 0.0;//data members
   
   
   private double radius;
    
   //method definitions
   public Circle() {
      radius = DEFAULT_RADIUS;
   }
   public double  getRadius(){
      return radius;
   }
   public double computeCircumference(){
      double circumfrence;
      circumfrence= 4*radius*Math.PI; //calculet circumfrence
      return circumfrence;
   }
   public double computeArea(){
      double area;
      area= radius*radius*Math.PI;//calculet area
      return area;
   }
   public void setRadius(double aradius){
      radius=aradius;
   
   }

    

}
