// ABSTRACTION+INHERITANCE
abstract class Flight {
    private String flightNumber, airline;
    protected double fare;
    public Flight(String flightNumber, String airline, double fare) {
        this.flightNumber = flightNumber; 
        this.airline = airline; 
        this.fare = fare;
    }
    public abstract void calculateFare();
    public String toString() {
        return ("\n\nFlight No: " + flightNumber + "\nAirline: " + airline + "\nFare: " + fare);
    }
}

class DomesticFlight extends Flight {
    public DomesticFlight(String no, String air, double f) { 
        super(no, air, f); 
        calculateFare(); 
    }
    public void calculateFare() { 
        fare = fare + fare * 0.10; 
    }
}

class InternationalFlight extends Flight {
    public InternationalFlight(String no, String air, double f) { 
        super(no, air, f); 
        calculateFare(); 
    }
    public void calculateFare() { 
        fare = fare + fare * 0.25; 
    }
}

public class Q2 {
    public static void main(String[] args) {
        Flight f1 = new DomesticFlight("AI202", "Air India", 5000);
        Flight f2 = new InternationalFlight("QF101", "Qantas", 20000);
        System.out.println(f1);
        System.out.println(f2);
    }
}
