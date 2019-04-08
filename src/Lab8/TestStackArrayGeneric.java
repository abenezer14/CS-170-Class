import java.util.*;
class TestStackArrayGeneric{
    public static void main(String[] args){
        StackArrayGeneric stack;
        stack= new StackArrayGeneric();
        Scanner scanner;
        scanner= new Scanner(System.in);
              
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        stack.push(3);
        stack.push(2);
        stack.push(1);
        
        while (!(stack.empty()))
            System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(6);
        stack.push(5);
        stack.push(4);
        System.out.println(stack.peek());
        while (!(stack.empty()))
            System.out.println(stack.pop());
         
        }
        }
        
        
    
  
     
   

