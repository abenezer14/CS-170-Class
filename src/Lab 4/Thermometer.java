// Name: Abenezer Bekele
// Date: 2/14/2019
// Course: CS170
// Program: Thermometer.java

/*This program accepts celicus values from the user and convert it to celcious 
 * and return both of the values to the main method and Demo class */

public class Thermometer {
    // class variables, constants, methods
    public static final int BOILING_CELSIUS = 100;
    public static final int FREEZING_CELSIUS = 0;
    public static final int BOILING_FAHRENHEIT = 212;
    public static final int FREEZING_FAHRENHEIT = 32;
    private double temp;
         
    public static double Ftoc(double fah){//this method converts faranite to cel
        double temp;
        temp= (5*(fah-32))/9;
        return temp;
    }
    public static  double Ctof(double cel){//this method conversts celicious farhanite 
        double temp;
        temp= (9*cel)/5+32;
        return temp;
    } 
    
    public Thermometer(){ //assigne defalt value to object one  
        this(FREEZING_CELSIUS);      
    
    }
    public Thermometer(double cels1){//assigne the passed value to  
        setTemp(cels1);
    }
    
    public void setTemp(double cels1){
        temp=cels1;
        
    }
    public void setTempUsingF(double far1){
        temp=Ftoc(far1);
    
    }
    
    public double getTemp(){
        return temp;
    }
    public double getTempInF(){
        return Ctof(temp);
    }
    
}
