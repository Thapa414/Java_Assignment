import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers = ");
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=1; i<10; i++) {
            if(arr[i] > max){
                max = arr[i];
            } 
        }
        System.out.println("\nMaximum value =  " + max);
    }
}
