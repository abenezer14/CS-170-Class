/**
 * File: CircleTest.java
 *
 * This is the client code to test your circle class.
 */
 
// Name:
// Date:
// Course: 
// Program: CircleTest.java
import java.util.*;
import java.io.*;
class CircleTest {

   public static void main (String[] args) {
      Scanner scanner;
      scanner= new Scanner(System.in);
      double inRAd,outRad;
     
      double  firstCircumference, firstArea;
      Circle firstCircle;
        
      firstCircle = new Circle();
      
      firstCircle.setRadius(2);
      firstCircumference = firstCircle.computeCircumference();
      firstArea = firstCircle.computeArea();
    
      System.out.printf("The radius of this circle is %.2f", firstCircle.getRadius());
      System.out.printf("\nIt's circumference is %.2f", firstCircumference);
      System.out.printf("\nIt's area is %.2f", firstArea);
      
   } 
} 
