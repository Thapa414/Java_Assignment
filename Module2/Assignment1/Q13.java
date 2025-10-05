// AGGREGATION
class Guest{
    String name, idProof;
    int age;
    Guest(String name, int age, String idProof){
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }
    public String toString(){
        return ("Name: "+name + " Age: "+ age + " ID Proof: "+ idProof + "\n");
    }
}

class Reservation{
    String reservationId, roomType;
    Guest[] guest;
    int count =0;
    Reservation(String reservationId,String roomType,int size){
        this.reservationId = reservationId;
        this.roomType = roomType;
        guest = new Guest[size];
    }
    public void addGuest(Guest g){
        guest[count]=g;
        count++;
    }
    public String toString(){
        String res=("Reservation ID: "+ reservationId + " Room: "+ roomType + "\nGuests:\n");
        for(int i = 0; i<count ; i++){
            res+=guest[i] + "\n";
        }
        return res;
    }
}

public class Q13{
    public static void main(String [] args){
        Reservation r = new Reservation("R101", "Deluxe", 3);
        r.addGuest(new Guest("Astha",21, "ID123")) ;
        r.addGuest(new Guest("Vinay",27, "ID456")) ;
        r.addGuest(new Guest("Arush",24, "ID789")) ;
       
        System.out.println(r);
    }
}