import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double a = sc.nextInt();
        System.out.print("Enter number2: ");
        double b = sc.nextInt();

        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));
    }
}
