// ABSTRACTION + POLYMORPHISM
abstract class Loan {
    protected double principal; 
    protected int time;
    public Loan(double principal, int time) { 
        this.principal = principal; 
        this.time = time; 
    }
    public abstract double calculateInterest();
}

class HomeLoan extends Loan {
    public HomeLoan(double p, int t) { 
        super(p, t); 
    }
    public double calculateInterest() { 
        return (principal * 8 * time) / 100; 
    }
}

class CarLoan extends Loan {
    public CarLoan(double p, int t) { 
        super(p, t); 
    }
    public double calculateInterest() { 
        return (principal * 10 * time) / 100; 
    }
}

public class Q8 {
    public static void main(String[] args) {
        Loan l1 = new HomeLoan(500000, 8);
        Loan l2 = new CarLoan(300000, 5);
        System.out.println("Home Loan Interest: " + l1.calculateInterest());
        System.out.println("\n\nCar Loan Interest: " + l2.calculateInterest());
    }
}
