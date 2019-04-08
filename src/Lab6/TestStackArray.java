
// Name:Abenezer Bekele
// Date:1/28/2019
// Course: CS170
// Program: TestStackArray
 
 /* The program is used to tests the StackArray Class.
  * It accepts values and process them in the stackArray Class 
  * and outputs it.*/
class TestStackArray{
    public static void main(String[] args){
        StackArray stack;
        stack= new StackArray();
        
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.size());
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek());
        stack.push(6);
        stack.push(5);
        stack.push(4);
        System.out.println(stack.peek());
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.pop());
        }
        
    }
    
}
