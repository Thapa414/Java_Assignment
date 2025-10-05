// ONE TO ONE RELATIONSHIP
class Room{
    String block, type, roomNo;     //type= Single/Double
    Room(String roomNo, String block, String type){
        this.roomNo = roomNo;
        this.block = block;
        this.type = type;
    }
    public String toString(){
        return ("\nRoom: "+roomNo+ " Block- "+block + " " + type);
    }
}
class Student{
    String name, course;
    Room room;
    int roll;

    Student(String name, int roll, String course, Room room){
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }
    public String toString(){
        return ("Student: "+ name + " ("+roll+") " + course);
    }

}
public class Q11{
    public static void main(String[] args){

        Room r = new Room("A101", "B", "Single");
        Student s = new Student("Ravi",101, "CSE",r);
        System.out.println(s);
        System.out.println(r);
    }
}