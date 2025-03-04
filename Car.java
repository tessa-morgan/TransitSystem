// Car class that extends Vehicle but is NOT public transit
public class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, int doors, Passenger driver) {
        super(make, model, year, driver);
        this.doors = doors;
    }

    public Car(String make, String model, int year, int doors, Passenger driver, int milesDriven) {
        super(make, model, year, driver, milesDriven);
        this.doors = doors;
    }

    @Override
    public void drive(int distance) { 
        driver.travel(distance);
        System.out.println(driver + ", who is " + driver.getAge() + ", drove " + distance + " miles.");
    }

    public int getDoors() { return doors; }
}