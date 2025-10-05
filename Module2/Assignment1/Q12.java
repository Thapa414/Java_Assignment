// INHERITANCE + OVERRIDING
class Vehicle{
    String regNo, brand;
    double baseRate;
    Vehicle(String regNo, String brand, double baseRate){
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }
    public double calculateCost(){
        return baseRate;
    }
}
class Car extends Vehicle{
    Car(String regNo, String brand, double baseRate){
        super(regNo, brand, baseRate);
    }
    public double calculateCost(){
        return (baseRate*1.5);
    }
    public String toString(){
        return ("Car "+ regNo +" "+ brand + " Rent: "+ calculateCost());
    }
}
class Bike extends Vehicle{
    Bike(String regNo, String brand, double baseRate){
        super(regNo, brand, baseRate);
    }
    public double calculateCost(){
        return (baseRate*1.2);
    }
    public String toString(){
        return ("Bike "+ regNo +" "+ brand + " Rent: "+ calculateCost());
    }
}
public class Q12{
    public static void main(String[] args){
        Vehicle v1 = new Car("KA01AA1234", "Toyota",1000);
        Vehicle v2 = new Bike("A05BB6789","Honda",500);
        
        System.out.println(v1);
        System.out.println(v2);

    }
}