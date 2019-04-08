/*This program creates a class called Coffeebagorder. Then declare two class constants PRICE_PER_BAG and TAX_RATE and assign a value 
   and declare 6 instance variables customerName, bagsOrdered,poundPerBag,subTotal,tax,grandTotal.
   use two constractors to initailize the datamembers. use a get methods to get the value and return it to the main program.
   then use use set methods to change the value of some datamembers and finally use a void method to compute the subtotal , tax and ground total  */
class CoffeeBagOrder{
    public static final double PRICE_PER_BAG=5.99;
    public static final double TAX_RATE=0.0725;
    
    private String  customerName;
    private int bagsOrdered;
    private double poundPerBag,subTotal,tax,grandTotal;
    
    public CoffeeBagOrder(){
        String customerName = null;
        bagsOrdered=0;
        poundPerBag=0;
        subTotal=0;
        tax=0;
        grandTotal=0;
    }
    public CoffeeBagOrder(String name,int noBags,double noPoundsPerBag){
        String customerName = name;
        poundPerBag=noPoundsPerBag;
        bagsOrdered=noBags;
        subTotal=0;
        tax=0;
        grandTotal=0;    
    }
    public String getcustomerName(){
        return customerName;
    }
    public int getbagsOrdered(){
        return bagsOrdered;
    } 
    public double getpoundPerBag(){
        return poundPerBag;
    }
    public double getsubTotal(){
        return subTotal;
    }
    public double gettax(){
        return tax;        
    } 
    public double getgrandTotal(){
        return grandTotal;
    }
    
    public void setcustomerName(String name1){
        String customerName= name1;        
    }
    public void setbagsOrdered(int bags1){
        bagsOrdered=bags1;        
    }
    public void setpoundPerBag(double poundperbag){
        poundPerBag=poundperbag;
    }
    
    public void compute(){
        subTotal= bagsOrdered * poundPerBag * PRICE_PER_BAG;
        tax= subTotal*TAX_RATE;
        grandTotal= subTotal + tax;   
        
    }
    
}