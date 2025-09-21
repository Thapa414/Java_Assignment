// MULTI LEVEL INHERITANCE
import java.util.Scanner;

class Person{
    public String name;
    public int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return ("Name: "+ name + "\nAge: "+age);
    }

}
class Doctor extends Person {
    public String specialization;
    Doctor(String name, int age, String specialization){
        super(name, age);
        this.specialization = specialization;
    }
    public String toString(){
        return ("Name: "+ name + "\nAge: "+age + "\nSpecialization: "+ specialization);
    } 
}
class Surgeon extends Doctor{
    public String surgeryType;
    Surgeon(String name, int age, String specialization,String surgeryType){
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }
    public String toString(){
        return ("Name: "+ name + "\nAge: "+age + "\nSpecialization: "+ specialization + "\nSurgery Type: " + surgeryType);

    }
}
class Q5{
    public static void main(String[] args) {
        String name, specialization, surgeryType;
        int age;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Details:(Name, age, Specialization, Surgery Type)");
        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        specialization = sc.nextLine();
        surgeryType = sc.nextLine();

        // Person P = new Person(name,age);
        // Doctor D = new Doctor(name, age, specialization);
        Surgeon S = new Surgeon(name, age, specialization, surgeryType);

        System.out.println("\n\n");
        System.out.println(S);
    }
}