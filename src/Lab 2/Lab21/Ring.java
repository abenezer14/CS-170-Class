/*This program accepts a radius of inner and outer circles as input from the user.
 * Then It then displays the area of the ring*/
import java.util.*;
import java.io.*;
class Ring{
  public static void main (String[] args){
      Scanner scanner;
      scanner= new Scanner(System.in);
      double radius1,radius2,area1,area2,areaR; //declare data members
      
      Circle ring;// declaring  a circle object called ring 
      ring = new Circle();//creating Ring 
      
      System.out.println("This program accepts a radius of inner and outer circles \nas input from the user. It then displays the area of the ring");
      System.out.println();
      System.out.print("Enter radius of outer circle of the ring: ");
      
      radius1=scanner.nextDouble();
      ring.setRadius(radius1);
      
      area1=ring.computeArea();//compute Area for area1
      System.out.print("Enter radius of outer circle of the ring: ");
      
      radius2=scanner.nextDouble();
      ring.setRadius(radius2);
      area2=ring.computeArea();//Compute area for area2
      
      areaR=area1-area2;// compute area for the ring 
      System.out.printf("The area of the ring:% .3f ", areaR);
  }
  
}
