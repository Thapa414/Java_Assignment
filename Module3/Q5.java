// Null Pointer Handling
import java.util.Scanner;

class UniversityLogin{
    void login(String username){
        try{
            if(username != null){
                System.out.println("Login Successfull!!!\nWelcome "+username);
            }
        }
        catch(NullPointerException e){
            System.out.println("Exception: You entered a null value!!!");
        }
    }
}
public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = sc.nextLine();

        UniversityLogin u = new UniversityLogin();
        u.login(username);
        sc.close();
    }
}