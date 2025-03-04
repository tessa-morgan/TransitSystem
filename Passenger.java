import java.util.Objects;

public class Passenger {
    private String name;
    private int age;
    private String ticketID;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        return Objects.equals(ticketID, passenger.ticketID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketID);
    }
}