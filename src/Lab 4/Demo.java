public class Demo {
    public static void main (String [] args) { 
        // Create some thermometers
        System.out.println("Creating two thermometers 0 and 20 degrees C...");
        Thermometer t1 = new Thermometer(); // set to 0 C
        Thermometer t2 = new Thermometer(20); // set to 20 C 
    
        // Get the temperature readings on t1 and t2
        System.out.println("t1 reads " + t1.getTemp() + " Celsius or " + t1.getTempInF() + " Fahrenheit");
        System.out.println("t2 reads " + t2.getTemp() + " Celsius or " + t2.getTempInF() + " Fahrenheit");

        // Change their values
        System.out.println("Changing the readings on the two thermometers");
        t1.setTempUsingF(Thermometer.BOILING_FAHRENHEIT);
        t2.setTemp(40);

        // Get the temperature readings on t1 and t2
        System.out.println("t1 reads " + t1.getTemp() + " Celsius or " + t1.getTempInF() + " Fahrenheit");
        System.out.println("t2 reads " + t2.getTemp() + " Celsius or " + t2.getTempInF() + " Fahrenheit");

        System.out.println("Thermometer test suite finished...");
    }
}