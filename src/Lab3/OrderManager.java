/*This program will create a coffiebag object, 
 * accept custmer name ,number of bags orderd and number of pounds per bag from the user
 * and pass the values to the object. then  print out the bill */
import java.util.*;
class OrderManager{
    public static void main(String[] args){
        String name;
        int numberOfbags;
        double noOfpoundsperbag;
        
        Scanner scanner;
        scanner= new Scanner(System.in);
        
        CoffeeBagOrder coffeeBagOrder1;
        coffeeBagOrder1= new CoffeeBagOrder();
        
        System.out.printf("Enter customer name: ");
        name=scanner.nextLine();        
      
        System.out.print("Enter the number of bags ordered: ");
        numberOfbags=scanner.nextInt();
        
        System.out.print("Enter the number of pounds per bag: ");
        noOfpoundsperbag=scanner.nextDouble(); 
        System.out.println();
        
        coffeeBagOrder1.setcustomerName(name);
        coffeeBagOrder1.setbagsOrdered(numberOfbags);
        coffeeBagOrder1.setpoundPerBag(noOfpoundsperbag);
        coffeeBagOrder1.compute();
        System.out.println("-------------------------------------");
        System.out.println("Bill for "+coffeeBagOrder1.getcustomerName());
        System.out.println();
        System.out.println("Number of bags ordered: "+coffeeBagOrder1.getcustomerName());
        System.out.printf("        Weight per bag: %.1f",coffeeBagOrder1.getpoundPerBag());
        System.out.println("lb");
        System.out.printf("       Price per pound: $%.2f",CoffeeBagOrder.PRICE_PER_BAG );
        System.out.println();      
        System.out.printf("              Subtotal: $%.2f", coffeeBagOrder1.getsubTotal());
        System.out.println(); 
        System.out.println(); 
        System.out.printf("             Sales tax: $%.2f", coffeeBagOrder1.gettax());
        System.out.println(); 
        System.out.printf("           Grand Total: $%.2f", coffeeBagOrder1.getgrandTotal());
        
    }

}