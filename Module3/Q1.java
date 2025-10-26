import java.util.Scanner;
class ATM{
    double balance;
    ATM(double balance){
        this.balance = balance;
    }
    void withdraw(double amount) throws Exception{
        if (amount> balance){
            throw new Exception("INSUFFICIENT BALANCE");
        }
        else{
            balance-= amount;
            System.out.println("Withdrawl Successful!!!\nRemaining Balance = "+ balance);
        }
    }
}
public class Q1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance = ");
        double balance = sc.nextDouble();
        System.out.println("Enter your amount to Withdraw = ");
        double amount = sc.nextDouble();
        ATM atm = new ATM(balance);

        try{
            atm.withdraw(amount);
        }
        catch(Exception e){
            System.out.println("EXCEPTION: "+e.getMessage());
        }
        finally{
            System.out.println("Transaction Completed");
        }
        sc.close();

    }
}