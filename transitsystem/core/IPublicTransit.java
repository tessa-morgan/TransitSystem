package core;

/**
 * Interface defining public transit operations.
 *
 * This class is part of the transit system simulation.
 */

import java.util.ArrayList;

public interface IPublicTransit {
    /**
     * boardPassengers method.
     *
     * @param newPassengers
     */
    void boardPassengers(ArrayList<Passenger> newPassengers);

    /**
     * disembarkPassengers method.
     *
     * @param leavingPassengers
     */
    void disembarkPassengers(ArrayList<Passenger> leavingPassengers);
    
    // Stamp coupling
    /**
     * calculateFare method.
     *
     * @param p
     * @return fare
     */
    double calculateFare(Passenger p);
}