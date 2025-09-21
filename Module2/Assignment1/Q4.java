class Product{
    private String productName;
    private double price, quantity;
    Product(String productName, double price,double quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public String toString(){
        return ("Product = "+ productName + "x"+ quantity);
    }
}

class Order{
    private String orderId;
    int Product[] products;
    
}