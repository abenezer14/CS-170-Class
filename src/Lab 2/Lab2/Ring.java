import java.util.*;
import java.io.*;
class Ring{
  public static void main (String[] args) {
      Scanner scanner;
      scanner= new Scanner(System.in);
      double radius1,radius2,area1,area2,areaR; //declare data members
      Circle Ring;// declaring  a circle object called ring 
      Ring = new Circle();//creating Ring 
      System.out.println("This program accepts a radius of inner and outer circles \n as input from the user. It then displays the area of the ring");
      System.out.println();
      System.out.println("Enter radius of outer circle of the ring: ");
      radius1=scanner.nextDouble();
      Ring.setRadius(radius1);
      area1=Ring.computeArea();//compute Area for area1
      System.out.println("Enter radius of outer circle of the ring: ");
      radius2=scanner.nextDouble();
      Ring.setRadius(radius2);
      area2=Ring.computeArea();//Compute area for area2
      areaR=area1-area2;// compute area for the ring 
      System.out.println("The area of the ring: "+areaR);
      }
  
}
