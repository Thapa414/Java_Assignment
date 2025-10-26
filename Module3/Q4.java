// Input Validation
import java.util.Scanner;
class StudentMarks{
    void enterMarks(int marks) throws Exception{
        if(marks<0 || marks>100){
            System.out.println("Marks Out Of Range!!!");
        }
        else{
            System.out.println("Marks Entered Successfuly");
        }
    }
}
public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Student = ");
        int marks = sc.nextInt();

        StudentMarks s = new StudentMarks();

        try{
            s.enterMarks(marks);
        }
        catch(Exception e){
            System.out.println("Exception: "+ e.getMessage());
        }
        finally{
            System.out.println("Thank you!!!");
        }
        sc.close();
    }
}