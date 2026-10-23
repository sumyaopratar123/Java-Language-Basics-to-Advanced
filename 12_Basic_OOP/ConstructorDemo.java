// Java beginner example
class Book {
    String title;
    Book(String title) { this.title = title; }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        System.out.println(b.title);
    }
}
