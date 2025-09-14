import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for(int i=0; i<5; i++) {
            System.out.print("Enter marks of student " + (i+1) + "= ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\n\nMarks of students = ");
        for(int m : marks) {
            System.out.println(m);
        }
    }    
}
