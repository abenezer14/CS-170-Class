class StackArrayGeneric<T>{
    private final int N = 5;
    private int top;
    private T[] sarray;
    
    public StackArrayGeneric(){
        top=0;
        sarray=(T[])new Object[N];   
    }
    public T pop(){
        T item=null;
        if(empty())
            System.out.println("empty");
        else{
            top--;
            item=sarray[top];               
        } 
        return item;    
    }
    public void push(T item){
        if(full())
            System.out.println("full");
        else{
            sarray[top]=item;
            top++;
        }    
    }
    public boolean empty(){
        return top==0;
    }
    public boolean full(){
        return top==sarray.length;    
    }
    public int getCount(){
        return top;
    }    
    public T peek(){
        T item= null;
        if(empty())
            System.out.println("Empty");
        else{
            item=sarray[top-1];
                       
        }
        return item;
    }



}