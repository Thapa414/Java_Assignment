import java.util.*;
class Inventory{
    HashMap<Integer, Integer> stock = new HashMap<>();
    void addProduct(int id,int qty){
        stock.put(id, qty);
        System.out.println("Stock with id = "+ id +" added with stock = "+qty);
    }
    void updateStock(int id, int qty){
        if (stock.containsKey(id)) {
            stock.put(id, qty);
            System.out.println("Stock with id = "+ id +" with updated stock = "+qty);
        } else {
            System.out.println("Product not found!!!");
        }
    }
    void displayInventory(){
        if (stock.isEmpty()) {
            System.out.println("No Stock available!!!");
        } 
        else {
            System.out.println("Stocks:-");
            Iterator<Map.Entry<Integer,Integer>> i = stock.entrySet().iterator();
            while(i.hasNext()){
                Map.Entry<Integer, Integer> entry = i.next();
                System.out.println("Product ID: " + entry.getKey() + ", Stock: " + entry.getValue());
        
            }
        }
    }
}
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        while (true) {
            System.out.println();
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.println("Enter your choice = ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Stock: ");
                    int qty = sc.nextInt();
                    inv.addProduct(id, qty);
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter New Stock: ");
                    int newQty = sc.nextInt();
                    inv.updateStock(pid, newQty);
                    break;
                case 3:
                    inv.displayInventory();
                    break;
                case 4:System.out.println("Exiting!!!!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}