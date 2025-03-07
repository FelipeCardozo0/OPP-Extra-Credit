/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

// Class to execute the program
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Mercedes", "AMG F1 M15 E Performance", 2024, 0, "V6", 4);
        Driver driver1 = new Driver("Verstappen", 27, true);
        Driver driver2 = new Driver("Hamilton 10 times younger", 4, true);
        Driver driver3 = new Driver("Drunk Leclerc", 27, false);


        driver1.attemptToDrive(myCar);
        driver2.attemptToDrive(myCar);
        driver3.attemptToDrive(myCar);
    }
}


