import java.util.*;

class CourseEnrollment {
    private LinkedHashSet<String> students = new LinkedHashSet<>();

    void enrollStudent(String name) {
        if (students.add(name)){
            System.out.println(name + " Enrolled: " );
        }
        else{
            System.out.println(name + " is already enrolled");
        }
    }

    void displayEnrolledStudents() {
        System.out.println("Enrolled Students: " + students);
    }
}

public class Q5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseEnrollment ce = new CourseEnrollment();
        while (true) {
            System.out.print("Enroll Student Name (or 'exit'): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")){
                break;
            }
            else{
                ce.enrollStudent(name);    
            }
        }
        ce.displayEnrolledStudents();
    }
}

