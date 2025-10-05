// ENCAPSULATION
class Account{
    String holderName, accNo;
    private double balance;
    Account(String accNo,String holderName){
        this.accNo = accNo;
        this.holderName = holderName;
    }
    public void deposit(double amt){
        balance += amt;
        System.out.println("Deposited= " + amt);
    }
    public void withdraw(double amt){
        if(amt<=balance){
            balance-= amt;
            System.out.println("Withdrawn= " + amt);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void getBalance(){
        System.out.println("Balance = "+ balance);
    }
}
public class Q14{
    public static void main(String[] args){
        Account a = new Account("A010100000897","Astha");
        a.deposit(50000);
        a.withdraw(30000);
        a.getBalance();
    }
}