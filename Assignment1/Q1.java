import java.util.Scanner;
class Q1{
    // Identifier naming practice
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int rollno, marks;
        System.out.println("Enter Name of the Student = ");
        name = sc.nextLine();
        System.out.println("Enter Roll No of the Student = ");
        rollno = sc.nextInt();
        System.out.println("Enter marks of the Student = ");
        marks = sc.nextInt();
        System.out.println("------------------------------\n\n");
        System.out.println("Name\tRollNo\tMarks");
        System.out.println(name+"\t"+rollno+"\t"+marks);
    }
}