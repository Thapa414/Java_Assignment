class Guest{
    String name, idProof;
    int age;
    Guest(String name, int age, String idProof){
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }
    public String toString(){
        return ("Name: "+name + " \nAge: "+ age + "\nID Proof: "+ idProof);
    }
}

class Reservation{
    String reservationId, roomType;
    int Guest[] guest;

}