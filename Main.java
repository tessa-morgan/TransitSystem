import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Passenger alice = new Passenger("Alice", 25, 1);
        Passenger bob = new Passenger("Bob", 30, 2);
        Passenger charlie = new Passenger("Charlie", 28, 3);
        Passenger jane = new Passenger("Jane", 32, 4);
        Passenger gavin = new Passenger("Gavin", 19, 5);

        ArrayList<Passenger> group1 = new ArrayList<>();
        group1.add(alice);
        group1.add(bob);

        ArrayList<Passenger> group2 = new ArrayList<>();
        group2.add(charlie);

        Taxi myTaxi = new Taxi("Ford", "Crown Victoria", 2018, 4, gavin);
        myTaxi.boardPassengers(group1);
        myTaxi.drive(5);
        myTaxi.disembarkPassengers(group1);

        Bus cityBus = new Bus("Mercedes", "Sprinter", 2021, jane);
        cityBus.boardPassengers(group1);
        cityBus.boardPassengers(group2);
        cityBus.drive(3);
        cityBus.disembarkPassengers(group1);
        cityBus.disembarkPassengers(group2);
    }
}