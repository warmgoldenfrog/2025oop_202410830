package inheritance;

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}

class Course {
    String code;
    String name;
    Course(String c, String n) {
        this.code = c;
        this.name = n;
    }
    String getCode() {
        return code;
    }
    String getName() {
        return name;
    }
}

class OnlineCourse extends Course {
    public OnlineCourse(String c, String n) {
        super(c, n);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

class OfflineCourse extends Course {
    public OfflineCourse(String c, String n) {
        super(c, n);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }

}