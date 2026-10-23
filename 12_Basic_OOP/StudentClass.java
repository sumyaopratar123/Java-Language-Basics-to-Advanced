// Java beginner example
class Student {
    String name; int roll;
    Student(String name, int roll) { this.name = name; this.roll = roll; }
    void display() { System.out.println(name + " " + roll); }
}
public class StudentClass {
    public static void main(String[] args) {
        Student s = new Student("Asha", 1);
        s.display();
    }
}
