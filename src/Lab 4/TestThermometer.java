
/*this program outputs The Boiling Point, The freezing point,
 * The Boiling point in Fahrenheit, The Freezing Point in Fahrenheit 
 * and also accepts a fahrenheit and convert it back to celcious and print it out  */
import java.util.*;
class  TestThermometer{
    public static void main(String[] args){
        System.out.println("The Boiling Point is: "+Thermometer.BOILING_CELSIUS);
        System.out.println("The Freezing Point is: "+Thermometer. FREEZING_CELSIUS);
        System.out.println("The Boiling point in Fahrenheit: "+Thermometer.BOILING_FAHRENHEIT);
        System.out.println( "The Freezing Point in Fahrenheit: "+Thermometer.FREEZING_FAHRENHEIT); 
        double fahrenheit,celsius;
        Scanner scanner;
        scanner=new Scanner(System.in);
        System.out.print("Enter fahrenheit: " );
        fahrenheit=scanner.nextDouble();
        celsius=Thermometer.Ftoc(fahrenheit);
        System.out.print("convertion Back to celsius: "+celsius);
        
    
    } 
}