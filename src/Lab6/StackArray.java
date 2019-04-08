// Name:Abenezer Bekele
// Date:1/28/2019
// Course: CS170
// Program: DecToBi
/*This program is a tamplet for the stackarray objects 
 * that are going to be created */

class StackArray{
    private static final int N=3;
    private int top,sarray[]; 
    
    public StackArray(){
        this(N);
    }
    public StackArray(int n){
        top=0;
        sarray= new int[n];
    }
    public void push(int item){
        if(full())
            System.out.println("Stack is full");
        else{
            sarray[top]=item;
            top++;    
        }
    }
    
    public int pop(){
        int item=-1;
        if(this.empty())
            System.out.println("Stack Is empty");
        else{
            top--;
            item=sarray[top];
        } 
        return item;
    }
    
    public boolean empty(){
        return top==0;
    }
    public boolean full(){
        return top==sarray.length;    
    }
    
    public int size(){
        return sarray.length;
    }
   
    public int peek(){
        int item=-1;
        if(this.empty())
            System.out.println("Stack Is empty");
        else        
            item=sarray[top-1];
        
        return item;
    }

}