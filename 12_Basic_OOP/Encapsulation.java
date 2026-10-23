// Java beginner example
class Person {
    private int age;
    void setAge(int age) { if (age >= 0) this.age = age; }
    int getAge() { return age; }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        System.out.println(p.getAge());
    }
}
