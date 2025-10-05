// AGGREGATION
class Product{
    private String productName;
    private double price;
    private int quantity;
    Product(String productName, double price,int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotal(){
        return (price*quantity);
    }
    public String toString(){
        return (productName + " x"+ quantity + " = "+ getTotal());
    }
}

class Order{
    private String orderId;
    Product[] products;
    int count =0;
    Order(String orderId, int size){
        this.orderId = orderId;
        products = new Product[size];
    }
    public void addProduct(Product p){
        products[count]=p;
        count++;
    }
    public double calculateTotal(){
        double sum=0;
        for(int i=0;i<count;i++){
            sum += products[i].getTotal();
        }
        return sum;
    }
    public String toString(){
        String res= ("Order ID: "+ orderId + "\nPRODUCTS:\n");
        for(int i=0;i<count;i++){
            res+= (products[i] + "\n");
        }
        res+= ("Total: "+ calculateTotal());
        return res;
    }
}
public class Q4{
    public static void main(String[] args){
        Order o = new Order("ORD101",3);
        o.addProduct(new Product("Laptop",50000,1));
        o.addProduct(new Product("Mouse",500,2));
        o.addProduct(new Product("Keyboard",1500,1));
        System.out.println(o);
    }
}