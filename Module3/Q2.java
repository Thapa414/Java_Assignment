// USER DEFINED EXCEPTION
import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    void registerStudent(int age) throws InvalidAgeException{
        if (age<17){
            throw new InvalidAgeException("Age must be above 17 for Registration!!!");
        }
        else{
            System.out.println("Registeration Successfull");
        }
    }

}
public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Student: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of Student: ");
        int age = sc.nextInt();

        Student s = new Student(name);
        try{
            s.registerStudent(age);
        }
        catch(Exception e){
            System.out.println("Exception: "+ e.getMessage());
        }
        sc.close();
    }
}