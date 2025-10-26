//MINIMUM PURCHASE AMOUNT EXCEPTION
import java.util.Scanner;

class MinimumAmountException extends Exception{
    MinimumAmountException(String message){
        super(message);
    }
}

class OnlineShopping{
    void placeOrder(int amount) throws MinimumAmountException{
        if(amount<500){
            System.out.println("Minimum Cart Value should be 500!!!");
        }
        else{
            System.out.println("Order Placed Successfuly!!!");
        }
    }
}


public class Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount = ");
        int amount = sc.nextInt();
        OnlineShopping o = new OnlineShopping();
        try{
            o.placeOrder(amount);
        }
        catch(MinimumAmountException e){
            System.out.println("EXCEPTION: "+e.getMessage());
        }
        sc.close();
    }
}