// SYNCHRONIZATION OF THREADS
class TicketBooking{
    int availableSeats=5;
    synchronized void bookSeat(String name, int seats){
        if(seats<= availableSeats){
            System.out.println(name + " booked "+ seats + " seat successfully!!!");
            availableSeats-=seats;
        }
        else{
            System.out.println(name + " booking failed!!! Not enough seats!!!");
        }
    }
}
class User extends Thread{
    TicketBooking tb;
    int seats;
    String name;
    User(String name, int seats, TicketBooking tb){
        // super(name);
        this.name = name;
        this.seats = seats;
        this.tb = tb;
    }
    public void run() {
        // tb.bookSeat(getName(), seats);
        tb.bookSeat(name, seats);
    }
}

public class Q7{
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();
        User u1 = new User("Astha", 4, tb);
        User u2 = new User("Vinay",2,tb);

        u1.start();
        u2.start();
    }
}