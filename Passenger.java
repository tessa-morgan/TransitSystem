import java.util.Objects;

public class Passenger {
    private String name;
    private int age;
    private int distance = 0;
    private double totalFare = 0;
    private static int currID = 0;
    private int ID = 0;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = currID++;
    }

    public void travel(int miles) {
        distance += miles;
    }

    public void disembark() {
        distance = 0;
    }

    public void payFare(double fare) {
        totalFare += fare;
        //System.out.println(name + " just paid $" + fare + " for a total of $" + totalFare);
    }

    public double getTotalFare() { return totalFare; }
    public int getDistance() { return distance; }
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Passenger passenger = (Passenger) obj;
        return Objects.equals(ID, passenger.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}