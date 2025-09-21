// ONE TO MANY RELATIONSHIP
import java.util.Scanner;
class Department{
    private String deptName;
    private String hodName;
    Professor Pf[] = new Professor[10];
    Department(String deptName, String hodName){
        this.deptName = deptName;
        this.hodName  = hodName;
    }
    int i = 0;
    void addProfessor(Professor P){
        Pf[i]=P;
        i++;
    }
    void display1(){
        System.out.println("\n\n\t\tDEPARTMENT NAME = "+deptName + "\nHOD name = "+hodName);
        for(int j=0;j<i;j++)
        {
            Pf[j].display2();
        }
    }
}

class Professor {
    private String Pname;
    private String empId;
    private String specialization;
    Professor(String Pname, String empId, String specialization){
        this.Pname = Pname;
        this.empId = empId;
        this.specialization = specialization;
    }
    void display2(){
        System.out.println("\nProfessor name = "+Pname + "\nEmployee ID = "+empId + "\nSpecialization = "+specialization);
    }
    
}
public class Q1 {
    public static void main(String[] args) {
        String deptName, hodName, Pname, empId, specialization;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Department name:");
        deptName = sc.nextLine();
        System.out.println("Enter HOD name:");
        hodName = sc.nextLine();
        
        Department d1 = new Department(deptName, hodName);
        
        System.out.println("Enter No. of Professors = ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Professor details(Professor name, employeeId, specialisation)");
        for(int i=0; i<n;i++){
            System.out.println("\nProfessor "+ (i+1) + " details:");
            Pname = sc.nextLine();
            empId = sc.nextLine();
            specialization = sc.nextLine();
            Professor P = new Professor(Pname, empId, specialization);
            d1.addProfessor(P);

        }
        d1.display1();


    }
    
}
