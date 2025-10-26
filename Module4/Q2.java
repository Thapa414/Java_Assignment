import java.util.*;
class Attendance{
    HashSet<String> student = new HashSet<>();
    void markAttendance(String name){
        if(student.add(name)){
            System.out.println(name + " marked Present!!!");
        }
        else{
            System.out.println(name + " is Already marked present!!!");
        }
    }
    void displayAttendance(){
        if (student.isEmpty()) {
            System.out.println("No Student Present!!!");
        } 
        else {
            System.out.println("Student Present!!!");
            for (String i : student) {
                System.out.println(i);
            }
        }
    }
}
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Attendance a = new Attendance();
        while (true) { 
            System.out.println("Enter name to mark attendance(or 'exit') = ");
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("exit")){
                break;
            }
            else{
                a.markAttendance(name);
            }
        }
        a.displayAttendance();
    }
}