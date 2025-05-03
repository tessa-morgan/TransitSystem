package vehicle;

/**
 * Represents a Taxi which is a type of public transit vehicle.
 *
 * This class is part of the transit system simulation.
 */
import java.util.ArrayList;

import core.Passenger;
import core.IPublicTransit;

public class Taxi extends Car implements IPublicTransit {
    
    /**
     * A list of Passengers currently in the taxi 
     */
    private ArrayList<Passenger> passengers;

    public Taxi(String make, String model, int year, int doors, Passenger driver) {
        super(make, model, year, doors, driver);
        this.passengers = new ArrayList<>();
    }

    public Taxi(String make, String model, int year, int doors, Passenger driver, int milesDriven) {
        super(make, model, year, doors, driver, milesDriven);
        this.passengers = new ArrayList<>();
    }

    @Override
    /**
     * drive method.
     * @param distance The distance in miles traveled
     *
     * Updates the distance traveled by the taxi and charges each passenger based on the input.
     * Prints a response in the form 'Jane, who is 32, is driving a taxi with 3 passengers.'
     */
    public void drive(int distance) {
        for (Passenger p : passengers) {
            p.travel(distance);
            p.payFare(distance);
        }
        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a taxi with " + passengers.size() + " passengers.");
    }

    @Override
    /**
     * boardPassengers method.
     * @param newPassengers List of passengers boarding the taxi
     *
     * Adds each passenger in newPassengers to the Taxi.
     */
    public void boardPassengers(ArrayList<Passenger> newPassengers) {
        // Adds passengers to the taxi
        passengers.addAll(newPassengers);
        int num = newPassengers.size();

        for (Passenger p : passengers) {
            
            if (num > 1) {
                System.out.print(p.getName() + ", ");
                num--;
            }
            else {
                System.out.println(p.getName() + " got in a taxi.");
            }
        }
    }

    @Override
    /**
     * disembarkPassengers method.
     * @param leavingPassengers
     *
     * Removes passengers in leavingPassengers from the taxi
     */
    public void disembarkPassengers(ArrayList<Passenger> leavingPassengers) {
        passengers.removeAll(leavingPassengers);
        for (Passenger p : passengers) {
            p.disembark();;
            System.out.println(p.getName() + " got out of the taxi.");
        }
    }

    @Override
    /**
     * calculateFare method.
     * @param p The passenger object 
     * @return fare 
     *
     * Calculates the fare for the passenger p based on the distance traveled.
     */
    public double calculateFare(Passenger p) {
        return p.getDistance() * 1.5 + 3; 
    }
}