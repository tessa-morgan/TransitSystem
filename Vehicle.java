// Abstract class representing a general Vehicle
public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected Passenger driver;
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

    // Concrete method (common behavior for all vehicles)
    public void displayInfo() {
        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a " + year + " " + make + " " + model);
    }

    // Getters and Setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}