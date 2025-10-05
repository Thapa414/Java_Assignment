// ONE TO ONE RELATIONSHIP
class Passport{
    String passportNo,issueDate, expiryDate;
    Passport(String passportNo, String issueDate, String expiryDate){
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }
    public String toString(){
        return (passportNo + " Issue: "+ issueDate + " Expiry: " + expiryDate);
    }
}
class Citizen{
    String name, address,dob;
    Passport passport;
    Citizen(String name,String dob, String address, Passport p){
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = p;
    }
    public String toString(){
        return ("Citizen: "+name + " DOB: " + dob + " Address: "+ address+ "\nPassport: "+ passport);
    }
}
public class Q15{
    public static void main(String[] args){
        Passport p = new Passport("P123456","01-01-2024","01-01-2030");
        Citizen c = new Citizen("Astha","04-01-2004", "Delhi",p);
        System.out.println(c);

    }
}