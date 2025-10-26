// MULTIPLE THREADS
import java.util.Scanner;

class PrinterJob implements Runnable{
    String name;
    int jobNumber;
    PrinterJob(String name, int jobNumber){
        this.name = name;
        this.jobNumber = jobNumber;
    }
    public void run() {
        try{
            System.out.println("Printing Job "+jobNumber + " by "+ name);
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("THREAD INTERRUPTED!!!");
        }
    }
}

public class Q8{
    public static void main(String[] args){
        Thread t1 = new Thread(new PrinterJob("Astha",1));
        Thread t2 = new Thread(new PrinterJob("Vinay",2));
        Thread t3 = new Thread(new PrinterJob("Shael",3));

        t1.start();
        t2.start();
        t3.start();
    }
}