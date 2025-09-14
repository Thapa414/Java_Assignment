import java.util.Scanner;

class Student {
    String name;
    int marks;
    char grade;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    void displayStudent() {
        System.out.println("Name: " + name + " , Marks: " + marks + " , Grade: " + grade);
    }
}

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10]; 
        int count = 0; 
        int choice;

        do {
            System.out.println("\n\n\n=== Grade Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    if (count < students.length) {
                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();
                        int marks;
                        System.out.print("Enter marks (0-100): ");
                        marks = sc.nextInt();
                        students[count] = new Student(name, marks);
                        count++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Cannot add more students! Limit reached.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (int i = 0; i < count; i++) {
                            students[i].displayStudent();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].name.equalsIgnoreCase(searchName)) {
                            System.out.println("Student Found!");
                            students[i].displayStudent();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.println("\nExiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);
        sc.close();
    }
}
