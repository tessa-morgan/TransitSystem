package vehicle;

/**
 * Represents a Bus which is a public transit vehicle.
 *
 * This class is part of the transit system simulation.
 */
import java.util.ArrayList;

import core.Passenger;
import core.Vehicle;
import core.IPublicTransit;

public class Bus extends Vehicle implements IPublicTransit {
    
    /**
     * List of all Passengers currently on the bus
     */
    private ArrayList<Passenger> passengers;

    public Bus(String make, String model, int year, Passenger driver) {
        super(make, model, year, driver);
        this.passengers = new ArrayList<>();
    }

    @Override
    /**
     * drive method.
     * @param distance The distance in miles traveled
     *
     * Updates the distance traveled by the bus object based on the input distance.
     * Prints a response in the form 'Jane, who is 32, is driving a bus with 3 passengers.'
     */
    public void drive(int distance) {
        for (Passenger p : passengers) {
            p.travel(distance);
        }

        System.out.println(driver + ", who is " + driver.getAge() + ", is driving a bus with " + passengers.size() + " passengers.");
    }

    @Override
    /**
     * boardPassengers method.
     * @param newPassengers
     *
     * Adds each passenger in newPassengers to the Bus and charges them fare.
     */
    public void boardPassengers(ArrayList<Passenger> newPassengers) {
        passengers.addAll(newPassengers);
        System.out.println(newPassengers.size() + " passengers boarded the bus.");
        double fare = 0;
        for (Passenger p : newPassengers) {
            fare = calculateFare(p);
            p.payFare(fare);
        }
    }

    @Override
    /**
     * disembarkPassengers method.
     * @param leavingPassengers
     *
     * Removes each passenger in leavingPassengers from the Bus and prints confirmation.
     */
    public void disembarkPassengers(ArrayList<Passenger> leavingPassengers) {
        for (Passenger p : passengers) {
            p.disembark();
        }
        passengers.removeAll(leavingPassengers);
        System.out.println(leavingPassengers.size() + " passengers left the bus.");
    }

    @Override
    /**
     * calculateFare method.
     * @param p The passenger object 
     * @return fare 
     *
     * Calculates the fare for the passenger p based on their age.
     */
    public double calculateFare(Passenger p) {
        double fare;
        if (p.getAge() < 18) {
            fare = 1.50; // Discounted fare for minors
        } else {
            fare = 3.00; // Regular fare for adults
        }
        return fare;
    }
}