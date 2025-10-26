// THREAD PRIORITIES

class BankTransaction extends Thread {
    int amount;

    BankTransaction(String name, int amount, int priority) {
        super(name);
        this.amount = amount;
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " processed transaction of ₹" + amount);
    }
}

public class Q10 {
    public static void main(String[] args) {
        BankTransaction t1 = new BankTransaction("Low-value transaction", 5000, Thread.MIN_PRIORITY);
        BankTransaction t2 = new BankTransaction("High-value transaction", 50000, Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
