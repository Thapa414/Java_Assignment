import java.util.*;
class BankDirectory{
    HashMap<Integer, String> account = new HashMap<>();
    void addAccount(int accNo, String name){
        account.put(accNo, name);
        System.out.println("Account Added Successfully!!!");
    }
    void getCustomer(int accNo){
        if(account.containsKey(accNo)){
            System.out.println("Account No = " + accNo + " of " + account.get(accNo));
        }
        else{
            System.out.println("Account not found!!!");
        }
    }
    void displayAll(){
        if (account.isEmpty()) {
            System.out.println("No Account present!!!");
        } 
        else {
            System.out.println("Account Present:- ");
            for (Map.Entry<Integer, String> entry : account.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}
public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDirectory bd = new BankDirectory();
        while (true) { 
            System.out.println();
            System.out.println("1. Add Account");
            System.out.println("2. Get Customer");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.println("Enter your choice = ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:System.out.print("Enter Account No: ");
                    int acc = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    bd.addAccount(acc, name);
                    break;
                case 2: System.out.print("Enter Account No: ");
                    bd.getCustomer(sc.nextInt());
                    break;       
                case 3:
                    bd.displayAll();
                    break;
                case 4:System.out.println("Exiting!!!!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }

        }
    }
}

