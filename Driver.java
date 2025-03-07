/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

class Driver implements DriverRequirements {
    private String name; // Driver's name
    private int age; // Driver's age
    private boolean sober; // Sober status

    public Driver(String name, int age, boolean sober) {
        this.name = name;
        this.age = age;
        this.sober = sober;
    }

    @Override
    public boolean canDrive() {
        return age >= 16 && sober;
    }

    public void attemptToDrive(Car car) {
        if (canDrive()) {
            System.out.println(name + " is allowed to drive.");

            System.out.println("Car details: " + car.getDetails()); // Print car details
            car.start();
            car.engineNote(); // Just to make sure it is not electric

            // Simulation if the requirements are accepted
            System.out.println(name + " is now driving...");
            car.stop();

            // No Simulation if the requirements are not accepted
        } else {
            System.out.println(name + " is not allowed to drive.");
        }
    }

}
