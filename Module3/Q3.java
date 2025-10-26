// Handling Arithmetic and Array Index Exception (Multiple Catch)
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println();
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Enter Index: ");
        int index = sc.nextInt();
        System.out.println("Enter Divisor: ");
        int div = sc.nextInt();

        try{
            double result = (arr[index]/div);
            System.out.println("Result = "+result);
        }
        catch(ArithmeticException e){
            System.out.println("EXCEPTION: Division by Zero is not allowed!!!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("EXCEPTION: Index out of Range!!!");
        }
        finally{
            System.out.println("Operation Completed");
        }
        sc.close();
    }
}