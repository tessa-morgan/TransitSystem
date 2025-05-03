package core;

/**
 * Represents a passenger that can board transit vehicles.
 *
 * This class is part of the transit system simulation.
 */

import java.util.Objects;

public class Passenger {
    /*
     * Passenger's name
     */
    private String name;
    /*
     * Passenger's age
     */
    private int age;
    /*
     * Distance the passenger has traveled on the current vehicle
     * If not on a vehicle, is zero
     */
    private int distance = 0;
    /*
     * Keeps track of the total fare a passenger has paid
     */
    private double totalFare = 0;
    /*
     * The ID of the next passenger created
     */
    private static int currID = 0;
    /*
     * Passenger's ID
     */
    private int ID = 0;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = currID++;
    }

    /**
     * travel method.
     * @param miles
     *
     * Updates the distance the passenger has traveled on the current vehicle
     */
    public void travel(int miles) {
        distance += miles;
    }

    /**
     * disembark method.
     *
     * Resets the passenger's distance traveled
     */
    public void disembark() {
        distance = 0;
    }

    /**
     * payFare method.
     * @param fare
     *
     * Updates the passenger's total fare paid
     */
    public void payFare(double fare) {
        totalFare += fare;
        //System.out.println(name + " just paid $" + fare + " for a total of $" + totalFare);
    }

    /**
     * getTotalFare method.
     *
     * @return totalFare
     */
    public double getTotalFare() { return totalFare; }
    /**
     * getDistance method.
     *
     * @return distance
     */
    public int getDistance() { return distance; }
    /**
     * getName method.
     *
     * @return name
     */
    public String getName() { return name; }
    /**
     * getAge method.
     *
     * @return age
     */
    public int getAge() { return age; }

    @Override
    /**
     * toString method.
     * @return name
     *
     * When the passenger object is printed, it defaults to the name
     */
    public String toString() {
        return name;
    }

    @Override
    /**
     * equals method.
     *
     * Two passengers are equal if they have the same ID
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Passenger passenger = (Passenger) obj;
        return Objects.equals(ID, passenger.ID);
    }

    @Override
    /**
     * hashCode method.
     *
     * @reutrn ID
     */
    public int hashCode() {
        return Objects.hash(ID);
    }
}