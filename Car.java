// Car class that extends Vehicle but is NOT public transit
public class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, int doors, Passenger driver) {
        super(make, model, year, driver);
        this.doors = doors;
    }

    @Override
    public void drive() { 
        System.out.println(driver + ", who is " + driver.getAge() + ", is driving.");
    }

    public int getDoors() { return doors; }
}