package core;

/**
 * Abstract class representing a generic vehicle.
 *
 * This class is part of the transit system simulation.
 */

// Abstract class representing a general Vehicle
public abstract class Vehicle {
    
    /**
     * Make of the vehicle
     */
    protected String make;

    /**
     * Model of the vehicle
     */
    protected String model;

    /**
     * Year of the vehicle
     */
    protected int year;

    /**
     * The Passenger object that is driving the vehicle
     */
    protected Passenger driver;

    /**
     * Number of miles the car has driven total
     */
    protected int milesDriven;

    // Constructor
    public Vehicle(String make, String model, int year, Passenger driver) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.driver = driver;
        milesDriven = 0;
    }

    public Vehicle(String make, String model, int year, Passenger driver, int milesDriven) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.driver = driver;
        this.milesDriven = milesDriven;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void drive(int distance);

    
    /**
     * displayInfo method.
     *
     * Prints the driver name and age, and the year, make and model of the car
     * Concrete method (default behavior)
     */
    public void displayInfo() {
        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a " + year + " " + make + " " + model);
    }

    // Getters and Setters
    
    /**
     * getMake method.
     *
     * @return make
     */
    public String getMake() { return make; }
    /**
     * setMake method.
     *
     * @param make
     */
    public void setMake(String make) { this.make = make; }

    /**
     * getModel method.
     *
     * @return model
     */
    public String getModel() { return model; }
    /**
     * setModel method.
     *
     * @param model
     */
    public void setModel(String model) { this.model = model; }

    /**
     * getYear method.
     *
     * @return year
     */
    public int getYear() { return year; }
    /**
     * setYear method.
     *
     * @param year
     */
    public void setYear(int year) { this.year = year; }
}