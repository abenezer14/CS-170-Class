

// Name:Abenezer Bekele
// Date:1/28/2019
// Course: CS170
// Program: DecToBin
/* This program Converts Decimal numbers in to binary numbers */
import java.util.*;
public class DecToBin{
    public static void main (String[] args){
        Scanner scanner;
        scanner= new Scanner(System.in);
        StackArray stack2;
        stack2=new StackArray();
        int num,bin; 
        
        System.out.print("Enter non negative number:");
        num=scanner.nextInt(); 
        
        while(!(num==0)){
            bin=num%2;
            num=num/2;            
            stack2.push(bin);
        }
        
        while(!stack2.empty())
            System.out.print(stack2.pop());
        
        
            
    }
}