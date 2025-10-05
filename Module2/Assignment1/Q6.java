// ONE-TO-ONE RELATIONSHIP
import java.util.Scanner;

class Author{
    String name, email;
    char gender;
    Author(String name,String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String toString(){
        return (name +"("+gender+") , Email: " +email);
    }
}
class Book{
    String title;
    Author author;
    int price;
    Book(String title, int price, Author author ){
        this.title = title;
        this.price = price;
        this.author = author;
    }
    public String toString(){
        return ("\nBook: "+title +"\nPrice: "+price +"\nAuthor: " + author);
    }
}
public class Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name, email, title;
        char gender;
        int price;

        System.out.println("Enter details: (Book title, Price, Author name, email, Gender)");
        title = sc.nextLine();
        price = sc.nextInt();
        sc.nextLine(); 
        name = sc.nextLine();
        email = sc.nextLine();
        gender = sc.next().charAt(0);

        Author a = new Author(name, email, gender);
        Book b = new Book(title, price, a);

        // System.out.println(a);
        System.out.println(b);
    }}