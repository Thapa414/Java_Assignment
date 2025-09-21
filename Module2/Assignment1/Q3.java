// CONSTRUCTOR CHAINING + OVERRIDING
import java.util.Scanner;
class Employee{
    String empName, empId;
    double basicSalary;
    Employee(String empName, String empId, double basicSalary){
        this.empName = empName;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }
    double calculateSalary(){
        return basicSalary;
    }
    public String toString(){
        return ("\n\nEmployee Name = "+ empName + "\n Employee ID = "+ empId + " \nSalary = " + calculateSalary());
    }
}

class Manager extends Employee{
    // String Mname;
    double bonus;
    Manager(String empName, String empId, double basicSalary, double bonus){
        // this.Mname = Mname;
        super(empName,empId, basicSalary);
        this.bonus = bonus;
    }
    double calculateSalary(){
        return (basicSalary + bonus);
    }
    public String toString(){
        return ("\n\nManager Name = "+ empName + "\nEmployee ID = "+ empId + " \nSalary = " + calculateSalary());
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, empId;
        double basicSalary;
        System.out.println("\n\n\nEnter Employee details (Employee Name, Employee ID, Basic Salary) = ");
        name = sc.nextLine();
        empId = sc.nextLine();
        basicSalary = sc.nextDouble();
        sc.nextLine();
        
        Employee e1 = new Employee(name, empId, basicSalary);
        System.out.println(e1);
        
        String Mname, MempId;
        double MbasicSalary, bonus;
        System.out.println("Enter Manager's details (Manager Name, Manager ID, Basic Salary, Bonus) = ");
        Mname = sc.nextLine();
        MempId = sc.nextLine();
        MbasicSalary = sc.nextDouble();
        bonus = sc.nextDouble();

        Manager m1 = new Manager(Mname, MempId, MbasicSalary, bonus);
        System.out.println(m1);
    }
}
