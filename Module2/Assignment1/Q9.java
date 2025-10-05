// ASSOCIATION + INHERITANCE
class Course {
    String name, duration;
    public Course(String name, String duration) { 
        this.name = name; 
        this.duration = duration; 
    }
    public String toString() { 
        return (name + " (" + duration + ")"); 
    }
}

class Student {
    protected String name; 
    protected Course course;
    public Student(String name, Course c) { 
        this.name = name; 
        this.course = c; 
    }
    public String toString() { 
        return ("\nudent: " + name + " Course: " + course); 
    }
}

class PremiumStudent extends Student {
    private int discount;
    public PremiumStudent(String name, Course c, int discount) { 
        super(name, c); 
        this.discount = discount; 
    }
    public String toString() {
        return ("Premium Student"+ name + " Course: " + course + " Discount: " + discount + "%");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Course c = new Course("Java", "3 months");
        Student s1 = new Student("Arjun", c);
        Student s2 = new PremiumStudent("Meena", c, 20);
        System.out.println(s1);
        System.out.println(s2);
    }
}
