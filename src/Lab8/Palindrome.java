
import java.util.*;
public class Palindrome{   
    public static void main(String[] args){
        Scanner scanner;
        scanner= new Scanner(System.in);
        String text;
        StackArrayGeneric sarray1;
        sarray1=new StackArrayGeneric();
        QueueArrayGeneric queue1;
        queue1=new QueueArrayGeneric();
        System.out.print("Enter a Palindrome: ");
        text=scanner.next();
        
        text=text.toUpperCase();
        text=text.trim();
        text = text.replaceAll("\\s","");
        text= text.replaceAll("[^a-zA-Z0-9 ]" , "");
                    
        char[] a=text.toCharArray();
        
        for(char c:a){
            sarray1.push(String.valueOf(c));
            queue1.enqueue(String.valueOf(c));
        }
        boolean c = true;
        while(!(sarray1.empty()&&queue1.empty())){
            String x = (String) queue1.dequeue();
            String y = (String) sarray1.pop();
            
            if (!x.equals(y))
                c =false;
        }
        if (c)
            System.out.println("It Is A Palandrome");
        else 
            System.out.println("It is Not A palandrome"); 
                    
            
        }
    }
                
            
            
         
        
        
            
        
        
        
        
        
        
    
    
        
    
    
