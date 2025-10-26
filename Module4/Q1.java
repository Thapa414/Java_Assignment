import java.util.*;

class Library{
    ArrayList<String> book = new ArrayList<>();

    void addBook(String title){
        book.add(title);
        System.out.println(title + " Book added Sucessfully!!!");
    }
    
    void removeBook(String title){
        if (book.remove(title)){
            System.out.println(title + " Book removed Sucessfully!!!");
        }
        else{
            System.out.println(" Book noy Found!!!");
        }
    }

    void displaybook(){
        if(book.isEmpty()){
            System.out.println("No books available!!!");
        }
        else{
            System.out.println("Available Books->");
            for (String i : book) {
                System.out.println(i);
            }
        }
    }
}

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lb = new Library();
        String title;
        while (true) {    
            System.out.println("\n\nMENU:-");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Book");
            System.out.println("4. Exit\n\n");
            System.out.println("Enter your choice = ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:System.out.println("\nEnter the Title of Book to be Added: ");
                    title = sc.nextLine();
                    lb.addBook(title);
                    break;
                case 2:System.out.println("\nEnter the Title of Book to remove: ");
                    title = sc.nextLine();
                    lb.removeBook(title);
                    break;
                case 3:lb.displaybook();
                    break;
                case 4:System.out.println("\nExiting1!!!!!!");
                    return;
                default:
                    System.out.println("\nInvalid Choice");
            }


        }
    }
}
