package vehicle;

/**
 * Represents a Car, a personal vehicle that does not implement public transit.
 *
 * This class is part of the transit system simulation.
 */

import core.Passenger;
import core.Vehicle;

// Car class that extends Vehicle but is NOT public transit
public class Car extends Vehicle {
    
    /**
     * The number of doors the vehicle has
     */
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
    /**
     * drive method.
     * @param distance The distance in miles traveled
     *
     * Updates the distance traveled by the car object based on the input distance.
     * Prints a response in the form 'Jane, who is 32, drove 3 miles.'
     */
    public void drive(int distance) { 
        driver.travel(distance);
        System.out.println(driver + ", who is " + driver.getAge() + ", drove " + distance + " miles.");
    }

    /**
     * getDoors method.
     *
     * @return doors 
     */
    public int getDoors() { return doors; }
}