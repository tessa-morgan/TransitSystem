// Interface for public transit vehicles

import java.util.ArrayList;

public interface PublicTransit {
    void boardPassengers(ArrayList<Passenger> newPassengers);
    void disembarkPassengers(ArrayList<Passenger> leavingPassengers);
    
    // Stamp coupling
    double calculateFare(Passenger p);
}