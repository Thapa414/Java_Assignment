import java.util.Scanner;
abstract class Flight{
    private String flightNumber, airLine;
    double fare;
    
    Flight(String flightNumber, String airLine, double fare){
        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.fare = fare;
    }
    public abstract void calculateFare();

    public String toString(){
        return ("\nFlight Number = "+ flightNumber + "\nAirline = "+ airLine + "\nFare = "+ fare);
    }
}

class DomesticFlight extends Flight{
    DomesticFlight(String flightNumber, String airLine, double fare){
        super(flightNumber, airLine, fare);
        calculateFare();
    }
    public void calculateFare(){
        fare = (fare + (fare*0.10));
    }
}

class InternationalFlight extends Flight{
    InternationalFlight(String flightNumber, String airLine, double fare){
        super(flightNumber, airLine, fare);
        calculateFare();
    }
    public void calculateFare(){
        fare = (fare + (fare*0.25));
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flighttype, flightNumber, airline;
        double fare;
        char ch= 'y';
        do{
            System.out.println("\n\nEnter flight type(Domestic/International) , flight number, airline, fare");
            flighttype = sc.nextLine();
            flightNumber = sc.nextLine();
            airline = sc.nextLine();
            fare = sc.nextDouble();
            sc.nextLine();
    
            if(flighttype.equalsIgnoreCase("Domestic")){
                Flight f1 = new DomesticFlight(flightNumber, airline,fare);
                System.out.println(f1);
            }else{
                Flight f2 = new InternationalFlight(flightNumber, airline,fare);
                System.out.println(f2);
            }
            System.out.println("\nDo you want to calculate fare again(Y/N) = ");
            ch = sc.next().charAt(0);
        }while(ch=='y' || ch == 'Y');
    }
}
