// INTERFACE + POLYMORPHISM
interface Device{
    void turnOn();
    void turnOff();
}

class Fan implements Device{
    public void turnOn(){
        System.out.println("Fan is now turned on");
    }
    public void turnOff(){
        System.out.println("Fan is now turned off");
    }
}

class Light implements Device{
    public void turnOn(){
        System.out.println("Light is now turned on");
    }
    public void turnOff(){
        System.out.println("Light is now turned off");
    }
}

public class Q10{
    public static void main(String[] args){
        Device d1 = new Fan();
        d1.turnOn();
        d1.turnOff();
        System.out.println();
        Device d2 = new Light();
        d2.turnOn();
        d2.turnOff();

    }
}